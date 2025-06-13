%{
Andrew Hoffman
ELEN 3381
Assignment 8
20250331
%}

clc,clear;

% Coefficient matrix A and Constant vector b
A = [2 3 5; 7 11 13; 17 19 29];
b = [38; 101; 235];

% Gaussian elimination from Assignment 7
solution = A\b;

xg = solution(1);
yg = solution(2);
zg = solution(3);

fprintf('Gaussian:\nx = %.2f\ny = %.2f\nz = %.2f\n\n', xg, yg, zg);
x_gaussian = [xg; yg; zg]; % Corrected Gaussian result storage

% LU factorization
[L,U,P] = lu(A); % Included permutation matrix
y_lu = L\(P * b); % Forward substitution
x_lu = U\y_lu; % Backward substitution

fprintf('LU:\nx = %.2f\ny = %.2f\nz = %.2f\n\n', x_lu(1), x_lu(2), x_lu(3)); 

% Cholesky factorization (only for symmetric positive-definite matrices)
try
    R = chol(A' * A); % A' * A ensures positive-definiteness
    y = R'\(A' * b); % Forward substitution
    x_chol = R\y; % Backward substitution

    fprintf('Cholesky:\nx = %.2f\ny = %.2f\nz = %.2f\n\n', x_chol(1), x_chol(2), x_chol(3));
catch
    disp('Cholesky factorization is not applicable because the matrix is not symmetric positive-definite.');
end

% Compare the results
disp('Comparison with Gaussian elimination:');
if norm(x_lu - x_gaussian) < 1e-10
    disp('LU factorization result matches Gaussian elimination result.');
else
    disp('LU factorization result does not match Gaussian elimination result.');
end

if exist('x_chol', 'var') && norm(x_chol - x_gaussian) < 1e-10
    disp('Cholesky factorization result matches Gaussian elimination result.');
elseif exist('x_chol', 'var')
    disp('Cholesky factorization result does not match Gaussian elimination result.');
end

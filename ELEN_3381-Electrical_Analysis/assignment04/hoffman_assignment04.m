%{
Andrew Hoffman
ELEN 3381
Assignment 4
20250226
%}

clc,clear;

% init params
x = -20;
n = 60;
approx = 1;
true_val = exp(x);
error_vals = zeros(1, n);
approx_vals = zeros(1, n);

fprintf('Approx \t\t\tError\n')
% Calculate 
for i = 1:n
    approx = approx + (x^i) / factorial(i);
    approx_vals(i) = approx;
    error_vals(i) = abs(approx - true_val);

    % Output values
    fprintf('%.5f \t\t%.5f\n',approx_vals(i),error_vals(i));
end

% Plot
figure;
plot(1:n, approx_vals, 'g-o');
hold on;
plot(1:n, error_vals, 'b');

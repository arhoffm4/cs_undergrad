%{
Andrew Hoffman
ELEN 3381
Assignment 3
20250219

Implement MATLAB code that calculates the following formula. Use your
student ID as eight 1 digit data to be used for your calculation. 
(μ : average)

Var(X) = (1/n)*SUM((Xi - mu)^2)

Compare the result from your code with the result produced by MATLAB
function “var(X)”, where X contains the data.

Hypothesize the reason why they are different.

Modify your code (not MATLAB “var(X)”) and show the correctness of your
hypothesis.

Please submit:
1. Your MATLAB code that implements the above equation. (4 pts)
2. Copy of a screenshot after your program is executed. (1 pt)
3. Compare your result with the result produced by using MATLAB provided
function “var”. (1 pt)
4. Hypothesize the reason. Describe your hypothesis. (2 pts)
5. Verify the correctness of your hypothesis by modifying your MATLAB
code (not “var”). Show the result from the modified code. (2 pts)
%}

clc, clear;

% Student ID
sid = [2 0 5 3 6 9 6 4];

%  Manual calculation of the sample variance
avg = sum(sid)/length(sid);
var_man=0;
for i=1:length(sid)
    % sample size n
    var_man = var_man + 1/length(sid) * (sum(sid(i) - avg).^2); 
end

% MATLAB calculation of the variance
var_mat = var(sid);

%  Manual calculation of the population variance
avg = sum(sid)/length(sid);
var_pop=0;
for i=1:length(sid)
    % Bessel's correction n-1 for unbiased population variance
    var_pop = var_pop + 1/(length(sid)-1) * (sum(sid(i) - avg).^2); 
end


% Display the manual and MATLAB results
fprintf('Manual Sample Variance: %.4f\n', var_man);
fprintf('MATLAB Population Variance: %.4f\n', var_mat);
fprintf('Corrected Population Variance: %.4f\n', var_pop);

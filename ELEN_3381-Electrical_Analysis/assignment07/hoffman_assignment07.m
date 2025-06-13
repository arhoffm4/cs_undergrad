%{
Andrew Hoffman
ELEN 3381
Assignment 7
20250329
%}

clc,clear;


A = [2 3 5;7 11 13;17 19 29];
b = [38; 101; 235];

solution = A\b;

x = solution(1);
y = solution(2);
z = solution(3);

fprintf(['x = %.2f\ny = %.2f\nz = %.2f\n'], x, y, z);
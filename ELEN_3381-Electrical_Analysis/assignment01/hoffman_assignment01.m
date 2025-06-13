%{
Andrew Hoffman
ELEN 3381
Assignment 1
20250127
%}

clc, clear;

%(1) Generate a graph of the following equation. (4 pts)
% y = x4 – 6 * x2 

x = linspace(-3,3,20);
y = x.^4-6*x.^2;

% Figure 1 output
figure(1);
plot(x,y);


%(2) Generate a surface plot of the following equation. (6 pts)
% Z = sin(sqrt(X * X + Y * Y)) / (sqrt(X * X + Y * Y))

xg = linspace(-5,5,20);
[X,Y] = meshgrid(xg, xg);
Z = sin(sqrt(X.*X + Y.*Y + eps)) ./ (sqrt(X.*X + Y.*Y + eps));

% Figure 2 output
figure(2);
surf(X,Y,Z);

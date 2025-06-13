%{
Andrew Hoffman
ELEN 3381
Assignment 11
20250421
%}

clc, clear;

x = [1 2 3 4 5 6 7 8];
y = flip([2 0 5 3 6 9 6 4]);
% y  = flip([2 0 0 3 8 5 3 3])
xq = 1:0.001:8;
c1 = trapz(x,y);

% nearest neighbor
y_nearest = interp1(x,y,xq,'nearest');
c2 = trapz(xq,y_nearest);

% linear interpolation
y_linear = interp1(x,y,xq,'linear');
c3 = trapz(xq,y_linear);

% spline interpolation
y_spline = interp1(x,y,xq,'spline');
c4 = trapz(xq,y_spline);


fprintf('Simple Integration: %.3f\n', c1)
fprintf('Nearest Neighbor: %.3f\n', c2)
fprintf('Linear Interpolation: %.3f\n', c3)
fprintf('Spline Interpolation: %.3f\n', c4)

figure;
subplot(2,2,1); plot(x,y,'o-');title('Simple Integration');
subplot(2,2,2); plot(x,y,'o',xq,y_nearest,'k');title('Nearest Neighbor');
subplot(2,2,3); plot(x,y,'o',xq,y_linear,'k');title('Linear Interpolation');
subplot(2,2,4); plot(x,y,'o',xq,y_spline,'k');title('Spline Interpolation');


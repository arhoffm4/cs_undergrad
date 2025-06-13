%{
Andrew Hoffman
ELEN 3381
Assignment 10
20250414
%}

clc,clear;

x = 1:20;
y = [2 0 5 3 6 9 6 4 3 0 1 4 6 5 3 5 4 3 2 1];
xfit = linspace(0,20);

% linear
c1 = polyfit(x,y,1);

yfit = polyval(c1, xfit);
fprintf('c1: %f\t',c1);
fprintf(['\n'])
% quadratic
c2 = polyfit(x,y,2);
fprintf('c2: %f\t',c2);
fprintf(['\n'])
yfit2 = polyval(c2,xfit);

% cubic
c3 = polyfit(x,y,3);
fprintf('c3: %f\t',c3);
fprintf(['\n'])
yfit3 = polyval(c3,xfit);

% order 4
c4 = polyfit(x,y,4);
fprintf('c4: %f\t',c4);
fprintf(['\n'])
yfit4 = polyval(c4,xfit);

% order 5
c5 = polyfit(x,y,5);
fprintf('c5: %f\t',c5);
fprintf(['\n'])
yfit5 = polyval(c5,xfit);


figure;

hold on
% title('Polynomial Fit');
% xlabel('xfit');
% ylabel('yfit');
plot(x,y,['blo'])
plot(xfit,yfit,'b--');
plot(xfit,yfit2,'b-')
plot(xfit,yfit3,'r-')
plot(xfit,yfit4,'b-')
plot(xfit,yfit5,'g-')
legend('data','linear','quadratic','cubic','4 order','5 order')
hold off

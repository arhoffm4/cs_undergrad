
%{
Andrew Hoffman
ELEN 3381
Assignment 2
20250201
%}

clc, clear;

min=1; max=1;
target = input('Enter the number that you want cube root: ');
mid=0;
done = false;
arr = [];
delta = 0.00000001;

if target > 1
    max = target;
else
    min = target;
end

while ~done
    mid = (min + max) / 2;
    arr = [arr, mid];
    
    if abs(target - (mid^3)) < delta
        done = true;
    elseif (target - (mid^3)) > 0
        min = mid;
    else
        max = mid;
    end
end

disp(arr);
disp(['My Cube root of ', num2str(target), ' is ', num2str(mid)]);
disp(['MATLAB Cube root of ', num2str(target), ' is ', num2str(nthroot(target,3))]);

figure;
plot(arr);
% xlim([1 10]);
% ylim([1.25 1.5]);
% xlabel('Iterations');
% ylabel('Estimated Cube Root');
% title('Estimations of Cube Root');
% grid on;



% 
% x = 3;
% delta = 0.00000001;
% r(1) = 1;
% r(2) = 2;
% maxit = 25;
% i = 2;
% while abs(r(i-1)-r(i)) > delta && i < maxit
%     r(i+1) = 0.5*(r(i) + x/r(i));
%     i =i + 1;
% end
% 
% plot(r)
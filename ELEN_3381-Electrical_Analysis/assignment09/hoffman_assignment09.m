clc
clear all
R2=1:1:100;
Vout=zeros(100,1);
b=[10;0;0];
for i=1:100
    A=[40 -20 -20;-20 40+R2(i) -20;-20 -20 60];
    X=inv(A)*b;
    Vout(i)=20*(X(3)-X(2));
    fprintf('Vout at R2 = %.0f kOhm is %1.4f\n',i,Vout(i));
end
plot(R2,Vout)

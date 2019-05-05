function [J, grad] = costFunctionReg(theta, X, y, lambda)
%COSTFUNCTIONREG Compute cost and gradient for logistic regression with regularization
%   J = COSTFUNCTIONREG(theta, X, y, lambda) computes the cost of using
%   theta as the parameter for regularized logistic regression and the
%   gradient of the cost w.r.t. to the parameters. 

% Initialize some useful values
m = length(y); % number of training examples

% You need to return the following variables correctly 
J = 0;
grad = zeros(size(theta));

% ====================== YOUR CODE HERE ======================
% Instructions: Compute the cost of a particular choice of theta.
%               You should set J to the cost.
%               Compute the partial derivatives and set grad to the partial
%               derivatives of the cost w.r.t. each parameter in theta


%
K = zeros(size(theta)-1);
% J���������costFunction��Ĵ��ۺ�����ֵ%
% grad�����Ǿ���costFunction��ȸ��µľ���ֵ%

% Step1 ����Ҫ�Ѵ����X���󾭹�sigmoid��������ת��
A = sigmoid(X*theta);
% Step2 ��J(��) ��ס�Ӧ�1��ʼ���� ����Ҫ������Ӧ�2��ʼ֮����±���� 
% theta(2:1:size(theta)(1),:).^2 ->ʹ����ȡ�ڶ��е����һ��
J = sum(-y.*log(A)-(1-y).*log(1-A))/m + lambda/(2*m)*sum(theta(2:1:size(theta)(1),:).^2);
%  grad�����ǽ���һ���ݶ��½���Ľ������ ͬ�� ��1 �� ��j��2<=j<=size(theta))
%�Ԧ�1���е������
grad(1) = (X'(1,:)*(A-y))/m;
%�Ԧ�2����j j=size(theta)(1)

K = (X'(2:1:size(X')(1),:)*(A-y))/m;
V = K + lambda/m*theta(2:1:size(theta)(1),:);
grad = [grad(1);K];








% =============================================================

end

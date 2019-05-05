function g = sigmoid(z)
%SIGMOID Compute sigmoid function
%   g = SIGMOID(z) computes the sigmoid of z.

% You need to return the following variables correctly 
g = zeros(size(z));

% ====================== YOUR CODE HERE ======================
% Instructions: Compute the sigmoid of each value of z (z can be a matrix,
%               vector or scalar).
% z����Ŀ�����һ������ ���ص�g(ͨ��sigmoid�������ص�Ҫ��1/e^-z+1)Ҳ��һ������
g = exp(z)./(exp(z)+1);



% =============================================================

end

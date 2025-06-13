%{
Andrew Hoffman
ELEN 3381
Assignment 6
20250310
%}
clc,clear;

num_trials = 10e6;
num_tosses = 20;
outcomes = zeros(1, num_tosses + 1);

% Simulate trials
for i = 1:num_trials
  
    % Simulate 20 coin tosses (0=tails, 1=heads)
    tosses = rand(1, num_tosses) > 0.5; 
    
    % Count num_heads
    num_heads = sum(tosses);
    
    % Increment index
    outcomes(num_heads + 1) = outcomes(num_heads + 1) + 1;
end

% Display results
for i = 0:num_tosses
    fprintf('Heads: %d, Freq: %d \n', i, outcomes(i + 1));
end

% Normalize data
probabilities = outcomes / num_trials;

% Plot results
figure;
plot(0:num_tosses, probabilities,'LineWidth', 1);
xlabel('No. Heads');
ylabel('Probability');
hold on;

% Label outcomes
for i = 0:num_tosses
    label = sprintf('%d', outcomes(i + 1)); % Label with the frequency
    text(i, probabilities(i + 1), label, ...
        'VerticalAlignment', 'bottom', ...
        'HorizontalAlignment', 'left', 'FontSize', 6);
end
hold off;
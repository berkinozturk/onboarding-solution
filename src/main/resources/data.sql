TRUNCATE TABLE training_module RESTART IDENTITY CASCADE;
TRUNCATE TABLE task RESTART IDENTITY CASCADE;
TRUNCATE TABLE employee RESTART IDENTITY CASCADE;

INSERT INTO employee (first_name, last_name, email, phone, gender, date_of_birth, nationality, role, department, experience_level) VALUES
                                                                                                                                       -- IT Department
                                                                                                                                       ('John', 'Doe', 'john.doe@example.com', '+1234567890', 'Male', '1990-01-15', 'American', 'Software Engineer', 'IT', 2),
                                                                                                                                       ('Mike', 'Ross', 'mike.ross@example.com', '+1234567891', 'Male', '1993-06-10', 'Brazilian', 'Software Engineer', 'IT', 3),
                                                                                                                                       ('Laura', 'Hill', 'laura.hill@example.com', '+1234567892', 'Female', '1995-08-22', 'Canadian', 'DevOps Engineer', 'IT', 1),
                                                                                                                                       ('Daniel', 'Roberts', 'daniel.roberts@example.com', '+1234567893', 'Male', '1987-07-20', 'British', 'DevOps Engineer', 'IT', 3),
                                                                                                                                       ('Sophia', 'King', 'sophia.king@example.com', '+1234567894', 'Female', '1992-03-15', 'Australian', 'Data Scientist', 'IT', 4),
                                                                                                                                       ('Mark', 'Ruffalo', 'mark.ruffalo@example.com', '+1234567814', 'Male', '1987-05-19', 'German', 'Software Engineer', 'IT', 1),
                                                                                                                                       ('Megan', 'Fox', 'megan.fox@example.com', '+1234567810', 'Female', '1992-07-18', 'British', 'Project Manager', 'IT', 5),

                                                                                                                                       -- HR Department
                                                                                                                                       ('Jane', 'Smith', 'jane.smith@example.com', '+1234567895', 'Female', '1992-05-10', 'British', 'HR Specialist', 'HR', 1),
                                                                                                                                       ('Isabella', 'Harris', 'isabella.harris@example.com', '+1234567896', 'Female', '1991-01-05', 'British', 'HR Specialist', 'HR', 2),
                                                                                                                                       ('Emily', 'Clark', 'emily.clark@example.com', '+1234567897', 'Female', '1992-02-25', 'Australian', 'HR Manager', 'HR', 3),
                                                                                                                                       ('James', 'Taylor', 'james.taylor@example.com', '+1234567898', 'Male', '1991-03-21', 'Canadian', 'HR Manager', 'HR', 2),
                                                                                                                                       ('David', 'Moore', 'david.moore@example.com', '+1234567899', 'Male', '1990-07-18', 'German', 'HR Specialist', 'HR', 1),
                                                                                                                                       ('Robert', 'Downey', 'robert.downey@example.com', '+1234567811', 'Male', '1985-04-04', 'American', 'HR Specialist', 'HR', 3),
                                                                                                                                       ('Scarlett', 'Johansson', 'scarlett.johansson@example.com', '+1234567813', 'Female', '1990-11-22', 'Canadian', 'HR Manager', 'HR', 3),

                                                                                                                                       -- Marketing Department
                                                                                                                                       ('Bob', 'Johnson', 'bob.johnson@example.com', '+1234567800', 'Male', '1995-03-30', 'German', 'Marketing Specialist', 'Marketing', 3),
                                                                                                                                       ('Sophia', 'White', 'sophia.white@example.com', '+1234567801', 'Female', '1995-10-12', 'Canadian', 'Marketing Specialist', 'Marketing', 3),
                                                                                                                                       ('Alice', 'Brown', 'alice.brown@example.com', '+1234567802', 'Female', '1989-06-20', 'British', 'Social Media Manager', 'Marketing', 3),
                                                                                                                                       ('Oliver', 'King', 'oliver.king@example.com', '+1234567803', 'Male', '1990-01-25', 'American', 'Social Media Manager', 'Marketing', 1),
                                                                                                                                       ('Liam', 'Martin', 'liam.martin@example.com', '+1234567804', 'Male', '1994-08-14', 'German', 'Marketing Specialist', 'Marketing', 2),
                                                                                                                                       ('Chris', 'Evans', 'chris.evans@example.com', '+1234567812', 'Male', '1986-06-13', 'Australian', 'Marketing Specialist', 'Marketing', 2);





INSERT INTO task (name, description, department, role, required_experience_level) VALUES
                                                                                      -- IT Department Tasks

                                                                                      ('Code Review Best Practices', 'Learn how to conduct effective code reviews.', 'IT', 'Software Engineer', 2),
                                                                                      ('Deploy First Application', 'Deploy a test application to the company infrastructure.', 'IT', 'Software Engineer', 3),
                                                                                      ('DevOps Onboarding', 'Understand DevOps workflows and pipelines.', 'IT', 'DevOps Engineer', 1),
                                                                                      ('Cloud Infrastructure Deployment', 'Deploy resources to cloud infrastructure.', 'IT', 'DevOps Engineer', 3),
                                                                                      ('Data Pipeline Setup', 'Set up data pipelines for analytics.', 'IT', 'Data Scientist', 2),
                                                                                      ('Algorithm Optimization', 'Optimize algorithms for better performance.', 'IT', 'Data Scientist', 3),
                                                                                      ('Organize Meetings', 'Organize the meetings accordingly to the current projects.', 'IT', 'Project Manager', 1),
                                                                                      ('Network Monitoring Setup', 'Set up and monitor network infrastructure.', 'IT', 'DevOps Engineer', 2),
                                                                                      ('Software Optimization', 'Optimize the project structure.', 'IT', 'Software Engineer', 3),

                                                                                      -- HR Department Tasks

                                                                                      ('Employee Handbook Review', 'Review the employee handbook and policies.', 'HR', 'HR Specialist', 1),
                                                                                      ('Team Building Workshop', 'Participate in a team-building exercise.', 'HR', 'HR Specialist', 4),
                                                                                      ('Performance Management Training', 'Understand performance evaluation methods.', 'HR', 'HR Manager', 3),
                                                                                      ('Conflict Resolution Session', 'Learn about conflict resolution techniques.', 'HR', 'HR Manager', 3),
                                                                                      ('Diversity and Inclusion Initiatives', 'Participate in diversity and inclusion programs.', 'HR', 'HR Specialist', 2),
                                                                                      ('Employee Benefits Orientation', 'Learn about company benefits and perks.', 'HR', 'HR Specialist', 1),
                                                                                      ('Compliance Training', 'Complete mandatory compliance training.', 'HR', 'HR Specialist', 2),
                                                                                      ('Leadership Coaching', 'Participate in a leadership coaching session.', 'HR', 'HR Manager', 4),
                                                                                      ('HR Systems Overview', 'Learn to use HR management systems.', 'HR', 'HR Manager', 2),

                                                                                      -- Marketing Department Tasks
                                                                                      ('Social Media Account Setup', 'Set up and optimize social media accounts.', 'Marketing', 'Social Media Manager', 1),
                                                                                      ('Content Creation Workshop', 'Learn the basics of creating engaging content.', 'Marketing', 'Social Media Manager', 2),
                                                                                      ('SEO Keyword Research', 'Perform keyword research for SEO campaigns.', 'Marketing', 'Marketing Specialist', 2),
                                                                                      ('Brand Positioning Analysis', 'Analyze brand positioning in the market.', 'Marketing', 'Marketing Specialist', 3),
                                                                                      ('Marketing Campaign Execution', 'Execute a marketing campaign with the team.', 'Marketing', 'Marketing Specialist', 3),
                                                                                      ('Competitor Analysis', 'Analyze competitors and identify opportunities.', 'Marketing', 'Marketing Specialist', 2),
                                                                                      ('Customer Journey Mapping', 'Create a customer journey map.', 'Marketing', 'Marketing Specialist', 1),
                                                                                      ('Marketing Tools Overview', 'Learn to use marketing tools like Google Analytics.', 'Marketing', 'Marketing Specialist', 1),
                                                                                      ('Content Calendar Planning', 'Plan a content calendar for social media.', 'Marketing', 'Social Media Manager', 2),
                                                                                      ('Ad Campaign Optimization', 'Optimize ad campaigns for better performance.', 'Marketing', 'Marketing Specialist', 3);



INSERT INTO training_module (name, description, department, required_experience_level, role) VALUES
                                                                                                 -- IT Training Modules
                                                                                                 ('Introduction to Git', 'Learn the basics of version control with Git.', 'IT', 1, 'Software Engineer'),
                                                                                                 ('Advanced Java Programming', 'Master advanced Java programming techniques.', 'IT', 3, 'Software Engineer'),
                                                                                                 ('Introduction to Cloud Computing', 'Understand the basics of cloud computing.', 'IT', 1, 'DevOps Engineer'),
                                                                                                 ('Kubernetes Basics', 'Learn container orchestration with Kubernetes.', 'IT', 3, 'DevOps Engineer'),
                                                                                                 ('Data Cleaning Techniques', 'Learn techniques for cleaning raw data.', 'IT', 2, 'Data Scientist'),
                                                                                                 ('Machine Learning Basics', 'Understand the fundamentals of machine learning.', 'IT', 2, 'Data Scientist'),
                                                                                                 ('Cybersecurity Fundamentals', 'Learn the basics of cybersecurity practices.', 'IT', 1, 'Software Engineer'),
                                                                                                 ('Agile Software Development Techniques', 'Learn techniques for new agile software development.', 'IT', 4, 'Project Manager'),
                                                                                                 ('Python for Data Analysis', 'Learn Python libraries for data analysis.', 'IT', 2, 'Data Scientist'),
                                                                                                 ('Networking Fundamentals', 'Understand basic networking concepts.', 'IT', 1, 'Software Engineer'),

                                                                                                 -- HR Training Modules
                                                                                                 ('Workplace Etiquette', 'Learn proper workplace behavior and etiquette.', 'HR', 1, 'HR Specialist'),
                                                                                                 ('Diversity and Inclusion', 'Understand the importance of workplace diversity.', 'HR', 1, 'HR Specialist'),
                                                                                                 ('Advanced Recruitment Techniques', 'Learn advanced techniques for recruitment.', 'HR', 3, 'HR Manager'),
                                                                                                 ('Leadership Development', 'Develop skills for leading teams effectively.', 'HR', 4, 'HR Manager'),
                                                                                                 ('Conflict Resolution Strategies', 'Learn strategies for resolving workplace conflicts.', 'HR', 3, 'HR Manager'),
                                                                                                 ('Performance Appraisal Methods', 'Understand methods for appraising employee performance.', 'HR', 2, 'HR Manager'),
                                                                                                 ('HR Systems Training', 'Learn to use HR software systems.', 'HR', 2, 'HR Specialist'),
                                                                                                 ('Legal Compliance in HR', 'Understand legal compliance requirements for HR.', 'HR', 2, 'HR Specialist'),
                                                                                                 ('Workplace Safety Training', 'Learn safety protocols for the workplace.', 'HR', 1, 'HR Specialist'),
                                                                                                 ('Employee Engagement Strategies', 'Develop strategies for employee engagement.', 'HR', 3, 'HR Manager'),

                                                                                                 -- Marketing Training Modules
                                                                                                 ('Content Marketing Basics', 'Learn the basics of content marketing.', 'Marketing', 1, 'Social Media Manager'),
                                                                                                 ('SEO Advanced Techniques', 'Master advanced techniques for SEO.', 'Marketing', 3, 'Marketing Specialist'),
                                                                                                 ('Brand Strategy Fundamentals', 'Learn the basics of brand strategy.', 'Marketing', 2, 'Marketing Specialist'),
                                                                                                 ('Social Media Advertising', 'Learn how to run ads on social media platforms.', 'Marketing', 2, 'Social Media Manager'),
                                                                                                 ('Market Research Techniques', 'Understand how to conduct market research.', 'Marketing', 1, 'Marketing Specialist'),
                                                                                                 ('Customer Retention Strategies', 'Learn strategies to retain customers.', 'Marketing', 3, 'Marketing Specialist'),
                                                                                                 ('Google Ads Fundamentals', 'Understand how to use Google Ads effectively.', 'Marketing', 2, 'Marketing Specialist'),
                                                                                                 ('Email Marketing Essentials', 'Learn the basics of email marketing.', 'Marketing', 1, 'Marketing Specialist'),
                                                                                                 ('Campaign Analytics', 'Learn how to analyze marketing campaigns.', 'Marketing', 3, 'Marketing Specialist'),
                                                                                                 ('Video Content Creation', 'Learn to create engaging video content.', 'Marketing', 2, 'Social Media Manager');

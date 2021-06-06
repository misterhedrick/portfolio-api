    INSERT INTO language (id, value, icon) VALUES
    (1, 'Ajax', ''),
    (2, 'Angular', ''),
    (3, 'CSS(3)', ''),
    (4, 'HTML(5)', ''),
    (5, 'Java(8)', ''),
    (6, 'Javascript', ''),
    (7, 'Nativescript', ''),
    (8, '.Net Core', ''),
    (9, 'SQL', '');

    INSERT INTO achievement (id, description) VALUES
    (1, 'Lead Angular POC'),
    (2, 'Lead Raspberry Pi POC'),
    (3, 'Held multiple lunch and learns teaching IT dept basic Angular (150+ people)'),
    (4, 'Developed CMS for website'),
    (5, 'Migrate website from JSP to JSF'),
    (6, 'Migrated multiple applications from Green Screen (AS400) to Java / HTML');

    INSERT INTO experience (id, dates, title, employer) VALUES
    (1, 'June 2019 - Present', 'Software Engineer', 'CoreLogic'),
    (2, 'Sept 2017 - June 2019', 'Senior Front-End Developer', 'Old Dominion Freight Line'),
    (3, 'Feb 2012 - Sept 2017', 'Full Stack Developer', 'Old Dominion Freight Line'),
    (4, 'Mar 2010 - Feb 2012', 'Edi Specialist', 'Old Dominion Freight Line');

    INSERT INTO highlight (id, experience, description) VALUES
    (1, 1, 'Building responsive front ends using Angular connecting to .Net Core and Springboot Endpoints'),
    (2, 1, 'Building rest API’s using .Net Core and Springboot'),
    (3, 1, 'Leading a POC working with Raspberry Pi’s and creating Google Assistant Commands to learn Ping Pong'),
    (4, 2, 'Building responsive front ends using CSS Frameworks such as Foundation and Bootstrap'),
    (5, 2, 'Collaborated with diverse programming teams to prototype and solve complex business problems'),
    (6, 2, 'Created containerized Docker front end UIs'),
    (7, 2, 'Developed Angular Front-end for the application using Angular controllers, partial views and routers and services'),
    (8, 2, 'Created responsive user interfaces that engage customers across different devices and resolutions'),
    (9, 3,  'Designed and developed a web based toolset to create, review, and analyze freight shipments using J2EE'),
    (10, 3, 'Production support including analyzing and repairing defects'),
    (11, 3, 'Developed, tested, and designed software using Agile Scrum methodologies'),
    (12, 3, 'Helped transition external website from JSP/WebSphere to JSF/WebLogic'),
    (13, 3, 'Developed java functions for odmove.com and odfl.com Front-end'),
    (14, 4, 'Custom setups and mapping EDI Data'),
    (15, 4, 'Interact directly with customers for communications solutions'),
    (16, 4, 'Migrate all EDI setups over to Extol software' ||
     '');

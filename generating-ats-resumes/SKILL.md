---
name: generating-ats-resumes
description: Generates ATS-friendly resumes based on user input and job descriptions. Ensures formatting, keywords, and job title match criteria to pass applicant tracking systems.
---

# ATS-Friendly Resume Generator

## When to use this skill
- When the user asks to create or optimize a resume.
- When the user provides a job description and wants their resume tailored to it.
- When the user mentions making a resume "ATS-friendly" or passing an ATS (Applicant Tracking System).

## Workflow

1. **Information Gathering**: Collect user's current resume/experience and the target Job Description (JD).
2. **Keyword Extraction**: Identify critical skills, job titles, tools, and certifications from the JD.
3. **Drafting - Formatting**: Apply safe formatting rules (single column, standard headings, bullet points).
4. **Drafting - Content**:
    - Match job title closely.
    - Prioritize hard skills over soft skills.
    - Write quantified achievements using action verbs.
    - Ensure education matches JD requirements explicitly.
5. **Review against Checklist**: Use the built-in validation checklist before finalizing.
6. **Output Generation**: Provide the resume content and suggest the correct file naming convention.

## Instructions

When generating or optimizing the resume, strictly adhere to the following rules:

### 1. Keywords (The BIG one)
ATS compares resumes to the job description. Extensively use the exact wording from the job posting.
- Skills (e.g., Python, SQL, Project Management)
- Job titles (Data Analyst, HR Executive)
- Tools & software (SAP, Excel, Salesforce)
- Certifications (PMP, AWS, CPA)
*Tip: "Data Analysis" ≠ "Analyzing Data" to an ATS. Use exact matches.*

### 2. Job Title Match
Ensure the user's current or recent job title closely matches the target role.
- If JD asks for "Marketing Specialist" and current title is "Digital Marketing Executive", it's OK. "Creative Lead" is a weaker match. Adjust where ethically possible to align.

### 3. Skills Section (Hard Skills > Soft Skills)
ATS heavily prioritizes technical skills, tools, programming languages, and industry-specific skills. Put these first. Soft skills matter more to human recruiters later.

### 4. Work Experience (Relevance + Recency)
- Use reverse chronological order.
- Ensure consistency in employment and highlight recent experiences more than older roles.

### 5. Simple Formatting (No Fancy Stuff)
ATS struggles with complex layouts.
**DO NOT USE:**
- Tables
- Columns
- Graphics or Icons
- Text boxes
- Headers/footers
- Infographics

**SAFE FORMATTING:**
- Single column layout
- Standard headings (Experience, Skills, Education)
- Simple bullet points (● or –)

### 6. Education & Certifications
Ensure the degree level, field of study, and specific certifications requested in the JD are explicitly mentioned if the user possesses them.

### 7. Action Verbs + Metrics (for Ranking)
Use strong action verbs and numbers to quantify achievements.
- *Weak*: "Responsible for sales activities"
- *Strong*: "Increased sales by 32% using CRM automation"

### 8. File Name & Language
Advise the user to save the final document as: `FirstName_LastName_JobTitle.pdf`
Ensure the base language matches the job posting.

## Validation Checklist

Before presenting the final resume to the user, verify:
- [ ] Matched keywords from JD
- [ ] Used standard job titles
- [ ] Layout is simple (single column, no columns/tables)
- [ ] Skills section is strong and prioritizes hard skills
- [ ] Achievements are quantified with numbers/metrics
- [ ] No graphics, tables, or complex formatting

## Resources
- Use standard markdown for the output so the user can easily copy and paste it into a Word document or a clean text/PDF converter.

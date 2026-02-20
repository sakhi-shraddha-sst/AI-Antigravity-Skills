---
name: optimizing-resumes
description: Tailors existing resumes to match specific job descriptions. Use when the user provides a CV and a job posting to improve ATS compatibility and generate a downloadable, previewable resume.
---

# Optimizing Resumes

## When to use this skill
- When a user needs to customize their resume for a specific job application.
- When requested to build a "Resume Optimizer" or "ATS Matcher" tool.
- When the user provides a job description (JD) and a file (PDF/DOCX) or text resume.

## Workflow (Plan-Validate-Execute)
1.  **Extract Data**: Parse the Job Description for keywords and technical requirements.
2.  **Analyze Resume**: Identify gaps between the user's existing resume and the target JD.
3.  **Bootstrap UI**: 
    - [ ] Create a modern, split-pane HTML interface.
    - [ ] Implement a file upload component for documents.
    - [ ] Add a "Update Resume" button to trigger the AI optimization.
4.  **Optimization Engine**: 
    - [ ] Use LLM logic to rewrite bullet points for impact.
    - [ ] Inject industry-specific keywords found in the JD.
5.  **Deliver**: Render a live preview on the left and a "Download PDF" button on the right.

## Instructions
### 1. UI Design Principles
- Use **Glassmorphism** and a dark-mode palette for a premium feel.
- Layout: Left pane for the job description/original CV inputs, Right pane for the live optimized preview.
- Ensure the "Update Resume" button has a micro-animation (e.g., loading spinner) during the processing phase.

### 2. File Conversion
- Use `pdf-parse` or similar lightweight libraries in the scripts to handle document conversion to text.
- For the final download, use `html2pdf.js` or `jspdf` on the client side to generate the file.

### 3. Processing Logic
- The optimization should focus on **Action Verbs** and **Quantifiable Achievements**.
- Logic should prioritize matching the "Skills" and "Experience" sections to the top 5 requirements of the JD.

## Resources
- [Resume Optimizer App Template](resources/index.html)
- [Styling System](resources/style.css)
- [Optimization Script](scripts/process-resume.py)

---
name: standardizing-test-plans
description: Validates, corrects, and generates standardized software test plan documents based strictly on user-uploaded input. Use when a user provides a test plan for review, validation, or reorganization into a standard format.
---

# Standardizing Test Plans

This skill provides a rigorous framework for analyzing, correcting, and normalizing software test plan documents. It ensures that all test plans adhere to a high-quality, standardized format while maintaining absolute fidelity to the source information.

## When to use this skill

- A user uploads a draft or existing test plan for validation.
- You need to reorganize a loosely structured test document into a professional standard.
- You want to identify gaps or missing requirements in a test strategy.
- You need to generate a clean, final version of a test plan based on raw project notes.

## Workflow

To process a test plan, follow this **Plan-Analyze-Execute** sequence:

1.  **Ingestion & Mapping**: Read the uploaded document and map its contents to the standard sections in `resources/test_plan_template.md`.
2.  **Structural Validation**: Check if all 24 required sections from the template are present or represented.
3.  **Content Assessment**: Evaluate each section for clarity, completeness, and consistency.
4.  **Reporting**: Generate a Document Validation Assessment and a list of missing/unclear information.
5.  **Normalization**: Reorganize the original content into the standardized format.
6.  **Final Generation**: Produce the newly generated standardized test plan.

## Core Behavior & Instructions

### 1. Document Analysis
Analyze the document for:
- **Structural Correctness**: Does it follow a logical flow?
- **Completeness**: Are critical sections (Scope, Strategy, Exit Criteria) present?
- **Clarity**: Is the language professional, unambiguous, and actionable?
- **Adherence**: Compare against the standard test plan format defined in the template.

### 2. Correction & Reorganization
If the document is incomplete or poorly structured:
- **Reorganize**: Move existing information into the correct sections of the template.
- **Correct**: Improve grammar, professional tone, and clarity without changing the meaning.
- **Identify Gaps**: Explicitly list sections that are missing or data points that are unknown.
- **CRITICAL**: **DO NOT** invent, assume, or fabricate missing information. If a section is missing from the source, mark it as `[MISSING: Information not provided in source]`.

### 3. Operational Principles
- **Source of Truth**: The uploaded document is the primary and only source of truth.
- **Traceability**: Maintain a clear link between the source content and the generated output.
- **No Fabrication**: Never "guess" a project name, date, or specific technical detail if not in the source.
- **Deterministic Output**: Ensure that the same input consistently produces the same standardized output.

### 4. Deliverables
For every processed test plan, you MUST produce the following four sections in your final response:

#### A. Document Validation Assessment
A high-level summary of the original document's quality, structure, and adherence to standards.

#### B. List of Missing or Unclear Information
A precise list of gaps found in the source. Use this format:
- **Section [X]**: [Specific detail missing or why it's unclear]

#### C. Corrected / Normalized version of the original document
The user's original content, but fixed for typos, clarity, and reorganized into the standard section order.

#### D. Newly Generated Standardized Test Plan
A complete document using the Markdown structure from `resources/test_plan_template.md`, filled only with verified information.

## Resources
- [Standard Test Plan Template](resources/test_plan_template.md)

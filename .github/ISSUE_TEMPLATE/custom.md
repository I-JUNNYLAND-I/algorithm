name: Daily question
description: try to resolve& pull request !
title: "[{date}]: "
labels: ["❔ Question"]
assignees:
  - junnyJun
body:
  - type: markdown
    attributes:
      value: |
        Thanks for taking the time to fill out this bug report!
  - type: input
    id: contact
    attributes:
      label: Contact Details
      description: How can we get in touch with you if we need more info?
      placeholder: ex. email@example.com
    validations:
      required: false




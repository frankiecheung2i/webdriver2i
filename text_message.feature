Feature: Send a text message to a contact

Scenario: Send message to a contact
Given I open my messaging app
And I selected a contact
When I enter my message
And Hit send
Then My contact should receive my message
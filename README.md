# UC20: Exception Handling During Search Operations

## Drawback of UC19 Approach

In earlier use cases, the searching logic assumed that bogies already exist in the train formation.

However, in real systems:

- Users may try to search before adding any bogies.
- Empty data structures lead to meaningless searches.
- Processing should stop early instead of running invalid logic.

Without validation, the system might:

- Waste computation.
- Produce misleading output.
- Cause runtime errors later in the flow.

So the system must defend itself before searching.

This introduces the idea of **fail-fast behavior using exceptions**.

---

## Goal

Prevent search operations on an empty train by throwing an exception early.

---

## Actor

User

---

## Flow

1. User triggers a search operation.
2. System checks whether the bogie collection is empty.
3. If no bogies are available, the system throws an `IllegalStateException`.
4. The operation stops immediately.
5. User receives a meaningful error message.

---

## Key Concepts Used in UC20

### Defensive Programming
A coding approach where the system validates conditions before performing operations to avoid invalid execution paths.

### IllegalStateException
A runtime exception used when a method is invoked at an inappropriate time or state, such as searching when no data exists.

### Fail-Fast Principle
The idea of stopping execution as soon as an invalid condition is detected instead of letting the program continue incorrectly.

### State Validation
Ensures the train has bogies before attempting any search logic.

### Runtime Exception Handling
Demonstrates how Java handles unchecked exceptions during execution without forcing callers to catch them.

---

## Key Requirements

- Check whether the bogie collection is empty before searching.
- Use a conditional validation step.
- Throw `IllegalStateException` if no bogies exist.
- Provide a meaningful message to the user.
- Prevent further execution of the search logic.



## Key Benefits

- Prevents invalid operations early.
- Improves system reliability.
- Makes error handling explicit and readable.
- Introduces real-world defensive coding practices.
- Teaches students when and why to throw runtime exceptions.

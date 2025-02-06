# **CPU Scheduler Simulator**

A Java program to simulate an adaptive CPU scheduling algorithm called **FCAI Scheduling**. This simulator is designed to demonstrate how FCAI Scheduler handles process execution, optimize resource utilization, and resolve common challenges.

---


- **Detailed Outputs:**
  - Execution order of processes
  - Waiting time for each process
  - Turnaround time for each process
  - Average waiting time and turnaround time
  - Quantum updates for FCAI Scheduling
- **Graphical Representation:**
  - Visual timeline of process execution using Java Swing

---

## **How FCAI Scheduling Works**
- **FCAI Factor Calculation:**
Where:
- `V1 = last arrival time / 10`
- `V2 = max burst time / 10`
- **Quantum Allocation Rules:**
- Initial quantum is dynamic and unique for each process.
- If a process completes its quantum without finishing, its quantum increases by `Q + 2`.
- If a process is preempted, it retains unused quantum.

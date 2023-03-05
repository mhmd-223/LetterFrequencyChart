# Letter Frequency Chart

This is a Java class for generating a bar chart of letter frequencies in a text document.

## Usage

To use this class, create a new instance with the path to the text document as the argument:

```
LetterFrequencyChart chart = new LetterFrequencyChart("path/to/document.txt");

```

Then, call the `plotBarChart` method to generate the bar chart:

```
chart.plotBarChart();

```

## Example Output

```
A |=============================
B |=====================
C |==========================
D |=========================
E |=================================
F |===================
G |========================
H |============================
I |==================
J |
K |========
L |==================
M |======================
N |============================
O |=================
P |==========================
Q |===
R |===================
S |========================
T |==================================
U |===================
V |=================
W |===================
X |==
Y |================
Z |===

```

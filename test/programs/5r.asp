appl(label1)|-appl(label1).
:~appl(label1).
q(a):-appl(label1).
appl(label2)|-appl(label2):-p(a).
:~appl(label2),p(a).
q(b):-p(a),appl(label2).
appl(label3)|-appl(label3):-p(c).
:~appl(label3),p(c).
:-p(c),appl(label3).
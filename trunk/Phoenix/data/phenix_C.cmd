-- Sistema PHENIX
-- Edgar Mateus & Tiago Amaral
-- Março 2011
-----------------------------------------
-- Diagram C

!create Aluno1: Aluno
!create ES: Disciplina 	

-- Execucao Correcta
!openter ES efectuaInscricao(Aluno1)
!create AlunoInES:Inscricao between (Aluno1,ES)
!opexit 

-- Violacao de Pre-Condicoes
!openter ES efectuaInscricao(Aluno1)

-- Violacao de Pos-Condicoes
!destroy AlunoInES
!openter ES efectuaInscricao(Aluno1)
!opexit

-- Done
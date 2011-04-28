-- Sistema PHENIX
-- Edgar Mateus & Tiago Amaral
-- Março 2011
-----------------------------------------
-- Diagram B

-- Datas
--!create now : CalendarDate
--!set now.day := 27
--!set now.month := 2
--!set now.year := 2011

--!create A1Date : CalendarDate
--!set A1Date.day := 31
--!set A1Date.month := 7
--!set A1Date.year := 1990
--!set A1Date.now := now

--!create Prof1Date : CalendarDate
--!set Prof1Date.day := 1
--!set Prof1Date.month := 1
--!set Prof1Date.year := 1970
--!set Prof1Date.now := now

--!create A1InEsDate : CalendarDate
--!set A1InEsDate.day := 1
--!set A1InEsDate.month := 9
--!set A1InEsDate.year := 2010
--!set A1InEsDate.now := now

--!create A1InEsResDate : CalendarDate
--!set A1InEsResDate.day := 20
--!set A1InEsResDate.month := 1
--!set A1InEsResDate.year := 2011
-!set A1InEsResDate.now := now
------------------------------------------------------

!create A1 : Aluno
!set A1.nome := 'Aluno 1'
!set A1.email := 'a1@iscte.pt'
--!set A1.dataNascimento := A1Date
!set A1.numero := 1

!create ES : Disciplina
!set ES.nome := 'Engenharia de Software'

!create ES2 : Disciplina
!set ES2.nome := 'Engenharia de Software 2'

!insert (ES,ES2) into Disciplina_Disciplina

!create A1InEs : Inscricao between (A1, ES)
--!set A1InEs.dataInscricao := A1InEsDate
!set A1InEs.resultado := 15
--!set A1InEs.dataResultado := A1InEsResDate

!create A2InEs: Inscricao between (A1, ES2)
--!set A2InEs.dataInscricao := A1InEsResDate

!create lei : Curso
!set lei.nome := 'Engenharia Informatica'
!set lei.numerusClausus := 60

!create lei3 : Perfil
!set lei3.nome := '3º Ano Engenharia Informática'

!create ofES:Oferta between (ES,lei3)
!set ofES.ects := 6
!insert (lei,lei3) into Curso_Perfil

!create mA1:Matricula between (A1,lei3)
!set mA1.paga := false

!create prof1: Professor
!set prof1.nome := 'Professor 1'
!set prof1.email := 'prof1@iscte.pt'
--!set prof1.dataNascimento := Prof1Date
--!set prof1.nivel := Categoria::assistente
--!set prof1.grau := GrauAcademico::agregado

!insert (prof1,ES) into Professor_Docencia
!insert (prof1,ES) into Professor_Regencia
!insert (prof1,ES2) into Professor_Docencia
!insert (prof1,ES2) into Professor_Regencia
!insert (lei, prof1) into Curso_Erasmus
!insert (lei, prof1) into Curso_Coordenacao	

!create DCTI: Departamento
!set DCTI.nome := 'DCTI'

!create s1: Seccao
!set s1.nome := 'Seccao 1'

!insert (DCTI, s1) into Departamento_Seccao
!insert (prof1, s1) into Professor_Seccao

!create computacional: AreaCientifica
!set computacional.nome := 'Computacional'
!insert (ES, computacional) into Disciplina_AreaCientifica
!insert (ES2, computacional) into Disciplina_AreaCientifica

check
-- Done
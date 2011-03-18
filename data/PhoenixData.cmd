reset
-------------------------------------------------------------------
!create DEE : Departamento
!set DEE.nome := 'Departamento de Engenharia Electrotécnica'

!create EME : Seccao
!set EME.nome := 'Electrotécnica e Máquinas Eléctricas'
!insert (DEE,EME) into Departamento_Seccao

!create DC : Seccao
!set DC.nome := 'Decisão e Controlo'
!insert (DEE,DC) into Departamento_Seccao

!create SDP : Seccao
!set SDP.nome := 'Sistemas Digitais e Percepcionais'
!insert (DEE,SDP) into Departamento_Seccao

!create RMI : Seccao
!set RMI.nome := 'Robótica e Manufactura Integrada'
!insert (DEE,RMI) into Departamento_Seccao

!create E : Seccao
!set E.nome := 'Electrónica'
!insert (DEE,E) into Departamento_Seccao

!create T : Seccao
!set T.nome := 'Telecomunicações'
!insert (DEE,T) into Departamento_Seccao

----------------------------------------------------
!create DI : Departamento
!set DI.nome := 'Departamento de Informática'

!create CTP : Seccao
!set CTP.nome := 'Ciência e Tecnologia da Programação'
!insert (DI,CTP) into Departamento_Seccao

!create SSDI : Seccao
!set SSDI.nome := 'Sistemas Simbólicos, de Decisão, e de Informação'
!insert (DI,SSDI) into Departamento_Seccao

!create ASC : Seccao
!set ASC.nome := 'Arquitectura de Sistemas Computacionais'
!insert (DI,ASC) into Departamento_Seccao
-------------------------------------------------------------------------
!create ventim : Professor
!set ventim.nome := 'Mário Ventim Neves'
!set ventim.grau := #doutor
!set ventim.nivel := #profAuxiliar
!set ventim.gabinete := 'Ed. X - Sala 2.16'
!set ventim.extensao := 11909
!set ventim.email := 'ventim@uninova.pt'
!insert (ventim,EME) into Professor_Seccao

!create jmmp : Professor
!set jmmp.nome := 'João Murta Pina'
!set jmmp.grau := #mestre
!set jmmp.nivel := #assistente
!set jmmp.gabinete := 'Ed. X - Sala 2.15'
!set jmmp.extensao := 11948
!set jmmp.email := 'jmmp@fct.unl.pt'
!insert (jmmp,EME) into Professor_Seccao

!create amg1 : Professor
!set amg1.nome := 'Anabela Gonçalves'
!set amg1.grau := #mestre
!set amg1.nivel := #assistente
!set amg1.gabinete := 'Ed. X - Sala 2.15'
!set amg1.extensao := 11908
!set amg1.email := 'amg1@mail.fct.unl.pt'
!insert (amg1,EME) into Professor_Seccao

!create ssv : Professor
!set ssv.nome := 'Stanimir Valtchev'
!set ssv.grau := #doutor
!set ssv.nivel := #profAuxiliar
!set ssv.gabinete := 'Ed. X - Sala 2.14'
!set ssv.extensao := 11937
!set ssv.email := 'ssv@fct.unl.pt'
!insert (ssv,EME) into Professor_Seccao

!create jf_martins : Professor
!set jf_martins.nome := 'João Francisco Martins'
!set jf_martins.grau := #doutor
!set jf_martins.nivel := #profAuxiliar
!set jf_martins.gabinete := 'Ed. X - Sala 3.23'
!set jf_martins.email := 'jf.martins@fct.unl.pt'
!insert (jf_martins,EME) into Professor_Seccao

!create pmrp : Professor
!set pmrp.nome := 'Pedro Miguel Ribeiro Pereira'
!set pmrp.grau := #mestre
!set pmrp.nivel := #assistente
!set pmrp.gabinete := 'Ed. X - Sala 2.14'
!set pmrp.extensao := 11938
!set pmrp.email := 'pmrp@fct.unl.pt'
!insert (pmrp,EME) into Professor_Seccao

!create jcc : Professor
!set jcc.nome := 'José Alberto Cardoso e Cunha'
!set jcc.grau := #agregado
!set jcc.nivel := #profCatedratico
!set jcc.gabinete := 'P2/8'
!set jcc.extensao := 10706
!set jcc.email := 'jcc@di.fct.unl.pt'
!insert (jcc,ASC) into Professor_Seccao

!create jalm : Professor
!set jalm.nome := 'José Augusto Legatheaux Martins'
!set jalm.grau := #agregado
!set jalm.nivel := #profCatedratico
!set jalm.gabinete := 'P2/7'
!set jalm.extensao := 10725
!set jalm.email := 'j.legatheaux.martins@di.fct.unl.pt'
!insert (jalm,ASC) into Professor_Seccao

!create lm : Professor
!set lm.nome := 'Luís Fernando Lopes Monteiro'
!set lm.grau := #agregado
!set lm.nivel := #profCatedratico
!set lm.gabinete := 'P2/10'
!set lm.extensao := 10715
!set lm.email := 'lm@di.fct.unl.pt'
!insert (lm,CTP) into Professor_Seccao

!create pb : Professor
!set pb.nome := 'Pedro Manuel Corrêa Calvente Barahona'
!set pb.grau := #agregado
!set pb.nivel := #profCatedratico
!set pb.gabinete := 'P2/14'
!set pb.extensao := 10728
!set pb.email := 'pb@di.fct.unl.pt'
!insert (pb,SSDI) into Professor_Seccao

!create jja : Professor
!set jja.nome := 'José Júlio Alferes'
!set jja.grau := #agregado
!set jja.nivel := #profAssociado
!set jja.gabinete := '247'
!set jja.extensao := 10748
!set jja.email := 'jja@di.fct.unl.pt'
!insert (jja,SSDI) into Professor_Seccao

!create lcaires : Professor
!set lcaires.nome := 'Luís Manuel Marques da Costa Caires'
!set lcaires.grau := #agregado
!set lcaires.nivel := #profAssociado
!set lcaires.gabinete := 'P3/8'
!set lcaires.extensao := 10705
!set lcaires.email := 'luis.caires@di.fct.unl.pt'
!insert (lcaires,CTP) into Professor_Seccao

!create nmc : Professor
!set nmc.nome := 'Nuno Manuel Robalo Correia'
!set nmc.grau := #agregado
!set nmc.nivel := #profAssociado
!set nmc.gabinete := 'P3/11'
!set nmc.extensao := 10707
!set nmc.email := 'nmc@di.fct.unl.pt'
!insert (nmc,CTP) into Professor_Seccao

!create amm : Professor
!set amm.nome := 'Ana Maria Dinis Moreira'
!set amm.grau := #doutor
!set amm.nivel := #profAssociado
!set amm.gabinete := 'P2/2'
!set amm.extensao := 10716
!set amm.email := 'amm@di.fct.unl.pt'
!insert (amm,CTP) into Professor_Seccao

!create cd : Professor
!set cd.nome := 'Carlos Augusto Isaac Piló Viegas Damásio'
!set cd.grau := #doutor
!set cd.nivel := #profAssociado
!set cd.gabinete := 'P2/12'
!set cd.extensao := 10758
!set cd.email := 'cd@di.fct.unl.pt'
!insert (cd,SSDI) into Professor_Seccao

!create ps : Professor
!set ps.nome := 'Manuel João Toscano Próspero dos Santos'
!set ps.grau := #doutor
!set ps.nivel := #profAssociado
!set ps.gabinete := 'P3/7'
!set ps.extensao := 10710
!set ps.email := 'ps@di.fct.unl.pt'
!insert (ps,CTP) into Professor_Seccao

!create pm : Professor
!set pm.nome := 'Pedro Abílio Duarte de Medeiros'
!set pm.grau := #doutor
!set pm.nivel := #profAssociado
!set pm.gabinete := 'P3/9'
!set pm.extensao := 10738
!set pm.email := 'pm@di.fct.unl.pt'
!insert (pm,ASC) into Professor_Seccao

!create fba : Professor
!set fba.nome := 'Fernando Manuel P. C. Brito e Abreu'
!set fba.grau := #doutor
!set fba.nivel := #profAuxiliar
!set fba.gabinete := 'P3/11'
!set fba.extensao := 10750
!set fba.email := 'fba@di.fct.unl.pt'
!insert (fba,CTP) into Professor_Seccao

!create alopes : Professor
!set alopes.nome := 'Adriano Martins Lopes'
!set alopes.grau := #doutor
!set alopes.nivel := #profAuxiliar
!set alopes.gabinete := 'P3/2'
!set alopes.extensao := 10745
!set alopes.email := 'alopes@di.fct.unl.pt'
!insert (alopes, CTP) into Professor_Seccao

!create aravara : Professor
!set aravara.nome := 'António Maria Lobo César Alarcão Ravara'
!set aravara.grau := #doutor
!set aravara.nivel := #profAuxiliar
!set aravara.gabinete := '249'
!set aravara.extensao := 10779
!set aravara.email := 'aravara@di.fct.unl.pt'
!insert (aravara, CTP) into Professor_Seccao

!create amd : Professor
!set amd.nome := 'Artur Miguel Andrade Vieira Dias'
!set amd.grau := #doutor
!set amd.nivel := #profAuxiliar
!set amd.gabinete := 'P2/13'
!set amd.extensao := 10704
!set amd.email := 'amd@di.fct.unl.pt'
!insert (amd, CTP) into Professor_Seccao

!create cf : Professor
!set cf.nome := 'Carla Maria Gonçalves Ferreira'
!set cf.grau := #doutor
!set cf.nivel := #profAuxiliar
!set cf.gabinete := 'P2/3'
!set cf.extensao := 10705
!set cf.email := 'cf@di.fct.unl.pt'
!insert (cf, CTP) into Professor_Seccao

!create cpm : Professor
!set cpm.nome := 'Carmen Pires Morgado'
!set cpm.grau := #doutor
!set cpm.nivel := #profAuxiliar
!set cpm.gabinete := '243'
!set cpm.extensao := 10763
!set cpm.email := 'cpm@di.fct.unl.pt'
!insert (cpm, ASC) into Professor_Seccao

!create fb : Professor
!set fb.nome := 'Fernanda Maria Barquinha Tavares Vieira Barbosa'
!set fb.grau := #doutor
!set fb.nivel := #profAuxiliar
!set fb.gabinete := 'P2/15'
!set fb.extensao := 10735
!set fb.email := 'fb@di.fct.unl.pt'
!insert (fb, CTP) into Professor_Seccao

!create fpb : Professor
!set fpb.nome := 'Fernando Pedro Reino da Silva Birra'
!set fpb.grau := #doutor
!set fpb.nivel := #profAuxiliar
!set fpb.gabinete := '245'
!set fpb.extensao := 10734
!set fpb.email := 'fpb@di.fct.unl.pt'
!insert (fpb, CTP) into Professor_Seccao

!create fa : Professor
!set fa.nome := 'Francisco de Moura e Castro Ascensão de Azevedo'
!set fa.grau := #doutor
!set fa.nivel := #profAuxiliar
!set fa.gabinete := 'P2/1'
!set fa.extensao := 10730
!set fa.email := 'fa@di.fct.unl.pt'
!insert (fa, SSDI) into Professor_Seccao

!create hjd : Professor
!set hjd.nome := 'Henrique João Lopes Domingos'
!set hjd.grau := #doutor
!set hjd.nivel := #profAuxiliar
!set hjd.gabinete := 'P2/6'
!set hjd.extensao := 10727
!set hjd.email := 'hjd@di.fct.unl.pt'
!insert (hjd, ASC) into Professor_Seccao

!create herve : Professor
!set herve.nome := 'Hervé Miguel Cordeiro Paulino'
!set herve.grau := #doutor
!set herve.nivel := #profAuxiliar
!set herve.gabinete := '243'
!set herve.extensao := 10763
!set herve.email := 'herve@di.fct.unl.pt'
!insert (herve, ASC) into Professor_Seccao

!create jleite : Professor
!set jleite.nome := 'João Alexandre Carvalho Pinheiro Leite'
!set jleite.grau := #doutor
!set jleite.nivel := #profAuxiliar
!set jleite.gabinete := '252'
!set jleite.extensao := 10756
!set jleite.email := 'jleite@di.fct.unl.pt'
!insert (jleite, SSDI) into Professor_Seccao

!create ja : Professor
!set ja.nome := 'João Baptista da Silva Araújo Junior'
!set ja.grau := #doutor
!set ja.nivel := #profAuxiliar
!set ja.gabinete := 'P2/2'
!set ja.extensao := 10747
!set ja.email := 'ja@di.fct.unl.pt'
!insert (ja, CTP) into Professor_Seccao

!create jmp : Professor
!set jmp.nome := 'João Carlos Gomes Moura Pires'
!set jmp.grau := #doutor
!set jmp.nivel := #profAuxiliar
!set jmp.gabinete := 'P3/2'
!set jmp.extensao := 10746
!set jmp.email := 'jmp@di.fct.unl.pt'
!insert (jmp, SSDI) into Professor_Seccao

!create jml : Professor
!set jml.nome := 'João Manuel Santos Lourenço'
!set jml.grau := #doutor
!set jml.nivel := #profAuxiliar
!set jml.gabinete := 'P2/9'
!set jml.extensao := 10740
!set jml.email := 'jml@di.fct.unl.pt'
!insert (jml, ASC) into Professor_Seccao

!create jcs : Professor
!set jcs.nome := 'João Ricardo Viegas da Costa Seco'
!set jcs.grau := #doutor
!set jcs.nivel := #profAuxiliar
!set jcs.gabinete := 'P2/13'
!set jcs.extensao := 10752
!set jcs.email := 'jcs@di.fct.unl.pt'
!insert (jcs, CTP) into Professor_Seccao

!create jfs : Professor
!set jfs.nome := 'Joaquim Francisco Ferreira da Silva'
!set jfs.grau := #doutor
!set jfs.nivel := #profAuxiliar
!set jfs.gabinete := 'P3/6'
!set jfs.extensao := 10732
!set jfs.email := 'jfs@di.fct.unl.pt'
!insert (jfs, SSDI) into Professor_Seccao

!create jc : Professor
!set jc.nome := 'Jorge Carlos Ferreira Rodrigues da Cruz'
!set jc.grau := #doutor
!set jc.nivel := #profAuxiliar
!set jc.gabinete := 'P2/1'
!set jc.extensao := 10742
!set jc.email := 'jc@di.fct.unl.pt'
!insert (jc, SSDI) into Professor_Seccao

!create ludi : Professor
!set ludi.nome := 'Ludwig Krippahl'
!set ludi.grau := #doutor
!set ludi.nivel := #profAuxiliar
!set ludi.gabinete := '241'
!set ludi.extensao := 10765
!set ludi.email := 'ludi@di.fct.unl.pt'
!insert (ludi, SSDI) into Professor_Seccao

!create lsr : Professor
!set lsr.nome := 'Luís Manuel Silveira Russo'
!set lsr.grau := #doutor
!set lsr.nivel := #profAuxiliar
!set lsr.gabinete := 'P2/16'
!set lsr.extensao := 10783
!set lsr.email := 'lsr@di.fct.unl.pt'
!insert (lsr, CTP) into Professor_Seccao

!create mm : Professor
!set mm.nome := 'Margarida Paula Neves Mamede'
!set mm.grau := #doutor
!set mm.nivel := #profAuxiliar
!set mm.gabinete := 'P2/15'
!set mm.extensao := 10724
!set mm.email := 'mm@di.fct.unl.pt'
!insert (mm, CTP) into Professor_Seccao

!create arodrigues : Professor
!set arodrigues.nome := 'Maria Armanda S. Rodrigues Grueau'
!set arodrigues.grau := #doutor
!set arodrigues.nivel := #profAuxiliar
!set arodrigues.gabinete := 'P2/17'
!set arodrigues.extensao := 10731
!set arodrigues.email := 'arodrigues@di.fct.unl.pt'
!insert (arodrigues, CTP) into Professor_Seccao

!create mcg : Professor
!set mcg.nome := 'Maria Cecília Farias Lorga Gomes'
!set mcg.grau := #doutor
!set mcg.nivel := #profAuxiliar
!set mcg.gabinete := 'P2/11'
!set mcg.extensao := 10749
!set mcg.email := 'mcg@di.fct.unl.pt'
!insert (mcg, ASC) into Professor_Seccao

!create mg : Professor
!set mg.nome := 'Miguel Carlos Pacheco Afonso Goulão'
!set mg.grau := #doutor
!set mg.nivel := #profAuxiliar
!set mg.gabinete := 'P2/17'
!set mg.extensao := 10731
!set mg.email := 'mg@di.fct.unl.pt'
!insert (mg, CTP) into Professor_Seccao

!create mmonteiro : Professor
!set mmonteiro.nome := 'Miguel Pessoa Monteiro'
!set mmonteiro.grau := #doutor
!set mmonteiro.nivel := #profAuxiliar
!set mmonteiro.gabinete := 'P2/16'
!set mmonteiro.extensao := 10708
!set mmonteiro.email := 'mmonteiro@di.fct.unl.pt'
!insert (mmonteiro, CTP) into Professor_Seccao

!create nmp : Professor
!set nmp.nome := 'Nuno Manuel Ribeiro Preguiça'
!set nmp.grau := #doutor
!set nmp.nivel := #profAuxiliar
!set nmp.gabinete := 'P2/9'
!set nmp.extensao := 10753
!set nmp.email := 'nmp@di.fct.unl.pt'
!insert (nmp, ASC) into Professor_Seccao

!create nmm : Professor
!set nmm.nome := 'Nuno Miguel Cavalheiro Marques'
!set nmm.grau := #doutor
!set nmm.nivel := #profAuxiliar
!set nmm.gabinete := 'P3/3'
!set nmm.extensao := 10714
!set nmm.email := 'nmm@di.fct.unl.pt'
!insert (nmm, SSDI) into Professor_Seccao

!create pal : Professor
!set pal.nome := 'Paulo Orlando Reis Afonso Lopes'
!set pal.grau := #doutor
!set pal.nivel := #profAuxiliar
!set pal.gabinete := '243'
!set pal.extensao := 10763
!set pal.email := 'pal@di.fct.unl.pt'
!insert (pal, ASC) into Professor_Seccao

!create rfm : Professor
!set rfm.nome := 'Rui Filipe Pereira Marques'
!set rfm.grau := #doutor
!set rfm.nivel := #profAuxiliar
!set rfm.gabinete := 'P2/1'
!set rfm.extensao := 10729
!set rfm.email := 'rfm@di.fct.unl.pt'
!insert (rfm, ASC) into Professor_Seccao

!create smd : Professor
!set smd.nome := 'Sérgio Marco Duarte'
!set smd.grau := #doutor
!set smd.nivel := #profAuxiliar
!set smd.gabinete := 'P2/6'
!set smd.extensao := 10726
!set smd.email := 'smd@di.fct.unl.pt'
!insert (smd, ASC) into Professor_Seccao

!create sc : Professor
!set sc.nome := 'Sofia Carmen Faria Cavaco'
!set sc.grau := #doutor
!set sc.nivel := #profAuxiliar
!set sc.gabinete := 'P3/6'
!set sc.extensao := 10769
!set sc.email := 'sc@di.fct.unl.pt'
!insert (sc, CTP) into Professor_Seccao

!create snt : Professor
!set snt.nome := 'Susana Maria S. Nascimento M. Almeida'
!set snt.grau := #doutor
!set snt.nivel := #profAuxiliar
!set snt.gabinete := 'P3/3'
!set snt.extensao := 10713
!set snt.email := 'snt@di.fct.unl.pt'
!insert (snt, SSDI) into Professor_Seccao

!create tir : Professor
!set tir.nome := 'Teresa Romão'
!set tir.grau := #doutor
!set tir.nivel := #profAuxiliar
!set tir.gabinete := '245'
!set tir.extensao := 10764
!set tir.email := 'tir@di.fct.unl.pt'
!insert (tir, CTP) into Professor_Seccao

!create va : Professor
!set va.nome := 'Vasco Miguel Moreira Amaral'
!set va.grau := #doutor
!set va.nivel := #profAuxiliar
!set va.gabinete := 'P2/3'
!set va.extensao := 10712
!set va.email := 'va@di.fct.unl.pt'
!insert (va, CTP) into Professor_Seccao

!create vad : Professor
!set vad.nome := 'Vítor Manuel Alves Duarte'
!set vad.grau := #doutor
!set vad.nivel := #profAuxiliar
!set vad.gabinete := 'P2/11'
!set vad.extensao := 10741
!set vad.email := 'vad@di.fct.unl.pt'
!insert (vad, ASC) into Professor_Seccao

!create asm : Professor
!set asm.nome := 'António Soares Gomes Miguel'
!set asm.grau := #doutor
!set asm.nivel := #profAuxiliarConvidado
!set asm.gabinete := '239'
!set asm.email := 'asm@di.fct.unl.pt'
!insert (asm, CTP) into Professor_Seccao

!create jmag : Professor
!set jmag.nome := 'João Miguel da Costa Magalhães'
!set jmag.grau := #doutor
!set jmag.nivel := #profAuxiliarConvidado
!set jmag.gabinete := '249'
!set jmag.extensao := 10779
!set jmag.email := 'jmag@di.fct.unl.pt'
!insert (jmag, SSDI) into Professor_Seccao

!create apm : Professor
!set apm.nome := 'Ana Paula Vieira Maldonado'
!set apm.grau := #mestre
!set apm.nivel := #assistente
!set apm.gabinete := 'P3/1'
!set apm.extensao := 10723
!set apm.email := 'apm@di.fct.unl.pt'
!insert (apm, CTP) into Professor_Seccao

!create jddp : Professor
!set jddp.nome := 'José Daniel Dias Pacheco'
!set jddp.grau := #mestre
!set jddp.nivel := #assistente
!set jddp.gabinete := 'P3/6'
!set jddp.extensao := 10749
!set jddp.email := 'jddp@di.fct.unl.pt'
!insert (jddp,CTP) into Professor_Seccao

----------------------------------------------

!create MAT : AreaCientifica
!set MAT.nome := 'Matemática'

!create CHS : AreaCientifica
!set CHS.nome := 'Ciências Humanas e Sociais'

!create INF : AreaCientifica
!set INF.nome := 'Informática'

!create FIS : AreaCientifica
!set FIS.nome := 'Física'

!create EE : AreaCientifica
!set EE.nome := 'Engenharia Electrotécnica'

!create EG : AreaCientifica
!set EG.nome := 'Economia e Gestão'

!create AI_PHD : AreaCientifica
!set AI_PHD.nome := 'Artificial Intelligence'

!create CGM_PHD : AreaCientifica
!set CGM_PHD.nome := 'Computer Graphics and Multimedia'

!create CSN_PHD : AreaCientifica
!set CSN_PHD.nome := 'Computer Systems and Networks'

!create IST_PHD : AreaCientifica
!set IST_PHD.nome := 'Information Systems Technology'

!create PLM_PHD : AreaCientifica
!set PLM_PHD.nome := 'Programming Languages and Models'

!create SE_PHD : AreaCientifica
!set SE_PHD.nome := 'Software Engineering'


--------------------------------------------------------------------
-- LEI
--------------------------------------------------------------------
!create LEI : Curso
!set LEI.nome := 'Licenciatura em Engenharia Informática (1º Ciclo)'

!create LEI_CE : Perfil
!set LEI_CE.nome := 'Ciências da Engenharia'
!insert (LEI, LEI_CE) into Curso_Perfil

!create LEI_IA : Perfil
!set LEI_IA.nome := 'Informática Aplicada'
!insert (LEI, LEI_IA) into Curso_Perfil

!insert (LEI, lcaires) into Curso_Coordenacao

!insert (LEI, nmc) into Curso_Erasmus

!insert (LEI, lcaires) into Curso_CCientifica
!insert (LEI, jml) into Curso_CCientifica
!insert (LEI, jmp) into Curso_CCientifica
!insert (LEI, arodrigues) into Curso_CCientifica
!insert (LEI, jcs) into Curso_CCientifica

----------------------------------------------------
!create am1 : Disciplina
!set am1.nome := 'Análise Matemática 1'

!create am1_LEI_CE: Oferta between (am1, LEI_CE) 
!set am1_LEI_CE.semestre := #impar
!set am1_LEI_CE.ano := 1
!set am1_LEI_CE.ects := 7
!insert (am1, MAT) into Disciplina_AreaCientifica

!create alga : Disciplina
!set alga.nome := 'Álgebra Linear e Geometria Analítica'

!create alga_LEI_CE: Oferta between (alga, LEI_CE) 
!set alga_LEI_CE.semestre := #impar
!set alga_LEI_CE.ano := 1
!set alga_LEI_CE.ects := 6
!insert (alga, MAT) into Disciplina_AreaCientifica

!create ip : Disciplina
!set ip.nome := 'Introdução à Programação'

!create ip_LEI_CE: Oferta between (ip, LEI_CE) 
!set ip_LEI_CE.semestre := #impar
!set ip_LEI_CE.ano := 1
!set ip_LEI_CE.ects := 8
!insert (ip, INF) into Disciplina_AreaCientifica

!create isrc : Disciplina
!set isrc.nome := 'Introdução aos Sistemas e Redes de Computadores'

!create isrc_LEI_CE: Oferta between (isrc, LEI_CE) 
!set isrc_LEI_CE.semestre := #impar
!set isrc_LEI_CE.ano := 1
!set isrc_LEI_CE.ects := 6
!insert (isrc, INF) into Disciplina_AreaCientifica

!create ec : Disciplina
!set ec.nome := 'Expressão e Comunicação'

!create ec_LEI_CE: Oferta between (ec, LEI_CE) 
!set ec_LEI_CE.semestre := #impar
!set ec_LEI_CE.ano := 1
!set ec_LEI_CE.ects := 3
!insert (ec, CHS) into Disciplina_AreaCientifica 
----------------------------------------------------

!create am2 : Disciplina
!set am2.nome := 'Análise Matemática 2'

!create am2_LEI_CE: Oferta between (am2, LEI_CE) 
!set am2_LEI_CE.semestre := #par
!set am2_LEI_CE.ano := 1
!set am2_LEI_CE.ects := 6
!insert (am2, MAT) into Disciplina_AreaCientifica 

!create md : Disciplina
!set md.nome := 'Matemática Discreta'

!create md_LEI_CE: Oferta between (md, LEI_CE) 
!set md_LEI_CE.semestre := #par
!set md_LEI_CE.ano := 1
!set md_LEI_CE.ects := 6
!insert (md, MAT) into Disciplina_AreaCientifica 

!create ac : Disciplina
!set ac.nome := 'Arquitectura de Computadores'

!create ac_LEI_CE: Oferta between (ac, LEI_CE) 
!set ac_LEI_CE.semestre := #par
!set ac_LEI_CE.ano := 1
!set ac_LEI_CE.ects := 6
!insert (ac, INF) into Disciplina_AreaCientifica 

!create lc : Disciplina
!set lc.nome := 'Lógica Computacional'

!create lc_LEI_CE: Oferta between (lc, LEI_CE) 
!set lc_LEI_CE.semestre := #par
!set lc_LEI_CE.ano := 1
!set lc_LEI_CE.ects := 6
!insert (lc, INF) into Disciplina_AreaCientifica 

!create poo : Disciplina
!set poo.nome := 'Programação Orientada pelos Objectos'

!create poo_LEI_CE: Oferta between (poo, LEI_CE) 
!set poo_LEI_CE.semestre := #par
!set poo_LEI_CE.ano := 1
!set poo_LEI_CE.ects := 6
!insert (poo, INF) into Disciplina_AreaCientifica 

----------------------------------------------------

!create aed : Disciplina
!set aed.nome := 'Algoritmos e Estruturas de Dados'

!create aed_LEI_CE: Oferta between (aed, LEI_CE) 
!set aed_LEI_CE.semestre := #impar
!set aed_LEI_CE.ano := 2
!set aed_LEI_CE.ects := 6
!insert (aed, INF) into Disciplina_AreaCientifica
!insert (ip, aed) into Disciplina_Disciplina
!insert (poo, aed) into Disciplina_Disciplina

!create bd : Disciplina
!set bd.nome := 'Bases de Dados'

!create bd_LEI_CE: Oferta between (bd, LEI_CE) 
!set bd_LEI_CE.semestre := #impar
!set bd_LEI_CE.ano := 2
!set bd_LEI_CE.ects := 6
!insert (bd, INF) into Disciplina_AreaCientifica

!create fso : Disciplina
!set fso.nome := 'Fundamentos de Sistemas de Operação'

!create fso_LEI_CE: Oferta between (fso, LEI_CE) 
!set fso_LEI_CE.semestre := #impar
!set fso_LEI_CE.ano := 2
!set fso_LEI_CE.ects := 6
!insert (fso, INF) into Disciplina_AreaCientifica

!create tc : Disciplina
!set tc.nome := 'Teoria da Computação'

!create tc_LEI_CE: Oferta between (tc, LEI_CE) 
!set tc_LEI_CE.semestre := #impar
!set tc_LEI_CE.ano := 2
!set tc_LEI_CE.ects := 6
!insert (tc, INF) into Disciplina_AreaCientifica

!create pc : Disciplina
!set pc.nome := 'Pensamento Crítico'

!create pc_LEI_CE: Oferta between (pc, LEI_CE) 
!set pc_LEI_CE.semestre := #impar
!set pc_LEI_CE.ano := 2
!set pc_LEI_CE.ects := 6
!insert (pc, CHS) into Disciplina_AreaCientifica

----------------------------------------------------
!create pe : Disciplina
!set pe.nome := 'Probabilidades e Estatística'

!create pe_LEI_CE: Oferta between (pe, LEI_CE) 
!set pe_LEI_CE.semestre := #par
!set pe_LEI_CE.ano := 2
!set pe_LEI_CE.ects := 6
!insert (pe, MAT) into Disciplina_AreaCientifica

!create f : Disciplina
!set f.nome := 'Física'

!create f_LEI_CE: Oferta between (f, LEI_CE) 
!set f_LEI_CE.semestre := #par
!set f_LEI_CE.ano := 2
!set f_LEI_CE.ects := 6
!insert (f, FIS) into Disciplina_AreaCientifica

!create lap : Disciplina
!set lap.nome := 'Linguagens e Ambientes de Programação'

!create lap_LEI_CE: Oferta between (lap, LEI_CE) 
!set lap_LEI_CE.semestre := #par
!set lap_LEI_CE.ano := 2
!set lap_LEI_CE.ects := 6
!insert (lap, INF) into Disciplina_AreaCientifica

!create mds : Disciplina
!set mds.nome := 'Métodos de Desenvolvimento de Software'

!create mds_LEI_CE: Oferta between (mds, LEI_CE) 
!set mds_LEI_CE.semestre := #par
!set mds_LEI_CE.ano := 2
!set mds_LEI_CE.ects := 6
!insert (mds, INF) into Disciplina_AreaCientifica

!create rc : Disciplina
!set rc.nome := 'Redes de Computadores'

!create rc_LEI_CE: Oferta between (rc, LEI_CE) 
!set rc_LEI_CE.semestre := #par
!set rc_LEI_CE.ano := 2
!set rc_LEI_CE.ects := 6
!insert (rc, INF) into Disciplina_AreaCientifica

-- FALTAM DISCIPLINAS DO 3º ANO
-- ...

-------------------------------------------------------
-- MESTRADO EM ENGENHARIA INFORMÁTICA
-------------------------------------------------------

!create MEI : Curso
!set MEI.nome := 'Mestrado em Engenharia Informática (2º Ciclo)'

!create MEI_BASE : Perfil
!set MEI_BASE.nome := 'Perfil único do MEI'
!insert (MEI, MEI_BASE) into Curso_Perfil

!insert (MEI, pm) into Curso_Coordenacao

!insert (MEI, pm) into Curso_CCientifica
!insert (MEI, fpb) into Curso_CCientifica
!insert (MEI, fba) into Curso_CCientifica
!insert (MEI, hjd) into Curso_CCientifica
!insert (MEI, jleite) into Curso_CCientifica
!insert (MEI, mm) into Curso_CCientifica

!insert (MEI, fpb) into Curso_Erasmus

-------------------------------------------------------
!create iio_mei: Disciplina	
!set iio_mei.nome:= 'Introdução à Investigação Operacional'	
!insert (iio_mei, MAT) into Disciplina_AreaCientifica		
!create iio_MEI_BASE: Oferta between (iio_mei, MEI_BASE)	
!set iio_MEI_BASE.semestre:= #impar	
!set iio_MEI_BASE.ano:= 1	
!set iio_MEI_BASE.ects:= 6

!create as_mei: Disciplina	
!set as_mei.nome:= 'Arquitecturas de Software'	
!insert (as_mei, INF) into Disciplina_AreaCientifica		
!create as_MEI_BASE: Oferta between (as_mei, MEI_BASE)	
!set as_MEI_BASE.semestre:= #impar	
!set as_MEI_BASE.ano:= 1	
!set as_MEI_BASE.ects:= 6

!create cass_mei: Disciplina	
!set cass_mei.nome:= 'Construção e Análise de Sistemas de Software'	
!insert (cass_mei, INF) into Disciplina_AreaCientifica		
!create cass_MEI_BASE: Oferta between (cass_mei, MEI_BASE)	
!set cass_MEI_BASE.semestre:= #impar	
!set cass_MEI_BASE.ano:= 1	
!set cass_MEI_BASE.ects:= 6

!create ipm_mei: Disciplina	
!set ipm_mei.nome:= 'Interacção Pessoa-Máquina'	
!insert (ipm_mei, INF) into Disciplina_AreaCientifica		
!create ipm_MEI_BASE: Oferta between (ipm_mei, MEI_BASE)	
!set ipm_MEI_BASE.semestre:= #impar	
!set ipm_MEI_BASE.ano:= 1	
!set ipm_MEI_BASE.ects:= 6

!create rcr_mei: Disciplina	
!set rcr_mei.nome:= 'Representação de Conhecimento e Raciocínio'	
!insert (rcr_mei, INF) into Disciplina_AreaCientifica	
!create rcr_MEI_BASE: Oferta between (rcr_mei, MEI_BASE)	
!set rcr_MEI_BASE.semestre:= #impar	
!set rcr_MEI_BASE.ano:= 1	
!set rcr_MEI_BASE.ects:= 6

!create sbd_mei: Disciplina	
!set sbd_mei.nome:= 'Sistemas de Bases de Dados'	
!insert (sbd_mei, INF) into Disciplina_AreaCientifica		
!create sbd_MEI_BASE: Oferta between (sbd_mei, MEI_BASE)	
!set sbd_MEI_BASE.semestre:= #impar	
!set sbd_MEI_BASE.ano:= 1	
!set sbd_MEI_BASE.ects:= 6

!create sd_mei: Disciplina	
!set sd_mei.nome:= 'Sistemas Distribuídos'	
!insert (sd_mei, INF) into Disciplina_AreaCientifica		
!create sd_MEI_BASE: Oferta between (sd_mei, MEI_BASE)	
!set sd_MEI_BASE.semestre:= #impar	
!set sd_MEI_BASE.ano:= 1	
!set sd_MEI_BASE.ects:= 6

!create clc_mei: Disciplina	
!set clc_mei.nome:= 'Ciência da Lógica Computacional'	
!insert (clc_mei, INF) into Disciplina_AreaCientifica		
!create clc_MEI_BASE: Oferta between (clc_mei, MEI_BASE)	
!set clc_MEI_BASE.semestre:= #impar	
!set clc_MEI_BASE.ano:= 1	
!set clc_MEI_BASE.ects:= 6

!create ctx_mei: Disciplina	
!set ctx_mei.nome:= 'Conceitos e Tecnologias XML'	
!insert (ctx_mei, INF) into Disciplina_AreaCientifica		
!create ctx_MEI_BASE: Oferta between (ctx_mei, MEI_BASE)	
!set ctx_MEI_BASE.semestre:= #impar	
!set ctx_MEI_BASE.ano:= 1	
!set ctx_MEI_BASE.ects:= 6

!create dsoo_mei: Disciplina	
!set dsoo_mei.nome:= 'Desenvolvimento de Software Orientado pelos Objectos'	
!insert (dsoo_mei, INF) into Disciplina_AreaCientifica		
!create dsoo_MEI_BASE: Oferta between (dsoo_mei, MEI_BASE)	
!set dsoo_MEI_BASE.semestre:= #impar	
!set dsoo_MEI_BASE.ano:= 1	
!set dsoo_MEI_BASE.ects:= 6

!create pmp_mei: Disciplina	
!set pmp_mei.nome:= 'Programação Multi-Paradigma'	
!insert (pmp_mei, INF) into Disciplina_AreaCientifica		
!create pmp_MEI_BASE: Oferta between (pmp_mei, MEI_BASE)	
!set pmp_MEI_BASE.semestre:= #impar	
!set pmp_MEI_BASE.ano:= 1	
!set pmp_MEI_BASE.ects:= 6

!create ssrc_mei: Disciplina	
!set ssrc_mei.nome:= 'Segurança de Sistemas e Redes de Computadores'	
!insert (ssrc_mei, INF) into Disciplina_AreaCientifica		
!create ssrc_MEI_BASE: Oferta between (ssrc_mei, MEI_BASE)	
!set ssrc_MEI_BASE.semestre:= #impar	
!set ssrc_MEI_BASE.ano:= 1	
!set ssrc_MEI_BASE.ects:= 6

!create so_mei: Disciplina	
!set so_mei.nome:= 'Sistemas de Operação'	
!insert (so_mei, INF) into Disciplina_AreaCientifica		
!create so_MEI_BASE: Oferta between (so_mei, MEI_BASE)	
!set so_MEI_BASE.semestre:= #impar	
!set so_MEI_BASE.ano:= 1	
!set so_MEI_BASE.ects:= 6
-------------------------------------------------------
!create ee_mei: Disciplina	
!set ee_mei.nome:= 'Economia e Empreendedorismo'	
!insert (ee_mei, EG) into Disciplina_AreaCientifica		
!create ee_MEI_BASE: Oferta between (ee_mei, MEI_BASE)	
!set ee_MEI_BASE.semestre:= #par	
!set ee_MEI_BASE.ano:= 1	
!set ee_MEI_BASE.ects:= 6

!create apd_mei: Disciplina	
!set apd_mei.nome:= 'Algoritmos para Problemas Difíceis'	
!insert (apd_mei, INF) into Disciplina_AreaCientifica		
!create apd_MEI_BASE: Oferta between (apd_mei, MEI_BASE)	
!set apd_MEI_BASE.semestre:= #par	
!set apd_MEI_BASE.ano:= 1	
!set apd_MEI_BASE.ects:= 6

!create aadm_mei: Disciplina	
!set aadm_mei.nome:= 'Aprendizagem Automática e Data Mining'	
!insert (aadm_mei, INF) into Disciplina_AreaCientifica		
!create aadm_MEI_BASE: Oferta between (aadm_mei, MEI_BASE)	
!set aadm_MEI_BASE.semestre:= #par	
!set aadm_MEI_BASE.ano:= 1	
!set aadm_MEI_BASE.ects:= 6

!create cm_mei: Disciplina	
!set cm_mei.nome:= 'Computação Multimédia'	
!insert (cm_mei, INF) into Disciplina_AreaCientifica		
!create cm_MEI_BASE: Oferta between (cm_mei, MEI_BASE)	
!set cm_MEI_BASE.semestre:= #par	
!set cm_MEI_BASE.ano:= 1	
!set cm_MEI_BASE.ects:= 6

!create cpd_mei: Disciplina	
!set cpd_mei.nome:= 'Computação Paralela e Distribuída'	
!insert (cpd_mei, INF) into Disciplina_AreaCientifica		
!create cpd_MEI_BASE: Oferta between (cpd_mei, MEI_BASE)	
!set cpd_MEI_BASE.semestre:= #par	
!set cpd_MEI_BASE.ano:= 1	
!set cpd_MEI_BASE.ects:= 6

!create dw_mei: Disciplina	
!set dw_mei.nome:= 'Data Warehousing'	
!insert (dw_mei, INF) into Disciplina_AreaCientifica		
!create dw_MEI_BASE: Oferta between (dw_mei, MEI_BASE)	
!set dw_MEI_BASE.semestre:= #par	
!set dw_MEI_BASE.ano:= 1	
!set dw_MEI_BASE.ects:= 6

!create erds_mei: Disciplina	
!set erds_mei.nome:= 'Engenharia de Requisitos e Desenho de Software'	
!insert (erds_mei, INF) into Disciplina_AreaCientifica		
!create erds_MEI_BASE: Oferta between (erds_mei, MEI_BASE)	
!set erds_MEI_BASE.semestre:= #par	
!set erds_MEI_BASE.ano:= 1	
!set erds_MEI_BASE.ects:= 6

!create lmcs_mei: Disciplina	
!set lmcs_mei.nome:= 'Linguagens e Modelos para Concorrência e Segurança'	
!insert (lmcs_mei, INF) into Disciplina_AreaCientifica		
!create lmcs_MEI_BASE: Oferta between (lmcs_mei, MEI_BASE)	
!set lmcs_MEI_BASE.semestre:= #par	
!set lmcs_MEI_BASE.ano:= 1	
!set lmcs_MEI_BASE.ects:= 6

!create lde_mei: Disciplina	
!set lde_mei.nome:= 'Linguagens para Domínios Específicos'	
!insert (lde_mei, INF) into Disciplina_AreaCientifica		
!create lde_MEI_BASE: Oferta between (lde_mei, MEI_BASE)	
!set lde_MEI_BASE.semestre:= #par	
!set lde_MEI_BASE.ano:= 1	
!set lde_MEI_BASE.ects:= 6

!create lev_mei: Disciplina	
!set lev_mei.nome:= 'Lógicas para Especificação e Verificação'	
!insert (lev_mei, INF) into Disciplina_AreaCientifica		
!create lev_MEI_BASE: Oferta between (lev_mei, MEI_BASE)	
!set lev_MEI_BASE.semestre:= #par	
!set lev_MEI_BASE.ano:= 1	
!set lev_MEI_BASE.ects:= 6

!create po_mei: Disciplina	
!set po_mei.nome:= 'Pesquisa e Optimização'	
!insert (po_mei, INF) into Disciplina_AreaCientifica		
!create po_MEI_BASE: Oferta between (po_mei, MEI_BASE)	
!set po_MEI_BASE.semestre:= #par	
!set po_MEI_BASE.ano:= 1	
!set po_MEI_BASE.ects:= 6

!create qpp_mei: Disciplina	
!set qpp_mei.nome:= 'Qualidade do Processo e do Produto'	
!insert (qpp_mei, INF) into Disciplina_AreaCientifica		
!create qpp_MEI_BASE: Oferta between (qpp_mei, MEI_BASE)	
!set qpp_MEI_BASE.semestre:= #par	
!set qpp_MEI_BASE.ano:= 1	
!set qpp_MEI_BASE.ects:= 6

!create rct_mei: Disciplina	
!set rct_mei.nome:= 'Redes de Computadores TCP/IP'	
!insert (rct_mei, INF) into Disciplina_AreaCientifica		
!create rct_MEI_BASE: Oferta between (rct_mei, MEI_BASE)	
!set rct_MEI_BASE.semestre:= #par	
!set rct_MEI_BASE.ano:= 1	
!set rct_MEI_BASE.ects:= 6

!create scn_mei: Disciplina	
!set scn_mei.nome:= 'Simulação e Computação Numérica'	
!insert (scn_mei, INF) into Disciplina_AreaCientifica		
!create scn_MEI_BASE: Oferta between (scn_mei, MEI_BASE)	
!set scn_MEI_BASE.semestre:= #par	
!set scn_MEI_BASE.ano:= 1	
!set scn_MEI_BASE.ects:= 6

!create si_mei: Disciplina	
!set si_mei.nome:= 'Síntese de Imagem'	
!insert (si_mei, INF) into Disciplina_AreaCientifica		
!create si_MEI_BASE: Oferta between (si_mei, MEI_BASE)	
!set si_MEI_BASE.semestre:= #par	
!set si_MEI_BASE.ano:= 1	
!set si_MEI_BASE.ects:= 6

!create scmu_mei: Disciplina	
!set scmu_mei.nome:= 'Sistemas de Computação Móvel e Ubíqua'	
!insert (scmu_mei, INF) into Disciplina_AreaCientifica		
!create scmu_MEI_BASE: Oferta between (scmu_mei, MEI_BASE)	
!set scmu_MEI_BASE.semestre:= #par	
!set scmu_MEI_BASE.ano:= 1	
!set scmu_MEI_BASE.ects:= 6

!create stm_mei: Disciplina	
!set stm_mei.nome:= 'Sistemas e Tecnologias de Middleware'	
!insert (stm_mei, INF) into Disciplina_AreaCientifica		
!create stm_MEI_BASE: Oferta between (stm_mei, MEI_BASE)	
!set stm_MEI_BASE.semestre:= #par	
!set stm_MEI_BASE.ano:= 1	
!set stm_MEI_BASE.ects:= 6

!create sma_mei: Disciplina	
!set sma_mei.nome:= 'Sistemas Multi-Agente'	
!insert (sma_mei, INF) into Disciplina_AreaCientifica		
!create sma_MEI_BASE: Oferta between (sma_mei, MEI_BASE)	
!set sma_MEI_BASE.semestre:= #par	
!set sma_MEI_BASE.ano:= 1	
!set sma_MEI_BASE.ects:= 6

!create ws_mei: Disciplina	
!set ws_mei.nome:= 'Web Semântica'	
!insert (ws_mei, INF) into Disciplina_AreaCientifica		
!create ws_MEI_BASE: Oferta between (ws_mei, MEI_BASE)	
!set ws_MEI_BASE.semestre:= #par	
!set ws_MEI_BASE.ano:= 1	
!set ws_MEI_BASE.ects:= 6

!create ccc_mei: Disciplina	
!set ccc_mei.nome:= 'Computação e Ciências Cognitivas'	
!insert (ccc_mei, CHS) into Disciplina_AreaCientifica		
!create ccc_MEI_BASE: Oferta between (ccc_mei, MEI_BASE)	
!set ccc_MEI_BASE.semestre:= #par	
!set ccc_MEI_BASE.ano:= 1	
!set ccc_MEI_BASE.ects:= 6

!create csf_mei: Disciplina	
!set csf_mei.nome:= 'Comunicação sem Fios'	
!insert (csf_mei, EE) into Disciplina_AreaCientifica		
!create csf_MEI_BASE: Oferta between (csf_mei, MEI_BASE)	
!set csf_MEI_BASE.semestre:= #par	
!set csf_MEI_BASE.ano:= 1	
!set csf_MEI_BASE.ects:= 6

!create ea_mei: Disciplina	
!set ea_mei.nome:= 'Estatística Aplicada'	
!insert (ea_mei, MAT) into Disciplina_AreaCientifica		
!create ea_MEI_BASE: Oferta between (ea_mei, MEI_BASE)	
!set ea_MEI_BASE.semestre:= #par	
!set ea_MEI_BASE.ano:= 1	
!set ea_MEI_BASE.ects:= 6

!create onl_mei: Disciplina	
!set onl_mei.nome:= 'Optimização Não Linear'	
!insert (onl_mei, MAT) into Disciplina_AreaCientifica		
!create onl_MEI_BASE: Oferta between (onl_mei, MEI_BASE)	
!set onl_MEI_BASE.semestre:= #par	
!set onl_MEI_BASE.ano:= 1	
!set onl_MEI_BASE.ects:= 6

!create pe_mei: Disciplina	
!set pe_mei.nome:= 'Processos Estocásticos'	
!insert (pe_mei, MAT) into Disciplina_AreaCientifica		
!create pe_MEI_BASE: Oferta between (pe_mei, MEI_BASE)	
!set pe_MEI_BASE.semestre:= #par	
!set pe_MEI_BASE.ano:= 1	
!set pe_MEI_BASE.ects:= 6

!create taa_mei: Disciplina	
!set taa_mei.nome:= 'Teoria Algébrica dos Autómatos'	
!insert (taa_mei, MAT) into Disciplina_AreaCientifica		
!create taa_MEI_BASE: Oferta between (taa_mei, MEI_BASE)	
!set taa_MEI_BASE.semestre:= #par	
!set taa_MEI_BASE.ano:= 1	
!set taa_MEI_BASE.ects:= 6
-------------------------------------------------------
!create ctc_mei: Disciplina	
!set ctc_mei.nome:= 'Comunicação Técnica e Científica'	
!insert (ctc_mei, CHS) into Disciplina_AreaCientifica		
!create ctc_MEI_BASE: Oferta between (ctc_mei, MEI_BASE)	
!set ctc_MEI_BASE.semestre:= #impar	
!set ctc_MEI_BASE.ano:= 2	
!set ctc_MEI_BASE.ects:= 3

!create gcd_mei: Disciplina	
!set gcd_mei.nome:= 'Gestão de Centros de Dados'	
!insert (gcd_mei, INF) into Disciplina_AreaCientifica		
!create gcd_MEI_BASE: Oferta between (gcd_mei, MEI_BASE)	
!set gcd_MEI_BASE.semestre:= #impar	
!set gcd_MEI_BASE.ano:= 2	
!set gcd_MEI_BASE.ects:= 3

!create gpi_mei: Disciplina	
!set gpi_mei.nome:= 'Gestão de Projectos Informáticos'	
!insert (gpi_mei, INF) into Disciplina_AreaCientifica		
!create gpi_MEI_BASE: Oferta between (gpi_mei, MEI_BASE)	
!set gpi_MEI_BASE.semestre:= #impar	
!set gpi_MEI_BASE.ano:= 2	
!set gpi_MEI_BASE.ects:= 3

!create rdfc_mei: Disciplina	
!set rdfc_mei.nome:= 'Restrições sobre Domínios Finitos e Conjuntos'	
!insert (rdfc_mei, INF) into Disciplina_AreaCientifica		
!create rdfc_MEI_BASE: Oferta between (rdfc_mei, MEI_BASE)	
!set rdfc_MEI_BASE.semestre:= #impar	
!set rdfc_MEI_BASE.ano:= 2	
!set rdfc_MEI_BASE.ects:= 6

!create scg_mei: Disciplina	
!set scg_mei.nome:= 'Sistemas de Computação em Grid'	
!insert (scg_mei, INF) into Disciplina_AreaCientifica		
!create scg_MEI_BASE: Oferta between (scg_mei, MEI_BASE)	
!set scg_MEI_BASE.semestre:= #impar	
!set scg_MEI_BASE.ano:= 2	
!set scg_MEI_BASE.ects:= 6

!create tig_mei: Disciplina	
!set tig_mei.nome:= 'Tecnologia de Informação Geográfica'	
!insert (tig_mei, INF) into Disciplina_AreaCientifica		
!create tig_MEI_BASE: Oferta between (tig_mei, MEI_BASE)	
!set tig_MEI_BASE.semestre:= #impar	
!set tig_MEI_BASE.ano:= 2	
!set tig_MEI_BASE.ects:= 6

!create tacpd_mei: Disciplina	
!set tacpd_mei.nome:= 'Tópicos Avançados em Computação Paralela e Distribuída'	
!insert (tacpd_mei, INF) into Disciplina_AreaCientifica		
!create tacpd_MEI_BASE: Oferta between (tacpd_mei, MEI_BASE)	
!set tacpd_MEI_BASE.semestre:= #impar	
!set tacpd_MEI_BASE.ano:= 2	
!set tacpd_MEI_BASE.ects:= 6

!create taes_mei: Disciplina	
!set taes_mei.nome:= 'Tópicos Avançados em Engenharia de Software'	
!insert (taes_mei, INF) into Disciplina_AreaCientifica		
!create taes_MEI_BASE: Oferta between (taes_mei, MEI_BASE)	
!set taes_MEI_BASE.semestre:= #impar	
!set taes_MEI_BASE.ano:= 2	
!set taes_MEI_BASE.ects:= 6

!create talmp_mei: Disciplina	
!set talmp_mei.nome:= 'Tópicos Avançados em Linguagens e Modelos de Programação'	
!insert (talmp_mei, INF) into Disciplina_AreaCientifica		
!create talmp_MEI_BASE: Oferta between (talmp_mei, MEI_BASE)	
!set talmp_MEI_BASE.semestre:= #impar	
!set talmp_MEI_BASE.ano:= 2	
!set talmp_MEI_BASE.ects:= 6

!create tapr_mei: Disciplina	
!set tapr_mei.nome:= 'Tópicos Avançados em Programação por Restrições'	
!insert (tapr_mei, INF) into Disciplina_AreaCientifica		
!create tapr_MEI_BASE: Oferta between (tapr_mei, MEI_BASE)	
!set tapr_MEI_BASE.semestre:= #impar	
!set tapr_MEI_BASE.ano:= 2	
!set tapr_MEI_BASE.ects:= 6

!create tasi_mei: Disciplina	
!set tasi_mei.nome:= 'Tópicos Avançados em Sistemas de Informação'	
!insert (tasi_mei, INF) into Disciplina_AreaCientifica		
!create tasi_MEI_BASE: Oferta between (tasi_mei, MEI_BASE)	
!set tasi_MEI_BASE.semestre:= #impar	
!set tasi_MEI_BASE.ano:= 2	
!set tasi_MEI_BASE.ects:= 6

!create tasd_mei: Disciplina	
!set tasd_mei.nome:= 'Tópicos Avançados em Sistemas Distribuídos'	
!insert (tasd_mei, INF) into Disciplina_AreaCientifica		
!create tasd_MEI_BASE: Oferta between (tasd_mei, MEI_BASE)	
!set tasd_MEI_BASE.semestre:= #impar	
!set tasd_MEI_BASE.ano:= 2	
!set tasd_MEI_BASE.ects:= 6

!create tasdia_mei: Disciplina	
!set tasdia_mei.nome:= 'Tópicos Avançados em Suporte à Decisão e Inteligência Artificial'	
!insert (tasdia_mei, INF) into Disciplina_AreaCientifica		
!create tasdia_MEI_BASE: Oferta between (tasdia_mei, MEI_BASE)	
!set tasdia_MEI_BASE.semestre:= #impar	
!set tasdia_MEI_BASE.ano:= 2	
!set tasdia_MEI_BASE.ects:= 6

!create tav_mei: Disciplina	
!set tav_mei.nome:= 'Tópicos Avançados em Visualização'	
!insert (tav_mei, INF) into Disciplina_AreaCientifica		
!create tav_MEI_BASE: Oferta between (tav_mei, MEI_BASE)	
!set tav_MEI_BASE.semestre:= #impar	
!set tav_MEI_BASE.ano:= 2	
!set tav_MEI_BASE.ects:= 6

!create edai_mei: Disciplina	
!set edai_mei.nome:= 'Ética e Direito Aplicados à Informática'	
!insert (edai_mei, CHS) into Disciplina_AreaCientifica		
!create edai_MEI_BASE: Oferta between (edai_mei, MEI_BASE)	
!set edai_MEI_BASE.semestre:= #impar	
!set edai_MEI_BASE.ano:= 2	
!set edai_MEI_BASE.ects:= 3

!create fsi_mei: Disciplina	
!set fsi_mei.nome:= 'Factores Sociais da Inovação'	
!insert (fsi_mei, CHS) into Disciplina_AreaCientifica		
!create fsi_MEI_BASE: Oferta between (fsi_mei, MEI_BASE)	
!set fsi_MEI_BASE.semestre:= #impar	
!set fsi_MEI_BASE.ano:= 2	
!set fsi_MEI_BASE.ects:= 3

!create ht_mei: Disciplina	
!set ht_mei.nome:= 'História da Tecnologia'	
!insert (ht_mei, CHS) into Disciplina_AreaCientifica		
!create ht_MEI_BASE: Oferta between (ht_mei, MEI_BASE)	
!set ht_MEI_BASE.semestre:= #impar	
!set ht_MEI_BASE.ano:= 2	
!set ht_MEI_BASE.ects:= 3

!create csd_mei: Disciplina	
!set csd_mei.nome:= 'Concepção de Sistemas Digitais'	
!insert (csd_mei, EE) into Disciplina_AreaCientifica		
!create csd_MEI_BASE: Oferta between (csd_mei, MEI_BASE)	
!set csd_MEI_BASE.semestre:= #impar	
!set csd_MEI_BASE.ano:= 2	
!set csd_MEI_BASE.ects:= 6

!create ei_mei: Disciplina	
!set ei_mei.nome:= 'Economia da Inovação'	
!insert (ei_mei, EG) into Disciplina_AreaCientifica		
!create ei_MEI_BASE: Oferta between (ei_mei, MEI_BASE)	
!set ei_MEI_BASE.semestre:= #impar	
!set ei_MEI_BASE.ano:= 2	
!set ei_MEI_BASE.ects:= 3

!create cc_mei: Disciplina	
!set cc_mei.nome:= 'Computabilidade e Complexidade'	
!insert (cc_mei, MAT) into Disciplina_AreaCientifica		
!create cc_MEI_BASE: Oferta between (cc_mei, MEI_BASE)	
!set cc_MEI_BASE.semestre:= #impar	
!set cc_MEI_BASE.ano:= 2	
!set cc_MEI_BASE.ects:= 6

!create mad_mei: Disciplina	
!set mad_mei.nome:= 'Modelos de Apoio à Decisão'	
!insert (mad_mei, MAT) into Disciplina_AreaCientifica		
!create mad_MEI_BASE: Oferta between (mad_mei, MEI_BASE)	
!set mad_MEI_BASE.semestre:= #impar	
!set mad_MEI_BASE.ano:= 2	
!set mad_MEI_BASE.ects:= 6

!create sr_mei: Disciplina	
!set sr_mei.nome:= 'Sistemas de Reescrita'	
!insert (sr_mei, MAT) into Disciplina_AreaCientifica		
!create sr_MEI_BASE: Oferta between (sr_mei, MEI_BASE)	
!set sr_MEI_BASE.semestre:= #impar	
!set sr_MEI_BASE.ano:= 2	
!set sr_MEI_BASE.ects:= 6

!create pd_mei: Disciplina	
!set pd_mei.nome:= 'Preparação da Dissertação'	
!insert (pd_mei, INF) into Disciplina_AreaCientifica		
!create pd_MEI_BASE: Oferta between (pd_mei, MEI_BASE)	
!set pd_MEI_BASE.semestre:= #impar	
!set pd_MEI_BASE.ano:= 2	
!set pd_MEI_BASE.ects:= 12

!create dm_mei: Disciplina	
!set dm_mei.nome:= 'Dissertação de Mestrado'	
!insert (dm_mei, INF) into Disciplina_AreaCientifica		
!create dm_MEI_BASE: Oferta between (dm_mei, MEI_BASE)	
!set dm_MEI_BASE.semestre:= #par	
!set dm_MEI_BASE.ano:= 2	
!set dm_MEI_BASE.ects:= 30

-------------------------------------------------------
-- MESTRADO EM LÓGICA COMPUTACIONAL
-------------------------------------------------------

!create MLC : Curso
!set MLC.nome := 'Mestrado em Lógica Computacional (2º Ciclo)'

!insert (MLC, jja) into Curso_Coordenacao

!insert (MLC, jja) into Curso_CCientifica

!insert (MLC, jleite) into Curso_Erasmus

!create MLC_BASE : Perfil
!set MLC_BASE.nome := 'Perfil único do MLC'
!insert (MLC, MLC_BASE) into Curso_Perfil

!create lcp_mlc: Disciplina	
!set lcp_mlc.nome:= 'Logic and Constraint Programming'	
!insert (lcp_mlc, INF) into Disciplina_AreaCientifica		
!create lcp_MLC_BASE: Oferta between (lcp_mlc, MLC_BASE)	
!set lcp_MLC_BASE.semestre:= #impar	
!set lcp_MLC_BASE.ano:= 1	
!set lcp_MLC_BASE.ects:= 12

!create al_mlc: Disciplina	
!set al_mlc.nome:= 'Advanced Logics'	
!insert (al_mlc, INF) into Disciplina_AreaCientifica		
!create al_MLC_BASE: Oferta between (al_mlc, MLC_BASE)	
!set al_MLC_BASE.semestre:= #par	
!set al_MLC_BASE.ano:= 1	
!set al_MLC_BASE.ects:= 9

!create ils_mlc: Disciplina	
!set ils_mlc.nome:= 'Integrated Logic Systems'	
!insert (ils_mlc, INF) into Disciplina_AreaCientifica		
!create ils_MLC_BASE: Oferta between (ils_mlc, MLC_BASE)	
!set ils_MLC_BASE.semestre:= #par	
!set ils_MLC_BASE.ano:= 1	
!set ils_MLC_BASE.ects:= 9
		
!create edai_MLC_BASE: Oferta between (edai_mei, MLC_BASE)	
!set edai_MLC_BASE.semestre:= #impar	
!set edai_MLC_BASE.ano:= 2	
!set edai_MLC_BASE.ects:= 3
	
!create fsi_MLC_BASE: Oferta between (fsi_mei, MLC_BASE)	
!set fsi_MLC_BASE.semestre:= #impar	
!set fsi_MLC_BASE.ano:= 2	
!set fsi_MLC_BASE.ects:= 3
		
!create ht_MLC_BASE: Oferta between (ht_mei, MLC_BASE)	
!set ht_MLC_BASE.semestre:= #impar	
!set ht_MLC_BASE.ano:= 2	
!set ht_MLC_BASE.ects:= 3
	
!create ei_MLC_BASE: Oferta between (ei_mei, MLC_BASE)	
!set ei_MLC_BASE.semestre:= #impar	
!set ei_MLC_BASE.ano:= 2	
!set ei_MLC_BASE.ects:= 3

-------------------------------------------------------
-- PHD IN COMPUTER SCIENCE
-------------------------------------------------------

!create PHD : Curso
!set PHD.nome := 'PhD in Computer Science (Doutoramento)'

!create PHD_BASE : Perfil
!set PHD_BASE.nome := 'Perfil único do PHD'
!insert (PHD, PHD_BASE) into Curso_Perfil

!insert (PHD, pb) into Curso_Coordenacao

!insert (PHD, ps) into Curso_Erasmus

!insert (PHD, pb) into Curso_CCientifica
!insert (PHD, nmc) into Curso_CCientifica
!insert (PHD, fba) into Curso_CCientifica

---------------------------------------
!create cp : Disciplina
!set cp.nome := 'Constraint Programming'

!create cp_PHD_BASE: Oferta between (cp, PHD_BASE) 
!set cp_PHD_BASE.semestre := #impar
!set cp_PHD_BASE.ano := 1
!set cp_PHD_BASE.ects := 6
!insert (cp, INF) into Disciplina_AreaCientifica

!create krra : Disciplina
!set krra.nome := 'Knowledge Representation, Reasoning and Agents'

!create krra_PHD_BASE: Oferta between (krra, PHD_BASE) 
!set krra_PHD_BASE.semestre := #impar
!set krra_PHD_BASE.ano := 1
!set krra_PHD_BASE.ects := 6
!insert (krra, INF) into Disciplina_AreaCientifica

!create mlke : Disciplina
!set mlke.nome := 'Machine Learning and Knowledge Extraction'

!create mlke_PHD_BASE: Oferta between (mlke, PHD_BASE) 
!set mlke_PHD_BASE.semestre := #impar
!set mlke_PHD_BASE.ano := 1
!set mlke_PHD_BASE.ects := 6
!insert (mlke, INF) into Disciplina_AreaCientifica

!create cgm : Disciplina
!set cgm.nome := 'Computer Graphics Modelling'

!create cgm_PHD_BASE: Oferta between (cgm, PHD_BASE) 
!set cgm_PHD_BASE.semestre := #impar
!set cgm_PHD_BASE.ano := 1
!set cgm_PHD_BASE.ects := 6
!insert (cgm, INF) into Disciplina_AreaCientifica

!create ivme : Disciplina
!set ivme.nome := 'Interaction and Visualization in Multimedia Environments'

!create ivme_PHD_BASE: Oferta between (ivme, PHD_BASE) 
!set ivme_PHD_BASE.semestre := #impar
!set ivme_PHD_BASE.ano := 1
!set ivme_PHD_BASE.ects := 6
!insert (ivme, INF) into Disciplina_AreaCientifica

!create cscs : Disciplina
!set cscs.nome := 'Computer Systems and Communications Security'

!create cscs_PHD_BASE: Oferta between (cscs, PHD_BASE) 
!set cscs_PHD_BASE.semestre := #impar
!set cscs_PHD_BASE.ano := 1
!set cscs_PHD_BASE.ects := 6
!insert (cscs, INF) into Disciplina_AreaCientifica

!create pgac : Disciplina
!set pgac.nome := 'Parallel, Grid and Autonomic Computing'

!create pgac_PHD_BASE: Oferta between (pgac, PHD_BASE) 
!set pgac_PHD_BASE.semestre := #impar
!set pgac_PHD_BASE.ano := 1
!set pgac_PHD_BASE.ects := 6
!insert (pgac, INF) into Disciplina_AreaCientifica

!create ts : Disciplina
!set ts.nome := 'Transactional Systems'

!create ts_PHD_BASE: Oferta between (ts, PHD_BASE) 
!set ts_PHD_BASE.semestre := #impar
!set ts_PHD_BASE.ano := 1
!set ts_PHD_BASE.ects := 6
!insert (ts, INF) into Disciplina_AreaCientifica

!create ist : Disciplina
!set ist.nome := 'Information Systems Technology'

!create ist_PHD_BASE: Oferta between (ist, PHD_BASE) 
!set ist_PHD_BASE.semestre := #impar
!set ist_PHD_BASE.ano := 1
!set ist_PHD_BASE.ects := 6
!insert (ist, INF) into Disciplina_AreaCientifica

!create cccpl : Disciplina
!set cccpl.nome := 'Communication and Concurrency-Centric Programming Languages'

!create cccpl_PHD_BASE: Oferta between (cccpl, PHD_BASE) 
!set cccpl_PHD_BASE.semestre := #impar
!set cccpl_PHD_BASE.ano := 1
!set cccpl_PHD_BASE.ects := 6
!insert (cccpl, INF) into Disciplina_AreaCientifica

!create adsir : Disciplina
!set adsir.nome := 'Algorithms and Data Structures for Information Retrieval'

!create adsir_PHD_BASE: Oferta between (adsir, PHD_BASE) 
!set adsir_PHD_BASE.semestre := #impar
!set adsir_PHD_BASE.ano := 1
!set adsir_PHD_BASE.ects := 6
!insert (adsir, INF) into Disciplina_AreaCientifica

!create asd : Disciplina
!set asd.nome := 'Advanced Software Development'

!create asd_PHD_BASE: Oferta between (asd, PHD_BASE) 
!set asd_PHD_BASE.semestre := #impar
!set asd_PHD_BASE.ano := 1
!set asd_PHD_BASE.ects := 6
!insert (asd, INF) into Disciplina_AreaCientifica

!create ese : Disciplina
!set ese.nome := 'Experimental Software Engineering'

!create ese_PHD_BASE: Oferta between (ese, PHD_BASE) 
!set ese_PHD_BASE.semestre := #impar
!set ese_PHD_BASE.ano := 1
!set ese_PHD_BASE.ects := 6
!insert (ese, INF) into Disciplina_AreaCientifica

!create rs : Disciplina
!set rs.nome := 'Research Seminars'

!create rs_PHD_BASE: Oferta between (rs, PHD_BASE) 
!set rs_PHD_BASE.semestre := #impar
!set rs_PHD_BASE.ano := 1
!set rs_PHD_BASE.ects := 3
!insert (rs, INF) into Disciplina_AreaCientifica

!create tsc : Disciplina
!set tsc.nome := 'Technical and Scientific Communication'

!create tsc_PHD_BASE: Oferta between (tsc, PHD_BASE) 
!set tsc_PHD_BASE.semestre := #impar
!set tsc_PHD_BASE.ano := 1
!set tsc_PHD_BASE.ects := 3
!insert (tsc, INF) into Disciplina_AreaCientifica

---------------------------------------------------------

!insert (rfm, aadm_mei) into Professor_Regencia
!insert (amd, ac) into Professor_Regencia
!insert (mm, adsir) into Professor_Regencia
!insert (ps, aed) into Professor_Regencia
!insert (cd, alga) into Professor_Regencia
!insert (rfm, am1) into Professor_Regencia
!insert (mcg, am2) into Professor_Regencia
!insert (snt, apd_mei) into Professor_Regencia
!insert (amm, as_mei) into Professor_Regencia
!insert (jleite, asd) into Professor_Regencia
!insert (jcc, bd) into Professor_Regencia
!insert (apm, cass_mei) into Professor_Regencia
!insert (vad, cc_mei) into Professor_Regencia
!insert (pal, ccc_mei) into Professor_Regencia
!insert (herve, cccpl) into Professor_Regencia
!insert (nmp, cgm) into Professor_Regencia
!insert (fb, clc_mei) into Professor_Regencia
!insert (cd, cm_mei) into Professor_Regencia
!insert (arodrigues, cp) into Professor_Regencia
!insert (cd, cpd_mei) into Professor_Regencia
!insert (ja, cscs) into Professor_Regencia
!insert (fb, csd_mei) into Professor_Regencia
!insert (jmp, csf_mei) into Professor_Regencia
!insert (fpb, ctc_mei) into Professor_Regencia
!insert (jleite, ctx_mei) into Professor_Regencia
!insert (nmm, dm_mei) into Professor_Regencia
!insert (smd, dsoo_mei) into Professor_Regencia
!insert (amd, dw_mei) into Professor_Regencia
!insert (jddp, ea_mei) into Professor_Regencia
!insert (jcs, ec) into Professor_Regencia
!insert (snt, edai_mei) into Professor_Regencia
!insert (mg, ee_mei) into Professor_Regencia
!insert (mg, ei_mei) into Professor_Regencia
!insert (fba, erds_mei) into Professor_Regencia
!insert (snt, ese) into Professor_Regencia
!insert (jddp, f) into Professor_Regencia
!insert (lcaires, fsi_mei) into Professor_Regencia
!insert (pm, fso) into Professor_Regencia
!insert (herve, gcd_mei) into Professor_Regencia
!insert (jfs, gpi_mei) into Professor_Regencia
!insert (vad, ht_mei) into Professor_Regencia
!insert (jfs, iio_mei) into Professor_Regencia
!insert (ja, ip) into Professor_Regencia
!insert (rfm, ipm_mei) into Professor_Regencia
!insert (nmc, isrc) into Professor_Regencia
!insert (jalm, ist) into Professor_Regencia
!insert (jalm, ivme) into Professor_Regencia
!insert (cd, krra) into Professor_Regencia
!insert (fa, lap) into Professor_Regencia
!insert (aravara, lc) into Professor_Regencia
!insert (sc, lde_mei) into Professor_Regencia
!insert (rfm, lev_mei) into Professor_Regencia
!insert (fba, lmcs_mei) into Professor_Regencia
!insert (fb, mad_mei) into Professor_Regencia
!insert (sc, md) into Professor_Regencia
!insert (jcc, mds) into Professor_Regencia
!insert (jcc, mlke) into Professor_Regencia
!insert (smd, onl_mei) into Professor_Regencia
!insert (lsr, pc) into Professor_Regencia
!insert (cpm, pd_mei) into Professor_Regencia
!insert (mmonteiro, pe) into Professor_Regencia
!insert (jja, pe_mei) into Professor_Regencia
!insert (arodrigues, pgac) into Professor_Regencia
!insert (pal, pmp_mei) into Professor_Regencia
!insert (amm, po_mei) into Professor_Regencia
!insert (fba, poo) into Professor_Regencia
!insert (fpb, qpp_mei) into Professor_Regencia
!insert (fba, rc) into Professor_Regencia
!insert (va, rcr_mei) into Professor_Regencia
!insert (smd, rct_mei) into Professor_Regencia
!insert (aravara, rdfc_mei) into Professor_Regencia
!insert (ps, rs) into Professor_Regencia
!insert (arodrigues, sbd_mei) into Professor_Regencia
!insert (fb, scg_mei) into Professor_Regencia
!insert (sc, scmu_mei) into Professor_Regencia
!insert (jleite, scn_mei) into Professor_Regencia
!insert (jcc, sd_mei) into Professor_Regencia
!insert (cpm, si_mei) into Professor_Regencia
!insert (vad, sma_mei) into Professor_Regencia
!insert (fa, so_mei) into Professor_Regencia
!insert (sc, sr_mei) into Professor_Regencia
!insert (alopes, ssrc_mei) into Professor_Regencia
!insert (hjd, stm_mei) into Professor_Regencia
!insert (mm, taa_mei) into Professor_Regencia
!insert (hjd, tacpd_mei) into Professor_Regencia
!insert (va, taes_mei) into Professor_Regencia
!insert (pm, talmp_mei) into Professor_Regencia
!insert (fba, tapr_mei) into Professor_Regencia
!insert (amm, tasd_mei) into Professor_Regencia
!insert (jcc, tasdia_mei) into Professor_Regencia
!insert (sc, tasi_mei) into Professor_Regencia
!insert (cd, tav_mei) into Professor_Regencia
!insert (smd, tc) into Professor_Regencia
!insert (nmm, tig_mei) into Professor_Regencia
!insert (ludi, ts) into Professor_Regencia
!insert (jddp, tsc) into Professor_Regencia
!insert (pal, ws_mei) into Professor_Regencia
!insert (jja, al_mlc) into Professor_Regencia
!insert (jja, ils_mlc) into Professor_Regencia
!insert (jja, lcp_mlc) into Professor_Regencia

----------------------------------------------------------

!insert (amd, aadm_mei) into Professor_Docencia
!insert (fb, ac) into Professor_Docencia
!insert (fba, adsir) into Professor_Docencia
!insert (mg, aed) into Professor_Docencia
!insert (mg, alga) into Professor_Docencia
!insert (jfs, am1) into Professor_Docencia
!insert (jml, am2) into Professor_Docencia
!insert (ja, apd_mei) into Professor_Docencia
!insert (jalm, as_mei) into Professor_Docencia
!insert (lsr, asd) into Professor_Docencia
!insert (smd, bd) into Professor_Docencia
!insert (apm, cass_mei) into Professor_Docencia
!insert (mmonteiro, cc_mei) into Professor_Docencia
!insert (hjd, ccc_mei) into Professor_Docencia
!insert (ludi, cccpl) into Professor_Docencia
!insert (jddp, cgm) into Professor_Docencia
!insert (arodrigues, clc_mei) into Professor_Docencia
!insert (jmag, cm_mei) into Professor_Docencia
!insert (mmonteiro, cp) into Professor_Docencia
!insert (va, cpd_mei) into Professor_Docencia
!insert (mm, cscs) into Professor_Docencia
!insert (mm, csd_mei) into Professor_Docencia
!insert (herve, csf_mei) into Professor_Docencia
!insert (jja, ctc_mei) into Professor_Docencia
!insert (smd, ctx_mei) into Professor_Docencia
!insert (sc, dm_mei) into Professor_Docencia
!insert (fa, dsoo_mei) into Professor_Docencia
!insert (apm, dw_mei) into Professor_Docencia
!insert (ludi, ea_mei) into Professor_Docencia
!insert (aravara, ec) into Professor_Docencia
!insert (jddp, edai_mei) into Professor_Docencia
!insert (nmm, ee_mei) into Professor_Docencia
!insert (jc, ei_mei) into Professor_Docencia
!insert (arodrigues, erds_mei) into Professor_Docencia
!insert (aravara, ese) into Professor_Docencia
!insert (jalm, f) into Professor_Docencia
!insert (nmp, fsi_mei) into Professor_Docencia
!insert (mmonteiro, fso) into Professor_Docencia
!insert (lm, gcd_mei) into Professor_Docencia
!insert (mmonteiro, gpi_mei) into Professor_Docencia
!insert (jml, ht_mei) into Professor_Docencia
!insert (fba, iio_mei) into Professor_Docencia
!insert (alopes, ip) into Professor_Docencia
!insert (herve, ipm_mei) into Professor_Docencia
!insert (jalm, isrc) into Professor_Docencia
!insert (jalm, ist) into Professor_Docencia
!insert (lsr, ivme) into Professor_Docencia
!insert (jfs, krra) into Professor_Docencia
!insert (jml, lap) into Professor_Docencia
!insert (alopes, lc) into Professor_Docencia
!insert (ludi, lde_mei) into Professor_Docencia
!insert (va, lev_mei) into Professor_Docencia
!insert (jmag, lmcs_mei) into Professor_Docencia
!insert (mm, mad_mei) into Professor_Docencia
!insert (amd, md) into Professor_Docencia
!insert (nmm, mds) into Professor_Docencia
!insert (pal, mlke) into Professor_Docencia
!insert (jmp, onl_mei) into Professor_Docencia
!insert (mm, pc) into Professor_Docencia
!insert (fb, pd_mei) into Professor_Docencia
!insert (asm, pe) into Professor_Docencia
!insert (jalm, pe_mei) into Professor_Docencia
!insert (pm, pgac) into Professor_Docencia
!insert (herve, pmp_mei) into Professor_Docencia
!insert (jja, po_mei) into Professor_Docencia
!insert (nmc, poo) into Professor_Docencia
!insert (fba, qpp_mei) into Professor_Docencia
!insert (jalm, rc) into Professor_Docencia
!insert (fpb, rcr_mei) into Professor_Docencia
!insert (mmonteiro, rct_mei) into Professor_Docencia
!insert (rfm, rdfc_mei) into Professor_Docencia
!insert (jleite, rs) into Professor_Docencia
!insert (jml, sbd_mei) into Professor_Docencia
!insert (jja, scg_mei) into Professor_Docencia
!insert (nmm, scmu_mei) into Professor_Docencia
!insert (cpm, scn_mei) into Professor_Docencia
!insert (fba, sd_mei) into Professor_Docencia
!insert (rfm, si_mei) into Professor_Docencia
!insert (herve, sma_mei) into Professor_Docencia
!insert (pal, so_mei) into Professor_Docencia
!insert (mm, sr_mei) into Professor_Docencia
!insert (asm, ssrc_mei) into Professor_Docencia
!insert (apm, stm_mei) into Professor_Docencia
!insert (jcc, taa_mei) into Professor_Docencia
!insert (jleite, tacpd_mei) into Professor_Docencia
!insert (apm, taes_mei) into Professor_Docencia
!insert (jcc, talmp_mei) into Professor_Docencia
!insert (mmonteiro, tapr_mei) into Professor_Docencia
!insert (hjd, tasd_mei) into Professor_Docencia
!insert (jja, tasdia_mei) into Professor_Docencia
!insert (nmc, tasi_mei) into Professor_Docencia
!insert (jleite, tav_mei) into Professor_Docencia
!insert (alopes, tc) into Professor_Docencia
!insert (jfs, tig_mei) into Professor_Docencia
!insert (pb, ts) into Professor_Docencia
!insert (jalm, tsc) into Professor_Docencia
!insert (ps, ws_mei) into Professor_Docencia
!insert (tir, tasd_mei) into Professor_Docencia
!insert (pm, csd_mei) into Professor_Docencia
!insert (mmonteiro, sma_mei) into Professor_Docencia
!insert (va, pmp_mei) into Professor_Docencia
!insert (snt, sma_mei) into Professor_Docencia
!insert (rfm, talmp_mei) into Professor_Docencia
!insert (lm, ec) into Professor_Docencia
!insert (jcc, cp) into Professor_Docencia
!insert (pal, tasdia_mei) into Professor_Docencia
!insert (amm, rc) into Professor_Docencia
!insert (jmp, asd) into Professor_Docencia
!insert (amd, tasdia_mei) into Professor_Docencia
!insert (fa, tasdia_mei) into Professor_Docencia
!insert (cpm, tasi_mei) into Professor_Docencia
!insert (ludi, mad_mei) into Professor_Docencia
!insert (jc, stm_mei) into Professor_Docencia
!insert (jfs, ei_mei) into Professor_Docencia
!insert (cpm, cgm) into Professor_Docencia
!insert (va, lmcs_mei) into Professor_Docencia
!insert (jfs, csd_mei) into Professor_Docencia
!insert (lsr, cpd_mei) into Professor_Docencia
!insert (fb, ec) into Professor_Docencia
!insert (jcc, rc) into Professor_Docencia
!insert (jmp, ip) into Professor_Docencia
!insert (pal, aed) into Professor_Docencia
!insert (mg, scmu_mei) into Professor_Docencia
!insert (mm, ssrc_mei) into Professor_Docencia
!insert (ja, erds_mei) into Professor_Docencia
!insert (jja, rcr_mei) into Professor_Docencia
!insert (hjd, dm_mei) into Professor_Docencia
!insert (vad, krra) into Professor_Docencia
!insert (va, md) into Professor_Docencia
!insert (sc, po_mei) into Professor_Docencia
!insert (pal, tapr_mei) into Professor_Docencia
!insert (jja, tav_mei) into Professor_Docencia
!insert (herve, alga) into Professor_Docencia
!insert (jml, so_mei) into Professor_Docencia
!insert (fb, cpd_mei) into Professor_Docencia
!insert (jddp, tasi_mei) into Professor_Docencia
!insert (ludi, tav_mei) into Professor_Docencia
!insert (sc, lev_mei) into Professor_Docencia
!insert (smd, ssrc_mei) into Professor_Docencia
!insert (ludi, ssrc_mei) into Professor_Docencia
!insert (mcg, mlke) into Professor_Docencia
!insert (fpb, md) into Professor_Docencia
!insert (ludi, ei_mei) into Professor_Docencia
!insert (amm, qpp_mei) into Professor_Docencia
!insert (sc, tacpd_mei) into Professor_Docencia
!insert (vad, scg_mei) into Professor_Docencia
!insert (alopes, alga) into Professor_Docencia
!insert (tir, lc) into Professor_Docencia
!insert (amd, as_mei) into Professor_Docencia
!insert (pm, talmp_mei) into Professor_Docencia
!insert (nmc, dm_mei) into Professor_Docencia
!insert (ludi, isrc) into Professor_Docencia
!insert (mg, fso) into Professor_Docencia
!insert (jmag, talmp_mei) into Professor_Docencia
!insert (va, tasd_mei) into Professor_Docencia
!insert (jml, krra) into Professor_Docencia
!insert (nmc, taes_mei) into Professor_Docencia
!insert (fa, edai_mei) into Professor_Docencia
!insert (fba, cp) into Professor_Docencia
!insert (arodrigues, scg_mei) into Professor_Docencia
!insert (ja, onl_mei) into Professor_Docencia
!insert (alopes, csd_mei) into Professor_Docencia
!insert (jmp, pe_mei) into Professor_Docencia
!insert (jmp, sbd_mei) into Professor_Docencia
!insert (apm, lde_mei) into Professor_Docencia
!insert (mg, si_mei) into Professor_Docencia
!insert (jmag, scn_mei) into Professor_Docencia
!insert (snt, iio_mei) into Professor_Docencia
!insert (jc, isrc) into Professor_Docencia
!insert (lm, cscs) into Professor_Docencia
!insert (pb, adsir) into Professor_Docencia
!insert (vad, lde_mei) into Professor_Docencia
!insert (jfs, dsoo_mei) into Professor_Docencia
!insert (smd, ee_mei) into Professor_Docencia
!insert (jalm, pe) into Professor_Docencia
!insert (smd, apd_mei) into Professor_Docencia
!insert (mcg, tsc) into Professor_Docencia
!insert (mcg, dsoo_mei) into Professor_Docencia
!insert (jmp, tc) into Professor_Docencia
!insert (asm, pgac) into Professor_Docencia
!insert (jja, ea_mei) into Professor_Docencia
!insert (jml, apd_mei) into Professor_Docencia
!insert (aravara, ipm_mei) into Professor_Docencia
!insert (jddp, cp) into Professor_Docencia
!insert (vad, onl_mei) into Professor_Docencia
!insert (pm, csf_mei) into Professor_Docencia
!insert (vad, gcd_mei) into Professor_Docencia
!insert (apm, rs) into Professor_Docencia
!insert (jmp, taa_mei) into Professor_Docencia
!insert (hjd, am2) into Professor_Docencia
!insert (amd, dw_mei) into Professor_Docencia
!insert (asm, ese) into Professor_Docencia
!insert (fpb, iio_mei) into Professor_Docencia
!insert (nmp, pgac) into Professor_Docencia
!insert (mg, apd_mei) into Professor_Docencia
!insert (jmp, ws_mei) into Professor_Docencia
!insert (aravara, scmu_mei) into Professor_Docencia
!insert (aravara, lap) into Professor_Docencia
!insert (va, rs) into Professor_Docencia
!insert (tir, ts) into Professor_Docencia
!insert (jja, al_mlc) into Professor_Docencia
!insert (jja, ils_mlc) into Professor_Docencia
!insert (jja, lcp_mlc) into Professor_Docencia

----------------------------------------------------------

!create a29322: Aluno	
!set a29322.nome:= 'Ana Catarina Silva Rodrigues'	
!set a29322.numero:= 29322

!create a31207: Aluno	
!set a31207.nome:= 'Ana Sofia Falâncio Marta Canelas'	
!set a31207.numero:= 31207

!create a29421: Aluno	
!set a29421.nome:= 'André Baiôa Simões'	
!set a29421.numero:= 29421

!create a31208: Aluno	
!set a31208.numero:= 31208

!create a29458: Aluno	
!set a29458.nome:= 'André Manuel de Oliveira Almeida Rodrigues'	
!set a29458.numero:= 29458

!create a26651: Aluno	
!set a26651.nome:= 'Arlindo Nazaré Rebelo Lima'	
!set a26651.numero:= 26651

!create a28300: Aluno	
!set a28300.nome:= 'Bernardo Luís da Silva Ferreira'	
!set a28300.numero:= 28300

!create a26631: Aluno	
!set a26631.nome:= 'Bernardo Matos Carrasqueira Figueiredo de Oliveira'	
!set a26631.numero:= 26631

!create a28027: Aluno	
!set a28027.nome:= 'Bruno Miguel de Melo Gonçalves Areal'	
!set a28027.numero:= 28027

!create a19266: Aluno	
!set a19266.nome:= 'Bruno Miguel Inácio Santos'	
!set a19266.numero:= 19266

!create a30228: Aluno	
!set a30228.nome:= 'Catarina Alexandra Marques Gomes'	
!set a30228.numero:= 30228

!create a28053: Aluno	
!set a28053.nome:= 'Cátia Alexandra Matos da Silva'	
!set a28053.numero:= 28053

!create a17662: Aluno	
!set a17662.nome:= 'Cristiano Lopes dos Santos Lopes'	
!set a17662.numero:= 17662

!create a29757: Aluno	
!set a29757.nome:= 'Duarte João Figueira Martins'	
!set a29757.numero:= 29757

!create a29104: Aluno	
!set a29104.nome:= 'Filipe Jorge da Silva Araújo'	
!set a29104.numero:= 29104

!create a31217: Aluno	
!set a31217.nome:= 'Francisco Vitor Gomes Salvador'	
!set a31217.numero:= 31217

!create a31218: Aluno	
!set a31218.nome:= 'Frederic Daniel Jacinto Veiga'	
!set a31218.numero:= 31218

!create a28078: Aluno	
!set a28078.nome:= 'Frederico Diogo Carvalho Ferreira'	
!set a28078.numero:= 28078

!create a29609: Aluno	
!set a29609.nome:= 'João André Quintino de Freitas Farinha'	
!set a29609.numero:= 29609

!create a28045: Aluno	
!set a28045.nome:= 'Jorge André Nogueira Costa'	
!set a28045.numero:= 28045

!create a28059: Aluno	
!set a28059.nome:= 'Jorge Miguel Raposeira Lagarto'	
!set a28059.numero:= 28059

!create a32410: Aluno	
!set a32410.nome:= 'Jose Antonio Barbadillo Alonso'	
!set a32410.numero:= 32410

!create a29399: Aluno	
!set a29399.nome:= 'Luís Filipe da Silva Teixeira'	
!set a29399.numero:= 29399

!create a27226: Aluno	
!set a27226.nome:= 'Luís Manuel Raposo Silva'	
!set a27226.numero:= 27226

!create a28089: Aluno	
!set a28089.nome:= 'Marina Leal Roque'	
!set a28089.numero:= 28089

!create a31226: Aluno	
!set a31226.nome:= 'Márcia Luísa Gomes da Silva'	
!set a31226.numero:= 31226

!create a19172: Aluno	
!set a19172.nome:= 'Márcio Borges Medeiros'	
!set a19172.numero:= 19172

!create a28063: Aluno	
!set a28063.nome:= 'Miguel Brazão Domingues'	
!set a28063.numero:= 28063

!create a29727: Aluno	
!set a29727.nome:= 'Miguel Marinhas da Silva'	
!set a29727.numero:= 29727

!create a29475: Aluno	
!set a29475.nome:= 'Nelson Baptista da Fonte'	
!set a29475.numero:= 29475

!create a28071: Aluno	
!set a28071.nome:= 'Nilza Carina Soares da Silveira'	
!set a28071.numero:= 28071

!create a28074: Aluno	
!set a28074.nome:= 'Nuno Jorge Corvo Parreira'	
!set a28074.numero:= 28074

!create a21144: Aluno	
!set a21144.nome:= 'Nuno Rafael dos Reis Gomes'	
!set a21144.numero:= 21144

!create a32403: Aluno	
!set a32403.nome:= 'Patrícia Barbosa Lecas Espada'	
!set a32403.numero:= 32403

!create a27227: Aluno	
!set a27227.nome:= 'Pedro Hugo do Nascimento Gabriel'	
!set a27227.numero:= 27227

!create a30214: Aluno	
!set a30214.nome:= 'Pedro Miguel da Fonseca Centieiro'	
!set a30214.numero:= 30214

!create a27259: Aluno	
!set a27259.nome:= 'Pedro Miguel Ferreira Costa Monteiro'	
!set a27259.numero:= 27259

!create a19216: Aluno	
!set a19216.nome:= 'Renil Lacmane'	
!set a19216.numero:= 19216

!create a28100: Aluno	
!set a28100.nome:= 'Ricardo Filipe da Cruz dos Santos de Almeida e Silva'	
!set a28100.numero:= 28100

!create a5667: Aluno	
!set a5667.nome:= 'Rui Pedro Rosa Azevedo'	
!set a5667.numero:= 5667

!create a28038: Aluno	
!set a28038.nome:= 'Sérgio Miguel Cachucho Pereira'	
!set a28038.numero:= 28038

!create a26608: Aluno	
!set a26608.nome:= 'Tiago Alexandre Simões Pessoa'	
!set a26608.numero:= 26608

!create a28042: Aluno	
!set a28042.nome:= 'Tiago da Costa e Silva Amorim'	
!set a28042.numero:= 28042

!create a32235: Aluno	
!set a32235.nome:= 'Tiago Henriques de Carvalho'	
!set a32235.numero:= 32235

!create a28023: Aluno	
!set a28023.nome:= 'Tiago Vieira Correia Santos'	
!set a28023.numero:= 28023

!create a26166: Aluno	
!set a26166.nome:= 'Wilson Pickette da Silva Coelho Afonso'	
!set a26166.numero:= 26166


----------------------------------------------------------
!create hoje : CalendarDate
!set hoje.day := 13
!set hoje.month := 10
!set hoje.year := 2009
---------------------------------------------------------

!create mei_29322: Matricula between (a29322, MEI_BASE)	
!set mei_29322.paga := true	
!create dsoo_mei_29322: Inscricao between (a29322, dsoo_mei)	
!set dsoo_mei_29322.resultado := 15	
!set dsoo_mei_29322.dataResultado := hoje

!create mei_31207: Matricula between (a31207, MEI_BASE)	
!set mei_31207.paga := true	
!create dsoo_mei_31207: Inscricao between (a31207, dsoo_mei)	
!set dsoo_mei_31207.resultado := 14	
!set dsoo_mei_31207.dataResultado := hoje

!create mei_29421: Matricula between (a29421, MEI_BASE)	
!set mei_29421.paga := true	
!create dsoo_mei_29421: Inscricao between (a29421, dsoo_mei)	
!set dsoo_mei_29421.resultado := 14	
!set dsoo_mei_29421.dataResultado := hoje

!create mei_31208: Matricula between (a31208, MEI_BASE)	
!set mei_31208.paga := true	
!create dsoo_mei_31208: Inscricao between (a31208, dsoo_mei)	
!set dsoo_mei_31208.resultado := 18	
!set dsoo_mei_31208.dataResultado := hoje

!create mei_29458: Matricula between (a29458, MEI_BASE)	
!set mei_29458.paga := true	
!create dsoo_mei_29458: Inscricao between (a29458, dsoo_mei)	

!create mei_26651: Matricula between (a26651, MEI_BASE)	
!set mei_26651.paga := true	
!create dsoo_mei_26651: Inscricao between (a26651, dsoo_mei)	
!set dsoo_mei_26651.resultado := 11	
!set dsoo_mei_26651.dataResultado := hoje

!create mei_28300: Matricula between (a28300, MEI_BASE)	
!set mei_28300.paga := true	
!create dsoo_mei_28300: Inscricao between (a28300, dsoo_mei)	
!set dsoo_mei_28300.resultado := 15	
!set dsoo_mei_28300.dataResultado := hoje

!create mei_26631: Matricula between (a26631, MEI_BASE)	
!set mei_26631.paga := true	
!create dsoo_mei_26631: Inscricao between (a26631, dsoo_mei)	
!set dsoo_mei_26631.resultado := 18	
!set dsoo_mei_26631.dataResultado := hoje

!create mei_28027: Matricula between (a28027, MEI_BASE)	
!set mei_28027.paga := true	
!create dsoo_mei_28027: Inscricao between (a28027, dsoo_mei)	
!set dsoo_mei_28027.resultado := 10	
!set dsoo_mei_28027.dataResultado := hoje

!create mei_19266: Matricula between (a19266, MEI_BASE)	
!set mei_19266.paga := true	
!create dsoo_mei_19266: Inscricao between (a19266, dsoo_mei)	
!set dsoo_mei_19266.resultado := 13	
!set dsoo_mei_19266.dataResultado := hoje

!create mei_30228: Matricula between (a30228, MEI_BASE)	
!set mei_30228.paga := true	
!create dsoo_mei_30228: Inscricao between (a30228, dsoo_mei)	
!set dsoo_mei_30228.resultado := 11	
!set dsoo_mei_30228.dataResultado := hoje

!create mei_28053: Matricula between (a28053, MEI_BASE)	
!set mei_28053.paga := false
!create dsoo_mei_28053: Inscricao between (a28053, dsoo_mei)	

!create mei_17662: Matricula between (a17662, MEI_BASE)	
!set mei_17662.paga := true	
!create dsoo_mei_17662: Inscricao between (a17662, dsoo_mei)	
!set dsoo_mei_17662.resultado := 17	
!set dsoo_mei_17662.dataResultado := hoje

!create mei_29757: Matricula between (a29757, MEI_BASE)	
!set mei_29757.paga := true	
!create dsoo_mei_29757: Inscricao between (a29757, dsoo_mei)	
!set dsoo_mei_29757.resultado := 19	
!set dsoo_mei_29757.dataResultado := hoje

!create mei_29104: Matricula between (a29104, MEI_BASE)	
!set mei_29104.paga := true	
!create dsoo_mei_29104: Inscricao between (a29104, dsoo_mei)	
!set dsoo_mei_29104.resultado := 11	
!set dsoo_mei_29104.dataResultado := hoje

!create mei_31217: Matricula between (a31217, MEI_BASE)	
!set mei_31217.paga := true	
!create dsoo_mei_31217: Inscricao between (a31217, dsoo_mei)	
!set dsoo_mei_31217.resultado := 18	
!set dsoo_mei_31217.dataResultado := hoje

!create mei_31218: Matricula between (a31218, MEI_BASE)	
!set mei_31218.paga := true	
!create dsoo_mei_31218: Inscricao between (a31218, dsoo_mei)	
!set dsoo_mei_31218.resultado := 18	
!set dsoo_mei_31218.dataResultado := hoje

!create mei_28078: Matricula between (a28078, MEI_BASE)	
!set mei_28078.paga := true	
!create dsoo_mei_28078: Inscricao between (a28078, dsoo_mei)	
!set dsoo_mei_28078.resultado := 10	
!set dsoo_mei_28078.dataResultado := hoje

!create mei_29609: Matricula between (a29609, MEI_BASE)	
!set mei_29609.paga := true	
!create dsoo_mei_29609: Inscricao between (a29609, dsoo_mei)	
!set dsoo_mei_29609.resultado := 16	
!set dsoo_mei_29609.dataResultado := hoje

!create mei_28045: Matricula between (a28045, MEI_BASE)	
!set mei_28045.paga := true	
!create dsoo_mei_28045: Inscricao between (a28045, dsoo_mei)	
!set dsoo_mei_28045.resultado := 11	
!set dsoo_mei_28045.dataResultado := hoje

!create mei_28059: Matricula between (a28059, MEI_BASE)	
!set mei_28059.paga := true	
!create dsoo_mei_28059: Inscricao between (a28059, dsoo_mei)	
!set dsoo_mei_28059.resultado := 16	
!set dsoo_mei_28059.dataResultado := hoje

!create mei_32410: Matricula between (a32410, MEI_BASE)	
!set mei_32410.paga := true	
!create dsoo_mei_32410: Inscricao between (a32410, dsoo_mei)	
!set dsoo_mei_32410.resultado := 12	
!set dsoo_mei_32410.dataResultado := hoje

!create mei_29399: Matricula between (a29399, MEI_BASE)	
!set mei_29399.paga := true	
!create dsoo_mei_29399: Inscricao between (a29399, dsoo_mei)	
!set dsoo_mei_29399.resultado := 14	
!set dsoo_mei_29399.dataResultado := hoje

!create mei_27226: Matricula between (a27226, MEI_BASE)	
!set mei_27226.paga := true	
!create dsoo_mei_27226: Inscricao between (a27226, dsoo_mei)	
!set dsoo_mei_27226.resultado := 10	
!set dsoo_mei_27226.dataResultado := hoje

!create mei_28089: Matricula between (a28089, MEI_BASE)	
!set mei_28089.paga := true	
!create dsoo_mei_28089: Inscricao between (a28089, dsoo_mei)	
!set dsoo_mei_28089.resultado := 15	
!set dsoo_mei_28089.dataResultado := hoje

!create mei_31226: Matricula between (a31226, MEI_BASE)	
!set mei_31226.paga := true	
!create dsoo_mei_31226: Inscricao between (a31226, dsoo_mei)	
!set dsoo_mei_31226.resultado := 16	
!set dsoo_mei_31226.dataResultado := hoje

!create mei_19172: Matricula between (a19172, MEI_BASE)	
!set mei_19172.paga := true	
!create dsoo_mei_19172: Inscricao between (a19172, dsoo_mei)	
!set dsoo_mei_19172.resultado := 12	
!set dsoo_mei_19172.dataResultado := hoje

!create mei_28063: Matricula between (a28063, MEI_BASE)	
!set mei_28063.paga := true	
!create dsoo_mei_28063: Inscricao between (a28063, dsoo_mei)	
!set dsoo_mei_28063.resultado := 12	
!set dsoo_mei_28063.dataResultado := hoje

!create mei_29727: Matricula between (a29727, MEI_BASE)	
!set mei_29727.paga := true	
!create dsoo_mei_29727: Inscricao between (a29727, dsoo_mei)	
!set dsoo_mei_29727.resultado := 12	
!set dsoo_mei_29727.dataResultado := hoje

!create mei_29475: Matricula between (a29475, MEI_BASE)	
!set mei_29475.paga := true	
!create dsoo_mei_29475: Inscricao between (a29475, dsoo_mei)	
!set dsoo_mei_29475.resultado := 18	
!set dsoo_mei_29475.dataResultado := hoje

!create mei_28071: Matricula between (a28071, MEI_BASE)	
!set mei_28071.paga := true	
!create dsoo_mei_28071: Inscricao between (a28071, dsoo_mei)	
!set dsoo_mei_28071.resultado := 14	
!set dsoo_mei_28071.dataResultado := hoje

!create mei_28074: Matricula between (a28074, MEI_BASE)	
!set mei_28074.paga := true	
!create dsoo_mei_28074: Inscricao between (a28074, dsoo_mei)	
!set dsoo_mei_28074.resultado := 18	
!set dsoo_mei_28074.dataResultado := hoje

!create mei_21144: Matricula between (a21144, MEI_BASE)	
!set mei_21144.paga := true	
!create dsoo_mei_21144: Inscricao between (a21144, dsoo_mei)	
!set dsoo_mei_21144.resultado := 18	
!set dsoo_mei_21144.dataResultado := hoje

!create mei_32403: Matricula between (a32403, MEI_BASE)	
!set mei_32403.paga := true	
!create dsoo_mei_32403: Inscricao between (a32403, dsoo_mei)	
!set dsoo_mei_32403.resultado := 18	
!set dsoo_mei_32403.dataResultado := hoje

!create mei_27227: Matricula between (a27227, MEI_BASE)	
!set mei_27227.paga := true	
!create dsoo_mei_27227: Inscricao between (a27227, dsoo_mei)	
!set dsoo_mei_27227.resultado := 11	
!set dsoo_mei_27227.dataResultado := hoje

!create mei_30214: Matricula between (a30214, MEI_BASE)	
!set mei_30214.paga := true	
!create dsoo_mei_30214: Inscricao between (a30214, dsoo_mei)	
!set dsoo_mei_30214.resultado := 15	
!set dsoo_mei_30214.dataResultado := hoje

!create mei_27259: Matricula between (a27259, MEI_BASE)	
!set mei_27259.paga := true	
!create dsoo_mei_27259: Inscricao between (a27259, dsoo_mei)	
!set dsoo_mei_27259.resultado := 11	
!set dsoo_mei_27259.dataResultado := hoje

!create mei_19216: Matricula between (a19216, MEI_BASE)	
!set mei_19216.paga := true	
!create dsoo_mei_19216: Inscricao between (a19216, dsoo_mei)	
!set dsoo_mei_19216.resultado := 16	
!set dsoo_mei_19216.dataResultado := hoje

!create mei_28100: Matricula between (a28100, MEI_BASE)	
!set mei_28100.paga := true	
!create dsoo_mei_28100: Inscricao between (a28100, dsoo_mei)	
!set dsoo_mei_28100.resultado := 10	
!set dsoo_mei_28100.dataResultado := hoje

!create mei_5667: Matricula between (a5667, MEI_BASE)	
!set mei_5667.paga := true	
!create dsoo_mei_5667: Inscricao between (a5667, dsoo_mei)	
!set dsoo_mei_5667.resultado := 11	
!set dsoo_mei_5667.dataResultado := hoje

!create mei_28038: Matricula between (a28038, MEI_BASE)	
!set mei_28038.paga := true	
!create dsoo_mei_28038: Inscricao between (a28038, dsoo_mei)	
!set dsoo_mei_28038.resultado := 11	
!set dsoo_mei_28038.dataResultado := hoje

!create mei_26608: Matricula between (a26608, MEI_BASE)	
!set mei_26608.paga := true	
!create dsoo_mei_26608: Inscricao between (a26608, dsoo_mei)	
!set dsoo_mei_26608.resultado := 17	
!set dsoo_mei_26608.dataResultado := hoje

!create mei_28042: Matricula between (a28042, MEI_BASE)	
!set mei_28042.paga := true	
!create dsoo_mei_28042: Inscricao between (a28042, dsoo_mei)	
!set dsoo_mei_28042.resultado := 17	
!set dsoo_mei_28042.dataResultado := hoje

!create mei_32235: Matricula between (a32235, MEI_BASE)	
!set mei_32235.paga := true	
!create dsoo_mei_32235: Inscricao between (a32235, dsoo_mei)	
!set dsoo_mei_32235.resultado := 19	
!set dsoo_mei_32235.dataResultado := hoje

!create mei_28023: Matricula between (a28023, MEI_BASE)	
!set mei_28023.paga := true	
!create dsoo_mei_28023: Inscricao between (a28023, dsoo_mei)	
!set dsoo_mei_28023.resultado := 18	
!set dsoo_mei_28023.dataResultado := hoje

!create mei_26166: Matricula between (a26166, MEI_BASE)	
!set mei_26166.paga := true	
!create dsoo_mei_26166: Inscricao between (a26166, dsoo_mei)	
!set dsoo_mei_26166.resultado := 10	
!set dsoo_mei_26166.dataResultado := hoje

----------------------------------------------------------
!create a29104_insc1 : Inscricao between (a29104, sd_mei)
!create a29104_insc2 : Inscricao between (a29104, sbd_mei)
!create a29104_insc3 : Inscricao between (a29104, edai_mei)
!create a29104_insc4 : Inscricao between (a29104, rct_mei)
!create a29104_insc5 : Inscricao between (a29104, gcd_mei)
!create a29104_insc6 : Inscricao between (a29104, clc_mei)
!create a29104_insc7 : Inscricao between (a29104, tasi_mei)
!create a29104_insc8 : Inscricao between (a29104, pe_mei)
!create a29104_insc9 : Inscricao between (a29104, ea_mei)
!create a29104_insc10 : Inscricao between (a29104, ht_mei)
!create a29322_insc1 : Inscricao between (a29322, tc)
!create a29322_insc2 : Inscricao between (a29322, si_mei)
!create a29322_insc3 : Inscricao between (a29322, pc)
!create a29322_insc4 : Inscricao between (a29322, ac)
!create a29322_insc5 : Inscricao between (a29322, mds)
!create a29322_insc6 : Inscricao between (a29322, tsc)
!create a29322_insc7 : Inscricao between (a29322, cass_mei)
!create a29322_insc8 : Inscricao between (a29322, ws_mei)
!create a29322_insc9 : Inscricao between (a29322, talmp_mei)
!create a29322_insc10 : Inscricao between (a29322, bd)
!create a29399_insc1 : Inscricao between (a29399, am1)
!create a29399_insc2 : Inscricao between (a29399, clc_mei)
!create a29399_insc3 : Inscricao between (a29399, aed)
!create a29399_insc4 : Inscricao between (a29399, lc)
!create a29399_insc5 : Inscricao between (a29399, cm_mei)
!create a29399_insc6 : Inscricao between (a29399, sr_mei)
!create a29399_insc7 : Inscricao between (a29399, tacpd_mei)
!create a29399_insc8 : Inscricao between (a29399, tasdia_mei)
!create a29399_insc9 : Inscricao between (a29399, ei_mei)
!create a29399_insc10 : Inscricao between (a29399, lev_mei)
!create a29421_insc1 : Inscricao between (a29421, rdfc_mei)
!create a29421_insc2 : Inscricao between (a29421, mlke)
!create a29421_insc3 : Inscricao between (a29421, lde_mei)
!create a29421_insc4 : Inscricao between (a29421, ws_mei)
!create a29421_insc5 : Inscricao between (a29421, cc_mei)
!create a29421_insc6 : Inscricao between (a29421, tasd_mei)
!create a29421_insc7 : Inscricao between (a29421, cm_mei)
!create a29421_insc8 : Inscricao between (a29421, scg_mei)
!create a29421_insc9 : Inscricao between (a29421, isrc)
!create a29421_insc10 : Inscricao between (a29421, tapr_mei)
!create a29458_insc1 : Inscricao between (a29458, lev_mei)
!create a29458_insc2 : Inscricao between (a29458, ese)
!create a29458_insc3 : Inscricao between (a29458, f)
!create a29458_insc4 : Inscricao between (a29458, ccc_mei)
!create a29458_insc5 : Inscricao between (a29458, dw_mei)
!create a29458_insc6 : Inscricao between (a29458, sd_mei)
!create a29458_insc7 : Inscricao between (a29458, as_mei)
!create a29458_insc8 : Inscricao between (a29458, ws_mei)
!create a29458_insc9 : Inscricao between (a29458, alga)
!create a29458_insc10 : Inscricao between (a29458, ei_mei)
!create a29475_insc1 : Inscricao between (a29475, tasi_mei)
!create a29475_insc2 : Inscricao between (a29475, cccpl)
!create a29475_insc3 : Inscricao between (a29475, scn_mei)
!create a29475_insc4 : Inscricao between (a29475, gcd_mei)
!create a29475_insc5 : Inscricao between (a29475, apd_mei)
!create a29475_insc6 : Inscricao between (a29475, pmp_mei)
!create a29475_insc7 : Inscricao between (a29475, tsc)
!create a29475_insc8 : Inscricao between (a29475, lc)
!create a29475_insc9 : Inscricao between (a29475, aed)
!create a29475_insc10 : Inscricao between (a29475, ac)
!create a29609_insc1 : Inscricao between (a29609, ec)
!create a29609_insc2 : Inscricao between (a29609, taes_mei)
!create a29609_insc3 : Inscricao between (a29609, lap)
!create a29609_insc4 : Inscricao between (a29609, mad_mei)
!create a29609_insc5 : Inscricao between (a29609, ei_mei)
!create a29609_insc6 : Inscricao between (a29609, scmu_mei)
!create a29609_insc7 : Inscricao between (a29609, pmp_mei)
!create a29609_insc8 : Inscricao between (a29609, erds_mei)
!create a29609_insc9 : Inscricao between (a29609, so_mei)
!create a29609_insc10 : Inscricao between (a29609, qpp_mei)
!create a29727_insc1 : Inscricao between (a29727, ts)
!create a29727_insc2 : Inscricao between (a29727, am1)
!create a29727_insc3 : Inscricao between (a29727, rdfc_mei)
!create a29727_insc4 : Inscricao between (a29727, taa_mei)
!create a29727_insc5 : Inscricao between (a29727, so_mei)
!create a29727_insc6 : Inscricao between (a29727, tig_mei)
!create a29727_insc7 : Inscricao between (a29727, pgac)
!create a29727_insc8 : Inscricao between (a29727, iio_mei)
!create a29727_insc9 : Inscricao between (a29727, fsi_mei)
!create a29727_insc10 : Inscricao between (a29727, mlke)
!create a29757_insc1 : Inscricao between (a29757, sbd_mei)
!create a29757_insc2 : Inscricao between (a29757, scn_mei)
!create a29757_insc3 : Inscricao between (a29757, mlke)
!create a29757_insc4 : Inscricao between (a29757, lde_mei)
!create a29757_insc5 : Inscricao between (a29757, ec)
!create a29757_insc6 : Inscricao between (a29757, ipm_mei)
!create a29757_insc7 : Inscricao between (a29757, gpi_mei)
!create a29757_insc8 : Inscricao between (a29757, pc)
!create a29757_insc9 : Inscricao between (a29757, aadm_mei)
!create a29757_insc10 : Inscricao between (a29757, cc_mei)
!create a30214_insc1 : Inscricao between (a30214, tasi_mei)
!create a30214_insc2 : Inscricao between (a30214, sbd_mei)
!create a30214_insc3 : Inscricao between (a30214, qpp_mei)
!create a30214_insc4 : Inscricao between (a30214, csf_mei)
!create a30214_insc5 : Inscricao between (a30214, asd)
!create a30214_insc6 : Inscricao between (a30214, dm_mei)
!create a30214_insc7 : Inscricao between (a30214, lmcs_mei)
!create a30214_insc8 : Inscricao between (a30214, ws_mei)
!create a30214_insc9 : Inscricao between (a30214, pe_mei)
!create a30214_insc10 : Inscricao between (a30214, f)
!create a30228_insc1 : Inscricao between (a30228, ee_mei)
!create a30228_insc2 : Inscricao between (a30228, tasd_mei)
!create a30228_insc3 : Inscricao between (a30228, scg_mei)
!create a30228_insc4 : Inscricao between (a30228, ist)
!create a30228_insc5 : Inscricao between (a30228, isrc)
!create a30228_insc6 : Inscricao between (a30228, am2)
!create a30228_insc7 : Inscricao between (a30228, csf_mei)
!create a30228_insc8 : Inscricao between (a30228, sbd_mei)
!create a30228_insc9 : Inscricao between (a30228, qpp_mei)
!create a30228_insc10 : Inscricao between (a30228, ec)
!create a31207_insc1 : Inscricao between (a31207, cass_mei)
!create a31207_insc2 : Inscricao between (a31207, ctx_mei)
!create a31207_insc3 : Inscricao between (a31207, tasd_mei)
!create a31207_insc4 : Inscricao between (a31207, qpp_mei)
!create a31207_insc5 : Inscricao between (a31207, ei_mei)
!create a31207_insc6 : Inscricao between (a31207, rdfc_mei)
!create a31207_insc7 : Inscricao between (a31207, ctc_mei)
!create a31207_insc8 : Inscricao between (a31207, ccc_mei)
!create a31207_insc9 : Inscricao between (a31207, tsc)
!create a31207_insc10 : Inscricao between (a31207, cscs)
!create a31208_insc1 : Inscricao between (a31208, cass_mei)
!create a31208_insc2 : Inscricao between (a31208, qpp_mei)
!create a31208_insc3 : Inscricao between (a31208, tsc)
!create a31208_insc4 : Inscricao between (a31208, ivme)
!create a31208_insc5 : Inscricao between (a31208, cgm)
!create a31208_insc6 : Inscricao between (a31208, dw_mei)
!create a31208_insc7 : Inscricao between (a31208, pmp_mei)
!create a31208_insc8 : Inscricao between (a31208, asd)
!create a31208_insc9 : Inscricao between (a31208, scmu_mei)
!create a31208_insc10 : Inscricao between (a31208, adsir)
!create a31217_insc1 : Inscricao between (a31217, adsir)
!create a31217_insc2 : Inscricao between (a31217, sbd_mei)
!create a31217_insc3 : Inscricao between (a31217, lmcs_mei)
!create a31217_insc4 : Inscricao between (a31217, pmp_mei)
!create a31217_insc5 : Inscricao between (a31217, pe)
!create a31217_insc6 : Inscricao between (a31217, ea_mei)
!create a31217_insc7 : Inscricao between (a31217, cpd_mei)
!create a31217_insc8 : Inscricao between (a31217, dw_mei)
!create a31217_insc9 : Inscricao between (a31217, ei_mei)
!create a31217_insc10 : Inscricao between (a31217, cccpl)
!create a31218_insc1 : Inscricao between (a31218, lde_mei)
!create a31218_insc2 : Inscricao between (a31218, tasi_mei)
!create a31218_insc3 : Inscricao between (a31218, tasdia_mei)
!create a31218_insc4 : Inscricao between (a31218, pd_mei)
!create a31218_insc5 : Inscricao between (a31218, lmcs_mei)
!create a31218_insc6 : Inscricao between (a31218, pgac)
!create a31218_insc7 : Inscricao between (a31218, lev_mei)
!create a31218_insc8 : Inscricao between (a31218, sr_mei)
!create a31218_insc9 : Inscricao between (a31218, cccpl)
!create a31218_insc10 : Inscricao between (a31218, edai_mei)
!create a31226_insc1 : Inscricao between (a31226, pmp_mei)
!create a31226_insc2 : Inscricao between (a31226, aadm_mei)
!create a31226_insc3 : Inscricao between (a31226, so_mei)
!create a31226_insc4 : Inscricao between (a31226, cgm)
!create a31226_insc5 : Inscricao between (a31226, ea_mei)
!create a31226_insc6 : Inscricao between (a31226, tig_mei)
!create a31226_insc7 : Inscricao between (a31226, taes_mei)
!create a31226_insc8 : Inscricao between (a31226, dw_mei)
!create a31226_insc9 : Inscricao between (a31226, qpp_mei)
!create a31226_insc10 : Inscricao between (a31226, ei_mei)
!create a32235_insc1 : Inscricao between (a32235, pmp_mei)
!create a32235_insc2 : Inscricao between (a32235, am1)
!create a32235_insc3 : Inscricao between (a32235, csd_mei)
!create a32235_insc4 : Inscricao between (a32235, pe_mei)
!create a32235_insc5 : Inscricao between (a32235, po_mei)
!create a32235_insc6 : Inscricao between (a32235, mlke)
!create a32235_insc7 : Inscricao between (a32235, tasdia_mei)
!create a32235_insc8 : Inscricao between (a32235, dw_mei)
!create a32235_insc9 : Inscricao between (a32235, ht_mei)
!create a32235_insc10 : Inscricao between (a32235, rc)
!create a32403_insc1 : Inscricao between (a32403, csd_mei)
!create a32403_insc2 : Inscricao between (a32403, ctc_mei)
!create a32403_insc3 : Inscricao between (a32403, qpp_mei)
!create a32403_insc4 : Inscricao between (a32403, lc)
!create a32403_insc5 : Inscricao between (a32403, rs)
!create a32403_insc6 : Inscricao between (a32403, lmcs_mei)
!create a32403_insc7 : Inscricao between (a32403, stm_mei)
!create a32403_insc8 : Inscricao between (a32403, fso)
!create a32403_insc9 : Inscricao between (a32403, scn_mei)
!create a32403_insc10 : Inscricao between (a32403, cass_mei)
!create a32410_insc1 : Inscricao between (a32410, cccpl)
!create a32410_insc2 : Inscricao between (a32410, mds)
!create a32410_insc3 : Inscricao between (a32410, qpp_mei)
!create a32410_insc4 : Inscricao between (a32410, pgac)
!create a32410_insc5 : Inscricao between (a32410, lde_mei)
!create a32410_insc6 : Inscricao between (a32410, dw_mei)
!create a32410_insc7 : Inscricao between (a32410, rct_mei)
!create a32410_insc8 : Inscricao between (a32410, aadm_mei)
!create a32410_insc9 : Inscricao between (a32410, cscs)
!create a32410_insc10 : Inscricao between (a32410, pe_mei)
!create a5667_insc1 : Inscricao between (a5667, krra)
!create a5667_insc2 : Inscricao between (a5667, tig_mei)
!create a5667_insc3 : Inscricao between (a5667, scmu_mei)
!create a5667_insc4 : Inscricao between (a5667, ip)
!create a5667_insc5 : Inscricao between (a5667, rc)
!create a5667_insc6 : Inscricao between (a5667, ccc_mei)
!create a5667_insc7 : Inscricao between (a5667, taa_mei)
!create a5667_insc8 : Inscricao between (a5667, rcr_mei)
!create a5667_insc9 : Inscricao between (a5667, lap)
!create a5667_insc10 : Inscricao between (a5667, ws_mei)
!create a17662_insc1 : Inscricao between (a17662, pgac)
!create a17662_insc2 : Inscricao between (a17662, ctx_mei)
!create a17662_insc3 : Inscricao between (a17662, cscs)
!create a17662_insc4 : Inscricao between (a17662, scmu_mei)
!create a17662_insc5 : Inscricao between (a17662, qpp_mei)
!create a17662_insc6 : Inscricao between (a17662, ei_mei)
!create a17662_insc7 : Inscricao between (a17662, talmp_mei)
!create a17662_insc8 : Inscricao between (a17662, cass_mei)
!create a17662_insc9 : Inscricao between (a17662, apd_mei)
!create a17662_insc10 : Inscricao between (a17662, ws_mei)
!create a19172_insc1 : Inscricao between (a19172, isrc)
!create a19172_insc2 : Inscricao between (a19172, dw_mei)
!create a19172_insc3 : Inscricao between (a19172, si_mei)
!create a19172_insc4 : Inscricao between (a19172, sr_mei)
!create a19172_insc5 : Inscricao between (a19172, apd_mei)
!create a19172_insc6 : Inscricao between (a19172, ivme)
!create a19172_insc7 : Inscricao between (a19172, erds_mei)
!create a19172_insc8 : Inscricao between (a19172, ctx_mei)
!create a19172_insc9 : Inscricao between (a19172, mad_mei)
!create a19172_insc10 : Inscricao between (a19172, qpp_mei)
!create a19216_insc1 : Inscricao between (a19216, mlke)
!create a19216_insc2 : Inscricao between (a19216, as_mei)
!create a19216_insc3 : Inscricao between (a19216, onl_mei)
!create a19216_insc4 : Inscricao between (a19216, sr_mei)
!create a19216_insc5 : Inscricao between (a19216, talmp_mei)
!create a19216_insc6 : Inscricao between (a19216, md)
!create a19216_insc7 : Inscricao between (a19216, cpd_mei)
!create a19216_insc8 : Inscricao between (a19216, so_mei)
!create a19216_insc9 : Inscricao between (a19216, erds_mei)
!create a19216_insc10 : Inscricao between (a19216, cscs)
!create a19266_insc1 : Inscricao between (a19266, md)
!create a19266_insc2 : Inscricao between (a19266, tapr_mei)
!create a19266_insc3 : Inscricao between (a19266, cpd_mei)
!create a19266_insc4 : Inscricao between (a19266, clc_mei)
!create a19266_insc5 : Inscricao between (a19266, ctx_mei)
!create a19266_insc6 : Inscricao between (a19266, ipm_mei)
!create a19266_insc7 : Inscricao between (a19266, tc)
!create a19266_insc8 : Inscricao between (a19266, si_mei)
!create a19266_insc9 : Inscricao between (a19266, scmu_mei)
!create a19266_insc10 : Inscricao between (a19266, as_mei)
!create a21144_insc1 : Inscricao between (a21144, si_mei)
!create a21144_insc2 : Inscricao between (a21144, asd)
!create a21144_insc3 : Inscricao between (a21144, qpp_mei)
!create a21144_insc4 : Inscricao between (a21144, f)
!create a21144_insc5 : Inscricao between (a21144, pmp_mei)
!create a21144_insc6 : Inscricao between (a21144, pe_mei)
!create a21144_insc7 : Inscricao between (a21144, cgm)
!create a21144_insc8 : Inscricao between (a21144, tav_mei)
!create a21144_insc9 : Inscricao between (a21144, lap)
!create a21144_insc10 : Inscricao between (a21144, mds)
!create a26166_insc1 : Inscricao between (a26166, sd_mei)
!create a26166_insc2 : Inscricao between (a26166, rc)
!create a26166_insc3 : Inscricao between (a26166, pe_mei)
!create a26166_insc4 : Inscricao between (a26166, cc_mei)
!create a26166_insc5 : Inscricao between (a26166, mlke)
!create a26166_insc6 : Inscricao between (a26166, ht_mei)
!create a26166_insc7 : Inscricao between (a26166, ec)
!create a26166_insc8 : Inscricao between (a26166, ts)
!create a26166_insc9 : Inscricao between (a26166, erds_mei)
!create a26166_insc10 : Inscricao between (a26166, onl_mei)
!create a26608_insc1 : Inscricao between (a26608, dw_mei)
!create a26608_insc2 : Inscricao between (a26608, pd_mei)
!create a26608_insc3 : Inscricao between (a26608, taes_mei)
!create a26608_insc4 : Inscricao between (a26608, adsir)
!create a26608_insc5 : Inscricao between (a26608, tacpd_mei)
!create a26608_insc6 : Inscricao between (a26608, am1)
!create a26608_insc7 : Inscricao between (a26608, cm_mei)
!create a26608_insc8 : Inscricao between (a26608, sd_mei)
!create a26608_insc9 : Inscricao between (a26608, apd_mei)
!create a26608_insc10 : Inscricao between (a26608, ei_mei)
!create a26631_insc1 : Inscricao between (a26631, pd_mei)
!create a26631_insc2 : Inscricao between (a26631, isrc)
!create a26631_insc3 : Inscricao between (a26631, rdfc_mei)
!create a26631_insc4 : Inscricao between (a26631, am1)
!create a26631_insc5 : Inscricao between (a26631, sma_mei)
!create a26631_insc6 : Inscricao between (a26631, iio_mei)
!create a26631_insc7 : Inscricao between (a26631, talmp_mei)
!create a26631_insc8 : Inscricao between (a26631, pmp_mei)
!create a26631_insc9 : Inscricao between (a26631, ec)
!create a26631_insc10 : Inscricao between (a26631, ctc_mei)
!create a26651_insc1 : Inscricao between (a26651, pe)
!create a26651_insc2 : Inscricao between (a26651, cscs)
!create a26651_insc3 : Inscricao between (a26651, adsir)
!create a26651_insc4 : Inscricao between (a26651, edai_mei)
!create a26651_insc5 : Inscricao between (a26651, cm_mei)
!create a26651_insc6 : Inscricao between (a26651, pe_mei)
!create a26651_insc7 : Inscricao between (a26651, md)
!create a26651_insc8 : Inscricao between (a26651, qpp_mei)
!create a26651_insc9 : Inscricao between (a26651, lev_mei)
!create a26651_insc10 : Inscricao between (a26651, krra)
!create a27226_insc1 : Inscricao between (a27226, ac)
!create a27226_insc2 : Inscricao between (a27226, onl_mei)
!create a27226_insc3 : Inscricao between (a27226, pe_mei)
!create a27226_insc4 : Inscricao between (a27226, sma_mei)
!create a27226_insc5 : Inscricao between (a27226, ws_mei)
!create a27226_insc6 : Inscricao between (a27226, pgac)
!create a27226_insc7 : Inscricao between (a27226, ctx_mei)
!create a27226_insc8 : Inscricao between (a27226, so_mei)
!create a27226_insc9 : Inscricao between (a27226, dm_mei)
!create a27226_insc10 : Inscricao between (a27226, pmp_mei)
!create a27227_insc1 : Inscricao between (a27227, taa_mei)
!create a27227_insc2 : Inscricao between (a27227, scmu_mei)
!create a27227_insc3 : Inscricao between (a27227, gpi_mei)
!create a27227_insc4 : Inscricao between (a27227, cm_mei)
!create a27227_insc5 : Inscricao between (a27227, as_mei)
!create a27227_insc6 : Inscricao between (a27227, bd)
!create a27227_insc7 : Inscricao between (a27227, cpd_mei)
!create a27227_insc8 : Inscricao between (a27227, poo)
!create a27227_insc9 : Inscricao between (a27227, cscs)
!create a27227_insc10 : Inscricao between (a27227, tasd_mei)
!create a27259_insc1 : Inscricao between (a27259, pe)
!create a27259_insc2 : Inscricao between (a27259, gcd_mei)
!create a27259_insc3 : Inscricao between (a27259, scn_mei)
!create a27259_insc4 : Inscricao between (a27259, mds)
!create a27259_insc5 : Inscricao between (a27259, pgac)
!create a27259_insc6 : Inscricao between (a27259, csd_mei)
!create a27259_insc7 : Inscricao between (a27259, poo)
!create a27259_insc8 : Inscricao between (a27259, tasd_mei)
!create a27259_insc9 : Inscricao between (a27259, qpp_mei)
!create a27259_insc10 : Inscricao between (a27259, ese)
!create a28023_insc1 : Inscricao between (a28023, cpd_mei)
!create a28023_insc2 : Inscricao between (a28023, ac)
!create a28023_insc4 : Inscricao between (a28023, so_mei)
!create a28023_insc5 : Inscricao between (a28023, am1)
!create a28023_insc6 : Inscricao between (a28023, ts)
!create a28023_insc7 : Inscricao between (a28023, scmu_mei)
!create a28023_insc8 : Inscricao between (a28023, isrc)
!create a28023_insc9 : Inscricao between (a28023, tav_mei)
!create a28023_insc10 : Inscricao between (a28023, erds_mei)
!create a28027_insc1 : Inscricao between (a28027, onl_mei)
!create a28027_insc2 : Inscricao between (a28027, pc)
!create a28027_insc3 : Inscricao between (a28027, ee_mei)
!create a28027_insc4 : Inscricao between (a28027, sd_mei)
!create a28027_insc5 : Inscricao between (a28027, poo)
!create a28027_insc6 : Inscricao between (a28027, clc_mei)
!create a28027_insc7 : Inscricao between (a28027, iio_mei)
!create a28027_insc8 : Inscricao between (a28027, lap)
!create a28027_insc9 : Inscricao between (a28027, qpp_mei)
!create a28027_insc10 : Inscricao between (a28027, mlke)
!create a28038_insc1 : Inscricao between (a28038, ts)
!create a28038_insc2 : Inscricao between (a28038, as_mei)
!create a28038_insc3 : Inscricao between (a28038, rdfc_mei)
!create a28038_insc4 : Inscricao between (a28038, cscs)
!create a28038_insc5 : Inscricao between (a28038, fso)
!create a28038_insc6 : Inscricao between (a28038, qpp_mei)
!create a28038_insc7 : Inscricao between (a28038, asd)
!create a28038_insc8 : Inscricao between (a28038, onl_mei)
!create a28038_insc9 : Inscricao between (a28038, isrc)
!create a28038_insc10 : Inscricao between (a28038, erds_mei)
!create a28042_insc1 : Inscricao between (a28042, dw_mei)
!create a28042_insc2 : Inscricao between (a28042, sbd_mei)
!create a28042_insc3 : Inscricao between (a28042, tig_mei)
!create a28042_insc4 : Inscricao between (a28042, ec)
!create a28042_insc5 : Inscricao between (a28042, mlke)
!create a28042_insc6 : Inscricao between (a28042, qpp_mei)
!create a28042_insc7 : Inscricao between (a28042, csd_mei)
!create a28042_insc8 : Inscricao between (a28042, talmp_mei)
!create a28042_insc9 : Inscricao between (a28042, fso)
!create a28042_insc10 : Inscricao between (a28042, adsir)
!create a28045_insc1 : Inscricao between (a28045, onl_mei)
!create a28045_insc2 : Inscricao between (a28045, tig_mei)
!create a28045_insc3 : Inscricao between (a28045, cgm)
!create a28045_insc4 : Inscricao between (a28045, ip)
!create a28045_insc5 : Inscricao between (a28045, qpp_mei)
!create a28045_insc6 : Inscricao between (a28045, sbd_mei)
!create a28045_insc7 : Inscricao between (a28045, cass_mei)
!create a28045_insc8 : Inscricao between (a28045, bd)
!create a28045_insc9 : Inscricao between (a28045, ts)
!create a28045_insc10 : Inscricao between (a28045, rcr_mei)
!create a28053_insc1 : Inscricao between (a28053, onl_mei)
!create a28053_insc2 : Inscricao between (a28053, qpp_mei)
!create a28053_insc3 : Inscricao between (a28053, f)
!create a28053_insc4 : Inscricao between (a28053, mad_mei)
!create a28053_insc5 : Inscricao between (a28053, stm_mei)
!create a28053_insc6 : Inscricao between (a28053, cp)
!create a28053_insc7 : Inscricao between (a28053, csf_mei)
!create a28053_insc8 : Inscricao between (a28053, fsi_mei)
!create a28053_insc9 : Inscricao between (a28053, ws_mei)
!create a28053_insc10 : Inscricao between (a28053, pe_mei)
!create a28059_insc1 : Inscricao between (a28059, cscs)
!create a28059_insc2 : Inscricao between (a28059, qpp_mei)
!create a28059_insc3 : Inscricao between (a28059, as_mei)
!create a28059_insc4 : Inscricao between (a28059, lmcs_mei)
!create a28059_insc5 : Inscricao between (a28059, ist)
!create a28059_insc6 : Inscricao between (a28059, ese)
!create a28059_insc7 : Inscricao between (a28059, tapr_mei)
!create a28059_insc8 : Inscricao between (a28059, bd)
!create a28059_insc9 : Inscricao between (a28059, clc_mei)
!create a28059_insc10 : Inscricao between (a28059, csf_mei)
!create a28063_insc1 : Inscricao between (a28063, edai_mei)
!create a28063_insc2 : Inscricao between (a28063, ese)
!create a28063_insc3 : Inscricao between (a28063, f)
!create a28063_insc4 : Inscricao between (a28063, ist)
!create a28063_insc5 : Inscricao between (a28063, taa_mei)
!create a28063_insc6 : Inscricao between (a28063, ei_mei)
!create a28063_insc7 : Inscricao between (a28063, rc)
!create a28063_insc8 : Inscricao between (a28063, dw_mei)
!create a28063_insc9 : Inscricao between (a28063, asd)
!create a28063_insc10 : Inscricao between (a28063, tasi_mei)
!create a28071_insc : Inscricao between (a28071, rc)
!create a28071_insc1 : Inscricao between (a28071, cgm)
!create a28071_insc2 : Inscricao between (a28071, stm_mei)
!create a28071_insc3 : Inscricao between (a28071, fsi_mei)
!create a28071_insc4 : Inscricao between (a28071, ctc_mei)
!create a28071_insc5 : Inscricao between (a28071, sr_mei)
!create a28071_insc6 : Inscricao between (a28071, cp)
!create a28071_insc7 : Inscricao between (a28071, pgac)
!create a28071_insc8 : Inscricao between (a28071, apd_mei)
!create a28071_insc9 : Inscricao between (a28071, tav_mei)
!create a28071_insc10 : Inscricao between (a28071, aadm_mei)
!create a28074_insc1 : Inscricao between (a28074, sr_mei)
!create a28074_insc2 : Inscricao between (a28074, dm_mei)
!create a28074_insc3 : Inscricao between (a28074, gcd_mei)
!create a28074_insc4 : Inscricao between (a28074, pc)
!create a28074_insc5 : Inscricao between (a28074, cc_mei)
!create a28074_insc6 : Inscricao between (a28074, clc_mei)
!create a28074_insc7 : Inscricao between (a28074, so_mei)
!create a28074_insc8 : Inscricao between (a28074, ssrc_mei)
!create a28074_insc9 : Inscricao between (a28074, tig_mei)
!create a28074_insc10 : Inscricao between (a28074, rcr_mei)
!create a28078_insc1 : Inscricao between (a28078, sr_mei)
!create a28078_insc2 : Inscricao between (a28078, so_mei)
!create a28078_insc3 : Inscricao between (a28078, taa_mei)
!create a28078_insc4 : Inscricao between (a28078, scn_mei)
!create a28078_insc5 : Inscricao between (a28078, cp)
!create a28078_insc6 : Inscricao between (a28078, qpp_mei)
!create a28078_insc7 : Inscricao between (a28078, ssrc_mei)
!create a28078_insc8 : Inscricao between (a28078, md)
!create a28078_insc9 : Inscricao between (a28078, fsi_mei)
!create a28078_insc10 : Inscricao between (a28078, cccpl)
!create a28089_insc1 : Inscricao between (a28089, mad_mei)
!create a28089_insc2 : Inscricao between (a28089, fsi_mei)
!create a28089_insc3 : Inscricao between (a28089, tig_mei)
!create a28089_insc4 : Inscricao between (a28089, scmu_mei)
!create a28089_insc5 : Inscricao between (a28089, krra)
!create a28089_insc6 : Inscricao between (a28089, ht_mei)
!create a28089_insc7 : Inscricao between (a28089, md)
!create a28089_insc8 : Inscricao between (a28089, rs)
!create a28089_insc9 : Inscricao between (a28089, aed)
!create a28089_insc10 : Inscricao between (a28089, scg_mei)
!create a28100_insc1 : Inscricao between (a28100, mlke)
!create a28100_insc2 : Inscricao between (a28100, sma_mei)
!create a28100_insc3 : Inscricao between (a28100, ei_mei)
!create a28100_insc4 : Inscricao between (a28100, mds)
!create a28100_insc5 : Inscricao between (a28100, ccc_mei)
!create a28100_insc6 : Inscricao between (a28100, po_mei)
!create a28100_insc7 : Inscricao between (a28100, tasdia_mei)
!create a28100_insc8 : Inscricao between (a28100, bd)
!create a28100_insc9 : Inscricao between (a28100, ctx_mei)
!create a28100_insc10 : Inscricao between (a28100, cgm)
!create a28300_insc1 : Inscricao between (a28300, cp)
!create a28300_insc2 : Inscricao between (a28300, erds_mei)
!create a28300_insc3 : Inscricao between (a28300, ist)
!create a28300_insc4 : Inscricao between (a28300, tav_mei)
!create a28300_insc5 : Inscricao between (a28300, pe_mei)
!create a28300_insc6 : Inscricao between (a28300, alga)
!create a28300_insc7 : Inscricao between (a28300, csd_mei)
!create a28300_insc8 : Inscricao between (a28300, ip)
!create a28300_insc9 : Inscricao between (a28300, fsi_mei)
!create a28300_insc10 : Inscricao between (a28300, rc)
---------------------------------------------------------
info state
check

package com.aistudio.ajtech.ecosystem.data.repository

import com.aistudio.ajtech.ecosystem.data.model.BookChapter
import com.aistudio.ajtech.ecosystem.data.model.BookContentStatus
import com.aistudio.ajtech.ecosystem.data.model.BookPart
import com.aistudio.ajtech.ecosystem.data.model.PartType

/**
 * PARTIE III — LES 21 ENTITÉS DE L'ÉCOSYSTÈME AJ-
 * Chapitres 25 à 45 (Exactement 21 entités, avec 18 rubriques obligatoires chacune).
 */
object Part3Data {

    val part3: BookPart = BookPart(
        id = "part_3",
        partNumber = 3,
        type = PartType.MAIN_PART,
        titleFr = "PARTIE III — LES 21 ENTITÉS DE L'ÉCOSYSTÈME AJ-",
        titleHt = "PATI III — 21 ANTITE KI NAN EKOSISTÈM AJ- LA",
        subtitleFr = "Cartographie encyclopédique, fiches d'ingénierie et feuilles de route 2026–2035",
        subtitleHt = "Katografi ansiklopedi, fich enjenyri ak plan wout 2026–2035",
        plannedPages = "pp. 125–230",
        status = BookContentStatus.IN_PROGRESS,
        chapters = listOf(
            // ==================== CHAPITRE 25 : AJ-TECH ====================
            BookChapter(
                id = "ch_3_25",
                chapterNumber = 25,
                partId = "part_3",
                titleFr = "Chapitre 25 — AJ-TECH : le noyau fondateur",
                titleHt = "Chapit 25 — AJ-TECH : nwayo fondatè a",
                subtitleFr = "L'entreprise mère, gouvernance et clé de voûte de l'écosystème",
                subtitleHt = "Manman konpayi an, gouvènans ak poto mitan ekosistèm nan",
                summaryFr = "Fiche d'ingénierie et gouvernance du noyau central AJ-TECH, fondé à Port-au-Prince en 2025.",
                summaryHt = "Fich enjenyri ak gouvènans nwayo santral AJ-TECH la, ki te fonde nan Pòtoprens an 2025.",
                contentFr = """
                    1. Nom : AJ-TECH (L'Écosystème Numérique Haïtien & Entreprise Mère).
                    
                    2. Statut actuel officiel : CONCEPT / EN CONSTRUCTION. Fondée officiellement en 2025 à Port-au-Prince, Haïti, par Jonathan Germain. AJ-TECH se définit comme une entreprise ambitieuse en construction qui documente honnêtement son chemin vers le sommet.
                    
                    3. Origine du concept : Constat de la dépendance numérique absolue d'Haïti vis-à-vis d'outils étrangers inadaptés aux réalités locales, et volonté d'ériger une infrastructure technologique nationale souveraine.
                    
                    4. Mission : Mettre Haïti sur l'échelle mondiale dans la technologie et faciliter l'accès de tous à la technologie.
                    
                    5. Vision : Devenir un géant de la technologie.
                    
                    6. Problème résolu : Absence d'écosystème numérique intégré, dispersion des initiatives logicielles et fuite des capitaux pour des services cloud et digitaux extérieurs.
                    
                    7. Solution proposée : Un écosystème modulaire unifié de 21 entités technologiques interconnectées par des protocoles partagés, une identité unique et une haute exigence de souveraineté.
                    
                    8. Public cible : Citoyens haïtiens, entreprises locales, diaspora, institutions publiques et partenaires technologiques internationaux.
                    
                    9. Fonctionnalités principales :
                    - Gouvernance centrale et garant des standards de qualité de l'écosystème ;
                    - Gestion de l'identité numérique unique transversale (AJ-ID) ;
                    - API Gateway centralisée et coordination des protocoles de synchronisation offline-first ;
                    - Cadre éthique, sécurité et contrôle de conformité des données.
                    
                    10. Architecture technique : Architecture microservices distribuée, API Gateway unifiée, protocoles de synchronisation offline-first et stockage hybride local/cloud.
                    
                    11. Technologies envisagées : Kotlin Multiplatform, Jetpack Compose, Node.js / TypeScript, PostgreSQL, PWA Architecture, protocoles gRPC / REST.
                    
                    12. Intelligence artificielle : Moteur central d'assistance contextuelle bilingue (Français / Créole) via AJ-Assistant et intégration de modèles d'IA générative et d'analyse prédictive.
                    
                    13. Sécurité : Chiffrement AES-256 de bout en bout, authentification multi-facteurs (MFA), conformité aux normes internationales de protection de la vie privée (RGPD / standards équivalents).
                    
                    14. Modèle économique : En cours de conception (Abonnements SaaS modulaires, licences d'infrastructure, services professionnels d'ingénierie et partenariats institutionnels).
                    
                    15. Intégration avec AJ-TECH : Constitue la maison-mère, le socle architectural et l'autorité de gouvernance pour l'ensemble des entités.
                    
                    16. Relations avec les autres entités : Connecté directement et transversalement à l'ensemble des 20 autres entités de l'écosystème.
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2025–2027) : Structuration juridique et technique, publication du socle open-source documentaire et développement des premières entités pilotes ;
                    - Moyen terme (2028–2030) : Déploiement de l'infrastructure cloud souveraine (AJ-Cloud) et interconnexion des 21 piliers applicatifs ;
                    - Long terme (2031–2035) : Consolidation de l'écosystème complet, autonomie financière durable et rayonnement caribéen.
                    
                    18. Perspectives internationales : Positionner Haïti comme un pôle caribéen d'ingénierie logicielle et exporter la suite logicielle souveraine auprès des marchés émergents et de la diaspora.
                """.trimIndent(),
                contentHt = """
                    1. Non : AJ-TECH (Ekosistèm Dijital Ayisyen & Manman Konpayi).
                    
                    2. Estati ofisyèl kounye a : KONSÈP / AP KONSTWI. Te fonde ofisyèlman an 2025 nan Pòtoprens, Ayiti, pa Jonathan Germain. AJ-TECH defini tèt li kòm yon antrepriz anbisye k ap konstwi ki dokimante vwayaj li nan tout verite pandan l ap monte nan somè a.
                    
                    3. Orijin konsèp la : Konsta gwo depandans nimerik Ayiti sou zouti etranje ki pa adapte ak reyalite peyi a, ak volonte pou bati yon enfrastrikti teknolojik nasyonal ki souveren.
                    
                    4. Misyon : Mete Ayiti sou echèl mondyal nan teknoloji epi fasilite tout moun jwenn aksè ak teknoloji a.
                    
                    5. Vizyon : Vin tounen yon jeyan nan teknoloji.
                    
                    6. Pwoblèm li rezoud : Mank yon ekosistèm nimerik entegre, eparpiyman inisyativ lojisyèl yo ak lajan k ap soti nan peyi a pou peye sèvis cloud etranje.
                    
                    7. Solisyon li pote : Yon ekosistèm modilè inifye ki gen 21 antite teknolojik ki konekte ansanm ak pwotokòl pataje, yon idantite inik ak yon gwo respè pou souverènte done yo.
                    
                    8. Moun li vize : Sitwayen ayisyen, antrepriz lokal, dyaspora, enstitisyon leta ak patnè teknolojik entènasyonal.
                    
                    9. Fonksyonalite prensipal yo :
                    - Gouvènans santral ak garanti tout estanda kalite nan tout ekosistèm nan ;
                    - Jesyon idantite dijital inik pou tout aplikasyon yo (AJ-ID) ;
                    - API Gateway santralize ak kowòdinasyon pwotokòl pou travay san entènèt (offline-first) ;
                    - Kad etik, sekirite ak kontwòl sou pwoteksyon lavi prive.
                    
                    10. Arkitekti teknik : Arkitekti mikwosèvis distribye, API Gateway inifye, pwotokòl senkronizasyon offline-first ak depo ibrid lokal/cloud.
                    
                    11. Teknoloji yo prevwa itilize : Kotlin Multiplatform, Jetpack Compose, Node.js / TypeScript, PostgreSQL, Arkitekti PWA, pwotokòl gRPC / REST.
                    
                    12. Entèlijans atifisyèl : Motè santral asistans kontèktyèl bileng (Fransè / Kreyòl) gras ak AJ-Assistant ak modèl entèlijans atifisyèl pou analiz ak previzyon.
                    
                    13. Sekirite : Chifreman AES-256 bout-an-bout, otantifikasyon milti-faktè (MFA), respè estanda entènasyonal sou pwoteksyon done pèsonèl.
                    
                    14. Modèl ekonomik : An kou konsepsyon (Abònman SaaS modilè, lisans enfrastrikti, sèvis jeni pwofesyonèl ak patenarya enstitisyonèl).
                    
                    15. Entegrasyon ak AJ-TECH : Reprezante manman konpayi an, baz achitekti a ak otorite ki kontwole tout rès antite yo.
                    
                    16. Relasyon ak lòt antite yo : Konekte dirèkteman ak tout 20 lòt antite ki nan ekosistèm nan.
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2025–2027) : Estriktirasyon legal ak teknik, piblikasyon dokimantasyon ouvè ak devlopman premye antite pilòt yo ;
                    - Mwayen tèm (2028–2030) : Deplwaman enfrastrikti cloud souveren (AJ-Cloud) ak entèkoneksyon 21 poto mitan yo ;
                    - Long tèm (2031–2035) : Konsolidasyon ekosistèm konplè a, otonomi finansyè solid ak prezans nan tout Karayib la.
                    
                    18. Pèspektiv entènasyonal : Pozisyone Ayiti kòm yon poto mitan karibeyen nan jeni lojisyèl epi ekspòte solisyon sa yo bay lòt peyi k ap devlope ak nan dyaspora a.
                """.trimIndent(),
                plannedStartPage = 125,
                plannedEndPage = 129,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 26 : AJ-Task ====================
            BookChapter(
                id = "ch_3_26",
                chapterNumber = 26,
                partId = "part_3",
                titleFr = "Chapitre 26 — AJ-Task",
                titleHt = "Chapit 26 — AJ-Task",
                subtitleFr = "Gestionnaire de tâches et de projets collaboratif (PWA)",
                subtitleHt = "Jesyonè travay ak pwojè kolaboratif (PWA)",
                summaryFr = "Présentation détaillée d'AJ-Task, PWA la plus avancée de l'écosystème, actuellement en phase de test pilote.",
                summaryHt = "Prezantasyon detaye sou AJ-Task, PWA ki pi avanse nan ekosistèm nan kounye a, k ap teste pa itilizatè pilòt.",
                contentFr = """
                    1. Nom : AJ-Task (Gestionnaire de Tâches & Projets Collaboratif PWA).
                    
                    2. Statut actuel officiel : EN DÉVELOPPEMENT / PROTOTYPE AVANCÉ. AJ-Task est une Progressive Web App (PWA), reconnue comme le produit le plus avancé de l'écosystème AJ-TECH. Elle est actuellement en phase de test pilote auprès d'utilisateurs restreints, sans être commercialisée officiellement à ce jour.
                    
                    3. Origine du concept : Conçu pour répondre aux besoins critiques d'organisation et de productivité des indépendants et équipes haïtiennes souvent confrontés à l'instabilité de l'accès à Internet.
                    
                    4. Mission : Optimiser la productivité individuelle et collective grâce à un outil ultra-léger, intuitif et résilient face aux coupures réseau.
                    
                    5. Vision : Devenir la référence incontournable de la gestion de projets en Haïti et dans la Caraïbe francophone et créolophone.
                    
                    6. Problème résolu : Inaccessibilité et lenteur des outils internationaux (Trello, Asana, Monday) qui cessent de fonctionner en cas de rupture de connexion et imposent des coûts récurrents élevés.
                    
                    7. Solution proposée : Une Progressive Web App (PWA) Offline-First ultra-réactive, stockant les tâches localement avec synchronisation intelligente dès le retour d'une connexion réseau.
                    
                    8. Public cible : Freelances, étudiants, chefs de projets, PME, associations et organisations décentralisées.
                    
                    9. Fonctionnalités principales :
                    - Mode Hors-ligne intégral (Offline-First) sans interruption de travail ;
                    - Tableaux Kanban interactifs avec glisser-déposer ;
                    - Gestion des priorités, échéances, étiquettes et descriptions de tâches ;
                    - Synchronisation automatique et export des données.
                    
                    10. Architecture technique : PWA Single Page Application (SPA), stockage local via IndexedDB, Service Workers pour la mise en cache agressive et API REST pour la synchronisation montante.
                    
                    11. Technologies envisagées : Progressive Web App (PWA), TypeScript, HTML5 / CSS3 moderne, IndexedDB, Service Workers API.
                    
                    12. Intelligence artificielle : Suggestions de priorisation automatique des tâches et estimations de charge de travail (en cours de conception).
                    
                    13. Sécurité : Chiffrement local des données dans le navigateur et transferts HTTPS sécurisés avec clés de session éphémères.
                    
                    14. Modèle économique : Version de base gratuite pour les particuliers, abonnements premium prévus pour les fonctionnalités collaboratives d'entreprise.
                    
                    15. Intégration avec AJ-TECH : Utilisation du protocole d'authentification AJ-ID et sauvegarde cloud sur AJ-Cloud.
                    
                    16. Relations avec les autres entités : Connecté à AJ-Cloud pour la persistance distante, AJ-Assistant pour l'aide contextuelle et AJ-Meet pour les réunions d'équipe.
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2025–2027) : Finalisation des tests pilotes PWA, optimisation de la synchronisation hors-ligne et ouverture d'une version bêta publique ;
                    - Moyen terme (2028–2030) : Lancement des déclinaisons applicatives natives (Android/iOS) et intégration des espaces collaboratifs d'entreprise ;
                    - Long terme (2031–2035) : Déploiement à grande échelle dans les administrations et universités de la région caribéenne.
                    
                    18. Perspectives internationales : Potentiel d'adoption auprès des travailleurs indépendants et équipes décentralisées de la diaspora haïtienne et des pays du Sud global.
                """.trimIndent(),
                contentHt = """
                    1. Non : AJ-Task (Jesyonè Travay & Pwojè Kolaboratif PWA).
                    
                    2. Estati ofisyèl kounye a : AN DEVLOPMAN / PWOTOTIP AVANSE. AJ-Task se yon Progressive Web App (PWA), li se pwodui ki pi avanse nan ekosistèm AJ-TECH la kounye a. Li nan faz tès pilòt ak kèk itilizatè, men li poko komèsyalize ofisyèlman jodi a.
                    
                    3. Orijin konsèp la : Te fèt pou reponn ak gwo bezwen òganizasyon ak travay pou moun k ap travay poukont yo ak ekip an Ayiti ki souvan konfwonte ak pann entènèt.
                    
                    4. Misyon : Ogmante pwodiktivite chak moun ak ekip gras ak yon zouti ki lejè anpil, ki senp epi ki pa janm bloke lè entènèt koupe.
                    
                    5. Vizyon : Vin tounen referans prensipal nan jesyon pwojè an Ayiti ak nan tout Karayib la.
                    
                    6. Pwoblèm li rezoud : Zouti etranje yo (Trello, Asana) lou, koute chè epi yo pa ka fonksyone lè pa gen entènèt kontinyèl.
                    
                    7. Solisyon li pote : Yon Progressive Web App (PWA) Offline-First ki rapid anpil, ki sere tout travay yo sou aparèy la epi ki senkronize otomatikman kou entènèt retounen.
                    
                    8. Moun li vize : Travayè endepandan, etidyan, chèf pwojè, ti antrepriz, asosyasyon ak ekip k ap travay a distans.
                    
                    9. Fonksyonalite prensipal yo :
                    - Fonksyone san entènèt (Offline-First) a 100% san rete travay ;
                    - Tablo Kanban entèaktif pou deplase travay fasil ;
                    - Jesyon priyorite, dat limit, kategori ak nòt detaye sou chak travay ;
                    - Senkronizasyon otomatik ak posiblite pou ekspòte done yo.
                    
                    10. Arkitekti teknik : PWA Single Page Application (SPA), depo lokal ak IndexedDB, Service Workers pou kenbe paj yo nan kach, ak API REST pou voye done sou sèvè.
                    
                    11. Teknoloji yo prevwa itilize : Progressive Web App (PWA), TypeScript, HTML5 / CSS3 modèn, IndexedDB, API Service Workers.
                    
                    12. Entèlijans atifisyèl : Konsèy sou kijan pou klase travay ki pi enpòtan yo ak kalkil sou tan travay yo ka pran (an kou konsepsyon).
                    
                    13. Sekirite : Chifreman done lokal yo nan navigatè a ak transfè HTTPS an sekirite ak kle sesyon pwoteje.
                    
                    14. Modèl ekonomik : Vèsyon debaz gratis pou moun senp, fòmil abònman primyòm prevwa pou biznis ak gwo ekip.
                    
                    15. Entegrasyon ak AJ-TECH : Itilize sistèm koneksyon AJ-ID ak sovgad sou AJ-Cloud.
                    
                    16. Relasyon ak lòt antite yo : Konekte ak AJ-Cloud pou depo done, AJ-Assistant pou ede itilizatè a, ak AJ-Meet pou reyinyon sou pwojè yo.
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2025–2027) : Fini faz tès pilòt PWA a, optimize senkronizasyon san entènèt epi louvri yon vèsyon béta piblik ;
                    - Mwayen tèm (2028–2030) : Kreye vèsyon aplikasyon natif (Android/iOS) epi entegre espas travay pou gwo antrepriz ;
                    - Long tèm (2031–2035) : Itilizasyon nan gwo administrasyon ak inivèsite nan tout rejyon Karayib la.
                    
                    18. Pèspektiv entènasyonal : Posiblite pou anpil travayè endepandan ak ekip nan dyaspora ayisyen an ak lòt peyi k ap devlope itilize li.
                """.trimIndent(),
                plannedStartPage = 130,
                plannedEndPage = 134,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 27 : AJ-Tè ====================
            BookChapter(
                id = "ch_3_27",
                chapterNumber = 27,
                partId = "part_3",
                titleFr = "Chapitre 27 — AJ-Tè",
                titleHt = "Chapit 27 — AJ-Tè",
                subtitleFr = "Cadastre numérique et sécurisation foncière",
                subtitleHt = "Kadas dijital ak sekirizasyon tè",
                summaryFr = "Fiche d'ingénierie d'AJ-Tè, projet de registre cadastral géoréférencé pour la protection des droits de propriété en Haïti.",
                summaryHt = "Fich enjenyri sou AJ-Tè, pwojè rejis kadas jeyoreferanse pou pwoteje dwa sou zafè tè an Ayiti.",
                contentFr = """
                    1. Nom : AJ-Tè (Cadastre Numérique & Sécurisation Foncière).
                    
                    2. Statut actuel officiel : CONCEPT / EN CONCEPTION. Projet théorique et architectural visant à répondre à la crise foncière nationale.
                    
                    3. Origine du concept : Constat des conflits fonciers majeurs, de la superposition des titres de propriété et de la fragilité des archives physiques en Haïti.
                    
                    4. Mission : Sécuriser les droits de propriété foncière et fiabiliser les délimitations territoriales grâce à des outils géospatiaux modernes.
                    
                    5. Vision : Établir un cadastre national transparent, inviolable et accessible pour la paix sociale et l'investissement durable.
                    
                    6. Problème résolu : Spoliations de terrains, faux actes notariés, absence de délimitation GPS certifiée et engorgement des tribunaux par les litiges terriens.
                    
                    7. Solution proposée : Un registre foncier numérique géolocalisé associant cartographie satellitaire haute résolution, horodatage certifié et traçabilité des mutations.
                    
                    8. Public cible : Propriétaires terriens, notaires, arpenteurs géomètres, mairies, Direction Générale des Impôts (DGI) et diaspora.
                    
                    9. Fonctionnalités principales :
                    - Délimitation géoréférencée des parcelles avec bornage GPS précis ;
                    - Registre immuable de l'historique des transferts et mutations foncières ;
                    - Détection algorithmique des chevauchements et conflits de limites ;
                    - Consultation sécurisée des extraits cadastraux certifiés.
                    
                    10. Architecture technique : Système d'Information Géographique (SIG) spatialisé, base de données géospatiale relationnelle et registre distribué avec signatures cryptographiques.
                    
                    11. Technologies envisagées : PostGIS, Leaflet / Mapbox GL, Kotlin backend, PostgreSQL spatial, protocoles de signature numérique.
                    
                    12. Intelligence artificielle : Analyse d'images satellites pour la détection automatique des anomalies de parcellisation et l'évolution de l'occupation des sols.
                    
                    13. Sécurité : Registres infalsifiables, authentification forte des officiers publics (notaires, arpenteurs) et horodatage sécurisé des transactions.
                    
                    14. Modèle économique : À définir (Frais forfaitaires de certification de parcelles, abonnements professionnels pour notaires et géomètres, licences institutionnelles).
                    
                    15. Intégration avec AJ-TECH : Hébergement des données sur AJ-Cloud et authentification des professionnels via AJ-ID.
                    
                    16. Relations avec les autres entités : Connecté à AJ-Maps pour les couches cartographiques, AJ-Pay pour le règlement des frais administratifs et AJ-Cloud pour la sauvegarde documentaire.
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2026–2027) : Spécifications juridico-techniques et modélisation des protocoles cadastraux ;
                    - Moyen terme (2028–2030) : Projet pilote de cartographie foncière sur une commune test en partenariat avec les autorités locales ;
                    - Long terme (2031–2035) : Extension progressive aux principales zones urbaines et agricoles du territoire national.
                    
                    18. Perspectives internationales : Collaboration avec les agences internationales d'aménagement du territoire et adoption des standards fonciers de l'ONU-Habitat.
                """.trimIndent(),
                contentHt = """
                    1. Non : AJ-Tè (Kadas Dijital & Sekirizasyon Tè).
                    
                    2. Estati ofisyèl kounye a : KONSÈP / AN KONSEPSYON. Pwojè teyorik ak achitekti ki fèt pou ede rezoud gwo kriz sou zafè tè nan peyi a.
                    
                    3. Orijin konsèp la : Konsta gwo batay sou tè, papye tè ki sipèpoze ak frajilite vye kanè papye ki ka boule oswa pèdi fasil an Ayiti.
                    
                    4. Misyon : Sekirize dwa sou pwopriyete tè yo epi rann delimitasyon limit tè yo klè gras ak bon zouti modèn.
                    
                    5. Vizyon : Mete sou pye yon kadas nasyonal transparan, enposib pou falsifye epi fasil pou konsilte pou lapè ak devlopman.
                    
                    6. Pwoblèm li rezoud : Vòlè tè, fo papye notè, mank mezi GPS egzat ak tribinal ki plen dosye batay pou tè.
                    
                    7. Solisyon li pote : Yon rejis tè dijital jeyolokalize ki konbine foto satelit klè, mezi egzat ak trasabilite sou tout chanjman mèt.
                    
                    8. Moun li vize : Mèt tè, notè, apantè jeyomèt, meri, Direksyon Jeneral Enpo (DGI) ak moun nan dyaspora a.
                    
                    9. Fonksyonalite prensipal yo :
                    - Mezi mòso tè ak kowòdone GPS byen klè ;
                    - Rejis solid ki kenbe tout istwa sou kiyès ki te mèt tè a anvan ;
                    - Deteksyon otomatik si de mèt tè ap reklame menm limit ;
                    - Bay papye sètifika kadas dijital ki an sekirite.
                    
                    10. Arkitekti teknik : Sistèm Enfòmasyon Jeyografik (SIG), baz done jeyospasyal ak rejis distribye avèk siyati kriptografik.
                    
                    11. Teknoloji yo prevwa itilize : PostGIS, Leaflet / Mapbox GL, Kotlin backend, PostgreSQL jeyospasyal, pwotokòl siyati dijital.
                    
                    12. Entèlijans atifisyèl : Analiz imaj satelit pou wè si gen erè nan mezi yo oswa chanjman nan fason tè yo okipe.
                    
                    13. Sekirite : Rejis ki pa ka chanje san otorizasyon, idantifikasyon solid pou notè ak apantè, ak dat egzat sou chak tranzaksyon.
                    
                    14. Modèl ekonomik : Pou defini (Ti frè pou sètifye mòso tè, abònman pou notè ak apantè, ak lisans pou enstitisyon leta).
                    
                    15. Entegrasyon ak AJ-TECH : Done yo sere sou AJ-Cloud epi notè yo konekte ak AJ-ID.
                    
                    16. Relasyon ak lòt antite yo : Konekte ak AJ-Maps pou kat yo, AJ-Pay pou peye frè administratif yo ak AJ-Cloud pou sere dokiman yo.
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2026–2027) : Preparasyon règleman legal ak teknik epi modèl pou kadas la ;
                    - Mwayen tèm (2028–2030) : Premye tès pilòt sou yon komin an kolaborasyon ak meri ak notè ;
                    - Long tèm (2031–2035) : Elaji sistèm nan nan tout gwo vil ak zòn agrikòl nan peyi a.
                    
                    18. Pèspektiv entènasyonal : Travay ansanm ak ajans entènasyonal sou jesyon tè ak respè estanda Nasyonzini (ONU-Habitat).
                """.trimIndent(),
                plannedStartPage = 135,
                plannedEndPage = 139,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 28 : AJ-Learn ====================
            BookChapter(
                id = "ch_3_28",
                chapterNumber = 28,
                partId = "part_3",
                titleFr = "Chapitre 28 — AJ-Learn",
                titleHt = "Chapit 28 — AJ-Learn",
                subtitleFr = "Plateforme d'apprentissage et formation continue",
                subtitleHt = "Platfòm aprantisaj ak fòmasyon kontini",
                summaryFr = "Fiche d'ingénierie d'AJ-Learn, plateforme d'e-learning optimisée pour les compétences technologiques et professionnelles.",
                summaryHt = "Fich enjenyri sou AJ-Learn, platfòm aprantisaj sou entènèt pou fòme jèn yo nan metye teknoloji.",
                contentFr = """
                    1. Nom : AJ-Learn (Plateforme d'Apprentissage & Formation Continue).
                    
                    2. Statut actuel officiel : CONCEPT / EN CONCEPTION. Projet de démocratisation des connaissances numériques et techniques.
                    
                    3. Origine du concept : Volonté de briser la barrière du coût et de l'isolement géographique pour l'apprentissage des technologies d'avenir en Haïti.
                    
                    4. Mission : Former la jeunesse haïtienne aux métiers du numérique, du code, du design et de l'entrepreneuriat.
                    
                    5. Vision : Former et certifier 100 000 jeunes haïtiens qualifiés d'ici 2035.
                    
                    6. Problème résolu : Rareté des filières spécialisées, coût prohibitif des certifications internationales et manque de contenus adaptés à la bande passante locale.
                    
                    7. Solution proposée : Plateforme d'apprentissage modulaire (micro-learning) avec cours téléchargeables pour consultation hors-ligne, projets pratiques et évaluations continues.
                    
                    8. Public cible : Étudiants, professionnels en reconversion, autodidactes, enseignants et lycéens.
                    
                    9. Fonctionnalités principales :
                    - Parcours guidés par compétences (développement, cybersécurité, IA, gestion de projet) ;
                    - Mode hors-ligne permettant le téléchargement des leçons et quiz ;
                    - Ateliers pratiques interactifs et exercices corrigés ;
                    - Délivrance de certificats de compétences vérifiables.
                    
                    10. Architecture technique : Système de gestion de l'apprentissage (LMS) distribué, streaming vidéo adaptatif ultra-compressé et moteur d'évaluation synchrone/asynchrone.
                    
                    11. Technologies envisagées : React / Compose Multiplatform Web, Kotlin backend, CDN optimisé pour faible débit, base de données relationnelle PostgreSQL.
                    
                    12. Intelligence artificielle : Tuteur d'apprentissage personnalisé adaptant le niveau des exercices aux difficultés rencontrées par chaque apprenant.
                    
                    13. Sécurité : Protection des contenus pédagogiques contre le piratage et vérification infalsifiable de l'authenticité des certificats délivrés.
                    
                    14. Modèle économique : Modèle freemium : modules fondamentaux gratuits et accessibles à tous, parcours certifiants et mentorat spécialisé payants.
                    
                    15. Intégration avec AJ-TECH : Alimente le vivier de compétences techniques pour l'ensemble des projets de l'écosystème.
                    
                    16. Relations avec les autres entités : Connecté à EDUKA pour les cursus scolaires, EDH pour les formations d'excellence et AJ-Dev pour les projets de code.
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2026–2027) : Conception des premiers curricula bilingues et mise au point de la plateforme web ;
                    - Moyen terme (2028–2030) : Lancement des programmes certifiants avec bourses d'études et partenariats universitaires ;
                    - Long terme (2031–2035) : Déploiement dans tous les départements d'Haïti et partenariats régionaux caribéens.
                    
                    18. Perspectives internationales : Reconnaissance mutuelle des crédits de formation avec des institutions académiques caribéennes et internationales.
                """.trimIndent(),
                contentHt = """
                    1. Non : AJ-Learn (Platfòm Aprantisaj & Fòmasyon Kontini).
                    
                    2. Estati ofisyèl kounye a : KONSÈP / AN KONSEPSYON. Pwojè pou pèmèt tout moun jwenn bon konesans sou teknoloji san baryè.
                    
                    3. Orijin konsèp la : Volonte pou kase gwo baryè pri chè ak distans pou jèn yo ka aprann metye modèn an Ayiti.
                    
                    4. Misyon : Fòme jèn ayisyen yo nan metye dijital, pwogramasyon, konsepsyon ak jesyon biznis.
                    
                    5. Vizyon : Fòme epi bay 100 000 jèn ayisyen bon sètifika kalifye anvan lane 2035.
                    
                    6. Pwoblèm li rezoud : Mank lekòl espesyalize, gwo pri egzamen etranje ak mank kou ki ka mache lè entènèt la pa bon.
                    
                    7. Solisyon li pote : Platfòm aprantisaj modilè kote ou ka telechaje leson yo pou gade san entènèt, ak egzèsis pratik ak kontwòl konesans.
                    
                    8. Moun li vize : Etidyan, moun k ap chanje metye, moun k ap aprann poukont yo, pwofesè ak elèv lekòl segondè.
                    
                    9. Fonksyonalite prensipal yo :
                    - Pakou aprantisaj klè (kòd, sekirite enfòmatik, entèlijans atifisyèl, jesyon pwojè) ;
                    - Mòd san entènèt pou telechaje leson ak kwis yo ;
                    - Egzèsis pratik ak koreksyon otomatik ;
                    - Bay bonjan sètifika konpetans ke tout moun ka verifye.
                    
                    10. Arkitekti teknik : Sistèm jesyon aprantisaj (LMS) distribye, distribisyon videyo ki konprese anpil epi motè egzèsis rapid.
                    
                    11. Teknoloji yo prevwa itilize : React / Compose Multiplatform Web, Kotlin backend, CDN pou ti entènèt, baz done PostgreSQL.
                    
                    12. Entèlijans atifisyèl : Pwofesè entèlijan pèsonalize ki ajiste nivo egzèsis yo selon kote elèv la gen difikilte.
                    
                    13. Sekirite : Pwoteksyon kontni kou yo ak sètifika dijital ki pa ka kontrefè.
                    
                    14. Modèl ekonomik : Modèl freemium : kou debaz gratis pou tout moun, fòmasyon avanse ak sètifika peye.
                    
                    15. Entegrasyon ak AJ-TECH : Prepare jèn talan ki pral travay sou tout rès pwojè nan ekosistèm nan.
                    
                    16. Relasyon ak lòt antite yo : Konekte ak EDUKA pou lekòl yo, EDH pou gwo fòmasyon pwofesyonèl ak AJ-Dev pou kòd.
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2026–2027) : Ekri premye pwogram kou bileng yo epi monte sitwèb aprantisaj la ;
                    - Mwayen tèm (2028–2030) : Lansman gwo pwogram ak bous detid ak patenarya ak inivèsite ;
                    - Long tèm (2031–2035) : Rive nan tout depatman nan peyi a epi travay ak lòt peyi nan Karayib la.
                    
                    18. Pèspektiv entènasyonal : Rekonesans sètifika yo pa gwo inivèsite ak sant fòmasyon entènasyonal.
                """.trimIndent(),
                plannedStartPage = 140,
                plannedEndPage = 144,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 29 : AJ-Pay ====================
            BookChapter(
                id = "ch_3_29",
                chapterNumber = 29,
                partId = "part_3",
                titleFr = "Chapitre 29 — AJ-Pay",
                titleHt = "Chapit 29 — AJ-Pay",
                subtitleFr = "Passerelle de paiement numérique local et international",
                subtitleHt = "Pasrèl peman dijital lokal ak entènasyonal",
                summaryFr = "Fiche d'ingénierie d'AJ-Pay, projet d'infrastructure de paiement en ligne sécurisée et interopérable pour Haïti.",
                summaryHt = "Fich enjenyri sou AJ-Pay, pwojè enfrastrikti peman sou entènèt an sekirite pou Ayiti.",
                contentFr = """
                    1. Nom : AJ-Pay (Passerelle de Paiement Numérique Local & International).
                    
                    2. Statut actuel officiel : PLANIFIÉ / EN ÉTUDE RÉGLEMENTAIRE. Projet d'infrastructure financière numérique sous réserve d'autorisations légales futures.
                    
                    3. Origine du concept : Constat de l'impossibilité pour les développeurs et marchands haïtiens d'encaisser des paiements en ligne de manière fluide et sécurisée.
                    
                    4. Mission : Offrir une infrastructure de paiement en ligne moderne, universelle et accessible à tous les acteurs économiques en Haïti.
                    
                    5. Vision : Devenir le standard technique de transaction numérique sécurisée pour le commerce électronique haïtien.
                    
                    6. Problème résolu : Absence de passerelles de paiement locales compatibles avec les cartes bancaires internationales et les portefeuilles mobiles locaux.
                    
                    7. Solution proposée : Une suite d'APIs et de composants de paiement sécurisés unifiant cartes bancaires, monnaie électronique locale et transferts internationaux.
                    
                    8. Public cible : E-commerçants, développeurs web/mobile, PME, prestataires de services, écoles et institutions publiques.
                    
                    9. Fonctionnalités principales :
                    - Intégration par API simple et SDKs pour développeurs ;
                    - Encaissement multi-devises (Gourdes HTG / Dollars USD) ;
                    - Tableau de bord marchand avec suivi des transactions en temps réel ;
                    - Rapprochement bancaire et reversements automatisés.
                    
                    10. Architecture technique : Passerelle transactionnelle haute disponibilité, moteur de routage monétaire résilient, isolation sécurisée des données de paiement.
                    
                    11. Technologies envisagées : Kotlin / Go microservices, PostgreSQL sécurisé, TLS 1.3, modules matériels de sécurité (HSM).
                    
                    12. Intelligence artificielle : Modèles d'analyse comportementale pour la détection proactive des fraudes et des tentatives d'usurpation de paiement.
                    
                    13. Sécurité : Conformité stricte aux standards internationaux PCI-DSS, chiffrement de bout en bout des numéros de cartes et authentification forte (3D-Secure).
                    
                    14. Modèle économique : À définir (Commission transparente au pourcentage et frais fixes par transaction réussie).
                    
                    15. Intégration avec AJ-TECH : Moteur de facturation et de règlement pour l'ensemble des services payants de l'écosystème (AJ-Commerce, EDUKA, AJ-Cloud).
                    
                    16. Relations avec les autres entités : Connecté à AJ-Wallet pour les transferts instantanés, AJ-Commerce pour les ventes en ligne et AJ-Fondation Biz pour les créateurs d'entreprises.
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2026–2027) : Études de conformité réglementaire financière et spécifications architecturales des APIs ;
                    - Moyen terme (2028–2030) : Prototypage en environnement bac à sable (sandbox) et démarches d'accréditation auprès des autorités bancaires ;
                    - Long terme (2031–2035) : Déploiement commercial et interconnexion avec les réseaux financiers régionaux de la Caraïbe.
                    
                    18. Perspectives internationales : Passerelle privilégiée pour permettre à la diaspora de régler directement des factures et services en Haïti.
                """.trimIndent(),
                contentHt = """
                    1. Non : AJ-Pay (Pasrèl Peman Dijital Lokal & Entènasyonal).
                    
                    2. Estati ofisyèl kounye a : PLANIFYE / SOU ETID REGLEMAN. Pwojè enfrastrikti finansye nimerik ki bezwen tout otorizasyon labank anvan li ka fonksyone.
                    
                    3. Orijin konsèp la : Konsta jan li difisil pou machann ak devlopè ayisyen resevwa lajan sou entènèt san gwo tèt chaje.
                    
                    4. Misyon : Bay yon bon enfrastrikti peman sou entènèt ki modèn, fyab epi aksesib pou tout kalite biznis an Ayiti.
                    
                    5. Vizyon : Vin tounen estanda prensipal pou tranzaksyon nimerik an sekirite nan komès sou entènèt an Ayiti.
                    
                    6. Pwoblèm li rezoud : Mank pasrèl peman lokal ki ka pran ni kat labank entènasyonal ni lajan sou telefòn lokal yo.
                    
                    7. Solisyon li pote : Yon seri zouti API ak paj peman an sekirite ki konekte kat labank, bous mobil ak transfè lajan soti deyò.
                    
                    8. Moun li vize : Machann sou entènèt, devlopè aplikasyon, ti antrepriz, lekòl ak enstitisyon leta.
                    
                    9. Fonksyonalite prensipal yo :
                    - Entegrasyon fasil ak API ak SDK pou devlopè yo ;
                    - Resevwa lajan an plizyè deviz (Goud HTG / Dola USD) ;
                    - Tablo jesyon pou machann wè tout tranzaksyon an tan reyèl ;
                    - Transfè lajan otomatik sou kont labank machann nan.
                    
                    10. Arkitekti teknik : Pasrèl tranzaksyon rapid ki toujou disponib, motè distribisyon lajan solid ak espas izole pou done labank.
                    
                    11. Teknoloji yo prevwa itilize : Mikwosèvis Kotlin / Go, PostgreSQL sekirize, TLS 1.3, modil sekirite materyèl (HSM).
                    
                    12. Entèlijans atifisyèl : Analiz otomatik pou wè si gen tantativ vòlè kat oswa tranzaksyon ki sispèk.
                    
                    13. Sekirite : Respè total règleman entènasyonal PCI-DSS, chifreman bout-an-bout sou nimewo kat ak otantifikasyon 3D-Secure.
                    
                    14. Modèl ekonomik : Pou defini (Ti pousantaj klè ak ti frè fiks sou chak peman ki reyisi).
                    
                    15. Entegrasyon ak AJ-TECH : Motè peman pou tout sèvis ki peye nan ekosistèm nan (AJ-Commerce, EDUKA, AJ-Cloud).
                    
                    16. Relasyon ak lòt antite yo : Konekte ak AJ-Wallet pou transfè rapid, AJ-Commerce pou lavant sou sit ak AJ-Fondation Biz pou nouvo biznis.
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2026–2027) : Etid sou lwa ak règleman labank epi preparasyon plan teknik API yo ;
                    - Mwayen tèm (2028–2030) : Espas tès (sandbox) pou devlopè ak demach pou jwenn tout lisans labank legal yo ;
                    - Long tèm (2031–2035) : Lansman komèsyal epi koneksyon ak rezo finansye nan tout Karayib la.
                    
                    18. Pèspektiv entènasyonal : Pèmèt moun nan dyaspora a peye bòdwo ak sèvis pou fanmi yo an Ayiti dirèkteman.
                """.trimIndent(),
                plannedStartPage = 145,
                plannedEndPage = 149,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 30 : AJ-Wallet ====================
            BookChapter(
                id = "ch_3_30",
                chapterNumber = 30,
                partId = "part_3",
                titleFr = "Chapitre 30 — AJ-Wallet",
                titleHt = "Chapit 30 — AJ-Wallet",
                subtitleFr = "Portefeuille numérique et inclusion financière",
                subtitleHt = "Bous dijital ak enklizyon finansyè",
                summaryFr = "Fiche d'ingénierie d'AJ-Wallet, projet d'application de portefeuille mobile pour l'inclusion financière des citoyens.",
                summaryHt = "Fich enjenyri sou AJ-Wallet, pwojè bous mobil pou ede tout moun gen kont epi jere lajan yo an sekirite.",
                contentFr = """
                    1. Nom : AJ-Wallet (Portefeuille Numérique & Inclusion Financière).
                    
                    2. Statut actuel officiel : PLANIFIÉ / EN ÉTUDE RÉGLEMENTAIRE. Projet d'outil d'inclusion financière subordonné au cadre légal monétaire.
                    
                    3. Origine du concept : Constat du faible taux de bancarisation de la population haïtienne et de la dangerosité de la manipulation exclusive d'argent liquide.
                    
                    4. Mission : Offrir à chaque citoyen un portefeuille électronique simple, sécurisé et accessible depuis n'importe quel smartphone.
                    
                    5. Vision : Accélérer l'inclusion financière universelle sur l'ensemble du territoire haïtien.
                    
                    6. Problème résolu : Exclusion du système bancaire traditionnel, frais abusifs sur les petits transferts et insécurité liée au transport d'espèces.
                    
                    7. Solution proposée : Application mobile de portefeuille numérique permettant transferts d'argent instantanés entre particuliers (P2P), paiements marchands par QR Code et micro-épargne.
                    
                    8. Public cible : Grand public, commerçants de proximité, étudiants, travailleurs du secteur formel et informel.
                    
                    9. Fonctionnalités principales :
                    - Envoi et réception d'argent instantanés par numéro ou contact ;
                    - Paiement chez les commerçants par scan de QR Code dynamique ;
                    - Gestion de solde multidevise (Gourdes / Dollars) ;
                    - Historique clair et catégorisé des dépenses quotidiennes.
                    
                    10. Architecture technique : Application mobile native avec coffre-fort cryptographique local, synchronisation chiffrée avec le registre central et validation biométrique.
                    
                    11. Technologies envisagées : Kotlin Native / Android Compose, iOS Swift, Secure Enclave / Keystore matériel, microservices sécurisés.
                    
                    12. Intelligence artificielle : Assistant budgétaire personnel fournissant des conseils d'épargne et détection des comportements inhabituels de transfert.
                    
                    13. Sécurité : Authentification biométrique (empreinte/visage), code PIN de confirmation à chaque transaction, verrouillage à distance en cas de perte de téléphone.
                    
                    14. Modèle économique : À définir (Gratuité des services de base, micro-frais sur certains retraits ou services financiers à valeur ajoutée).
                    
                    15. Intégration avec AJ-TECH : Utilisation de l'identité unique AJ-ID et connexion directe avec la passerelle AJ-Pay.
                    
                    16. Relations avec les autres entités : Connecté à AJ-Pay pour les recharges de compte, AJ-Commerce pour les achats et AJ-Assistant pour l'assistance vocale.
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2026–2027) : Études des cadres réglementaires sur la monnaie électronique et spécifications d'ergonomie mobile ;
                    - Moyen terme (2028–2030) : Développement de l'application et phase de test pilote en environnement contrôlé ;
                    - Long terme (2031–2035) : Déploiement national auprès des réseaux de commerçants et interconnexion avec les banques partenaires.
                    
                    18. Perspectives internationales : Réception simplifiée et peu coûteuse des transferts de fonds envoyés par les membres de la diaspora.
                """.trimIndent(),
                contentHt = """
                    1. Non : AJ-Wallet (Bous Dijital & Enklizyon Finansyè).
                    
                    2. Estati ofisyèl kounye a : PLANIFYE / SOU ETID REGLEMAN. Pwojè zouti finansye ki dwe respekte tout lwa sou zafè lajan anvan li lanse.
                    
                    3. Orijin konsèp la : Konsta anpil moun pa gen kont labank an Ayiti epi danje ki genyen lè moun ap mache ak tout lajan kach nan men yo.
                    
                    4. Misyon : Bay chak sitwayen yon bous elektwonik ki senp, an sekirite epi ki ka mache sou nenpòt ti telefòn entèlijan.
                    
                    5. Vizyon : Fè tout moun nan tout kwen peyi Ayiti jwenn mwayen pou jere ak voye lajan pa zouti dijital.
                    
                    6. Pwoblèm li rezoud : Pifò moun ki pa ka louvri kont labank, gwo frè sou ti transfè lajan ak ensekirite lè w ap pote kach.
                    
                    7. Solisyon li pote : Aplikasyon bous mobil pou voye lajan touswit bay fanmi ak zanmi (P2P), peye machann ak kòd QR epi fè ti ekonomi.
                    
                    8. Moun li vize : Tout popilasyon an, ti machann nan lari ak nan magazen, etidyan, travayè tout kategori.
                    
                    9. Fonksyonalite prensipal yo :
                    - Voye ak resevwa lajan touswit pa nimewo telefòn oswa kontak ;
                    - Peye machann fasil lè w eskane yon kòd QR ;
                    - Jere balans nan plizyè lajan (Goud ak Dola) ;
                    - Wè tout ti depans ou fè chak jou pou pi byen kontwole kòb ou.
                    
                    10. Arkitekti teknik : Aplikasyon mobil natif ak kòfrefò kriptografik sou telefòn la, kominikasyon chifre ak sèvè a epi kontwòl byometrik.
                    
                    11. Teknoloji yo prevwa itilize : Kotlin Native / Android Compose, iOS Swift, Secure Enclave / Keystore materyèl, mikwosèvis sekirize.
                    
                    12. Entèlijans atifisyèl : Ti asistan pou ede w fè ekonomi epi avèti w si gen yon tranzaksyon dwòl ki fèt sou kont ou.
                    
                    13. Sekirite : Rekonesans anprent dwèt oswa figi, kòd PIN sekrè pou chak peman, ak posiblite pou bloke bous la si telefòn nan pèdi.
                    
                    14. Modèl ekonomik : Pou defini (Sèvis debaz gratis pou tout moun, ti frè minimòm sou kèk retrè oswa sèvis espesyal).
                    
                    15. Entegrasyon ak AJ-TECH : Koneksyon dirèk ak kont AJ-ID epi itilize pasrèl AJ-Pay.
                    
                    16. Relasyon ak lòt antite yo : Konekte ak AJ-Pay pou mete kòb sou bous la, AJ-Commerce pou achte machandiz ak AJ-Assistant pou ede w pale ak bous la.
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2026–2027) : Etidye tout lwa sou lajan elektwonik epi prepare fason aplikasyon an ap fasil pou itilize ;
                    - Mwayen tèm (2028–2030) : Devlope aplikasyon an epi fè premye tès nan yon anviwònman kontwole ;
                    - Long tèm (2031–2035) : Lansman nan tout peyi a pou tout machann epi travay men nan men ak labank yo.
                    
                    18. Pèspektiv entènasyonal : Fasilite resevwa lajan dyaspora a voye bay fanmi yo san gwo frè ki koupe kòb la.
                """.trimIndent(),
                plannedStartPage = 150,
                plannedEndPage = 154,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 31 : AJ-Chat ====================
            BookChapter(
                id = "ch_3_31",
                chapterNumber = 31,
                partId = "part_3",
                titleFr = "Chapitre 31 — AJ-Chat",
                titleHt = "Chapit 31 — AJ-Chat",
                subtitleFr = "Messagerie instantanée sécurisée et souveraine",
                subtitleHt = "Mesajri enstantane an sekirite ak souveren",
                summaryFr = "Fiche d'ingénierie d'AJ-Chat, projet de messagerie instantanée chiffrée de bout en bout et respectueuse de la vie privée.",
                summaryHt = "Fich enjenyri sou AJ-Chat, pwojè mesajri chifre bout-an-bout ki respekte lavi prive tout moun.",
                contentFr = """
                    1. Nom : AJ-Chat (Messagerie Instantanée Sécurisée & Souveraine).
                    
                    2. Statut actuel officiel : CONCEPT / EN CONCEPTION. Projet de messagerie chiffrée nationale.
                    
                    3. Origine du concept : Nécessité de garantir la confidentialité absolue des communications citoyennes, professionnelles et institutionnelles en Haïti.
                    
                    4. Mission : Fournir une plateforme de communication moderne, chiffrée, légère et totalement respectueuse des données privées.
                    
                    5. Vision : Offrir une infrastructure de messagerie instantanée nationale, résiliente et indépendante des géants extérieurs.
                    
                    6. Problème résolu : Exploitation commerciale des métadonnées, surveillance de masse et vulnérabilité des communications sensibles sur des plateformes étrangères.
                    
                    7. Solution proposée : Application de messagerie instantanée avec chiffrement de bout en bout de norme militaire, zéro conservation des clés sur les serveurs et faible consommation de données.
                    
                    8. Public cible : Citoyens, entreprises, professionnels de santé, journalistes, institutions publiques et organisations de la société civile.
                    
                    9. Fonctionnalités principales :
                    - Échanges de messages texte, vocaux et fichiers multimédias chiffrés ;
                    - Appels vocaux et vidéo sécurisés optimisés pour réseaux mobiles instables ;
                    - Messages éphémères programmables et canaux de diffusion vérifiés ;
                    - Sauvegarde locale chiffrée sans transmission aux serveurs.
                    
                    10. Architecture technique : Réseau de routage décentralisé basé sur des protocoles cryptographiques modernes, architecture zéro-connaissance (Zero-Knowledge).
                    
                    11. Technologies envisagées : Kotlin Multiplatform, WebRTC, protocole cryptographique inspiré de Signal, Rust core pour la cryptographie mobile.
                    
                    12. Intelligence artificielle : Traduction instantanée de messages Français <-> Créole haïtien exécutée directement sur l'appareil (on-device) pour préserver le chiffrement.
                    
                    13. Sécurité : Chiffrement de bout en bout (E2EE) par défaut, aucune conservation de métadonnées de contact sur les serveurs, code auditable.
                    
                    14. Modèle économique : À définir (Gratuité totale pour les particuliers, offres de serveurs dédiés pour les entreprises et administrations).
                    
                    15. Intégration avec AJ-TECH : Module de communication sécurisé pouvant être sollicité au sein des autres services d'AJ-TECH.
                    
                    16. Relations avec les autres entités : Connecté à AJ-Meet pour les réunions vidéo, AJ-Mail pour les échanges formels et AJ-Assistant pour l'aide bilingue.
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2026–2027) : Élaboration des spécifications cryptographiques et prototype de base de messagerie texte ;
                    - Moyen terme (2028–2030) : Intégration des appels vocaux sécurisés et phase de test de résistance aux pannes ;
                    - Long terme (2031–2035) : Déploiement grand public et intégration comme canal de communication officiel pour les institutions.
                    
                    18. Perspectives internationales : Alternative crédible de messagerie privée pour les communautés créolophones et caribéennes soucieuses de leur souveraineté numérique.
                """.trimIndent(),
                contentHt = """
                    1. Non : AJ-Chat (Mesajri Enstantane an Sekirite & Souveren).
                    
                    2. Estati ofisyèl kounye a : KONSÈP / AN KONSEPSYON. Pwojè mesajri nasyonal ki chifre pou pwoteje lavi prive.
                    
                    3. Orijin konsèp la : Bezwen pou garanti sekirite total sou tout sa sitwayen, biznis ak leta ap kominike an Ayiti.
                    
                    4. Misyon : Bay yon bon mwayen kominikasyon modèn, chifre, ki pa lou sou entènèt epi ki respekte sekrè chak moun.
                    
                    5. Vizyon : Bay peyi a yon enfrastrikti mesajri nasyonal ki solid epi ki pa depann de gwo konpayi etranje.
                    
                    6. Pwoblèm li rezoud : Vant enfòmasyon pèsonèl bay lòt moun, siveyans ak risk pou moun wè sa w ap pale sou platfòm etranje yo.
                    
                    7. Solisyon li pote : Aplikasyon mesajri ak chifreman nivo militè bout-an-bout, kote okenn kle pa rete sou sèvè yo epi ki mache menm ak ti entènèt.
                    
                    8. Moun li vize : Sitwayen, antrepriz, doktè ak enfimyè, jounalis, enstitisyon leta ak asosyasyon.
                    
                    9. Fonksyonalite prensipal yo :
                    - Voye mesaj tèks, vwa ak foto an sekirite total ;
                    - Apèl vwa ak videyo chifre ki mache byen menm lè rezo a pa fin fò ;
                    - Mesaj ki ka efase poukont yo ak kanal enfòmasyon sètifye ;
                    - Sovgad mesaj yo sou telefòn la menm san voye yo sou sèvè.
                    
                    10. Arkitekti teknik : Rezo distribye ki baze sou gwo pwotokòl sekirite, kote sèvè a pa janm konnen sa k nan mesaj yo (Zero-Knowledge).
                    
                    11. Teknoloji yo prevwa itilize : Kotlin Multiplatform, WebRTC, pwotokòl chifreman kalite Signal, motè Rust pou sekirite sou mobil.
                    
                    12. Entèlijans atifisyèl : Tradiksyon touswit Fransè <-> Kreyòl ki fèt sou telefòn la menm pou pa janm kase sekirite mesaj yo.
                    
                    13. Sekirite : Chifreman bout-an-bout (E2EE) pou tout moun, pa gen okenn enfòmasyon sou kiyès ou pale ki rete sou sèvè.
                    
                    14. Modèl ekonomik : Pou defini (Gratis pou tout moun senp, sèvè espesyal peye pou gwo biznis ak leta).
                    
                    15. Entegrasyon ak AJ-TECH : Sèvi kòm mwayen kominikasyon an sekirite pou tout lòt zouti nan ekosistèm nan.
                    
                    16. Relasyon ak lòt antite yo : Konekte ak AJ-Meet pou gwo reyinyon videyo, AJ-Mail pou imèl ofisyèl ak AJ-Assistant pou èd.
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2026–2027) : Prepare tout plan sekirite ak premye tès pou voye mesaj tèks senp ;
                    - Mwayen tèm (2028–2030) : Mete apèl vwa an sekirite epi teste jan zouti a reziste lè rezo a koupe ;
                    - Long tèm (2031–2035) : Ouvèti pou tout piblik la epi sèvi kòm kanal ofisyèl pou enstitisyon nan peyi a.
                    
                    18. Pèspektiv entènasyonal : Yon bon opsyon mesajri an sekirite pou tout moun nan Karayib la ak nan dyaspora a ki vle pwoteje lavi prive yo.
                """.trimIndent(),
                plannedStartPage = 155,
                plannedEndPage = 159,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 32 : AJ-Cloud ====================
            BookChapter(
                id = "ch_3_32",
                chapterNumber = 32,
                partId = "part_3",
                titleFr = "Chapitre 32 — AJ-Cloud",
                titleHt = "Chapit 32 — AJ-Cloud",
                subtitleFr = "Hébergement cloud et stockage souverain haïtien",
                subtitleHt = "Ebèjman cloud ak depo souveren ayisyen",
                summaryFr = "Fiche d'ingénierie d'AJ-Cloud, projet d'infrastructure nationale de stockage et serveurs distribués.",
                summaryHt = "Fich enjenyri sou AJ-Cloud, pwojè enfrastrikti nasyonal pou kenbe epi pwoteje tout done sou teritwa a.",
                contentFr = """
                    1. Nom : AJ-Cloud (Hébergement Cloud & Stockage Souverain Haïtien).
                    
                    2. Statut actuel officiel : PLANIFIÉ / EN CONCEPTION D'INGÉNIERIE. Projet d'infrastructure physique et logique sous réserve de financements futurs.
                    
                    3. Origine du concept : Constat de la dépendance totale d'Haïti envers les data centers étrangers (AWS, Google Cloud, Microsoft Azure) et des risques géopolitiques et financiers associés.
                    
                    4. Mission : Garantir que les données des citoyens, entreprises et institutions haïtiennes soient hébergées, protégées et exploitées sur le sol national.
                    
                    5. Vision : Bâtir le premier réseau national de centres de données souverains, écologiques et redondants en Haïti.
                    
                    6. Problème résolu : Fuite constante de devises pour payer des serveurs étrangers, latence réseau élevée et risque d'isolement en cas de rupture des câbles sous-marins.
                    
                    7. Solution proposée : Infrastructure cloud distribuée offrant du stockage d'objets (compatible S3), des machines virtuelles résilientes et des bases de données managées.
                    
                    8. Public cible : Entreprises haïtiennes, développeurs, universités, banques, ministères et startups locales.
                    
                    9. Fonctionnalités principales :
                    - Stockage d'objets haute durabilité compatible API S3 ;
                    - Déploiement de serveurs virtuels et conteneurs d'applications ;
                    - Sauvegardes automatisées chiffrées avec géo-réplication locale ;
                    - Facturation claire et prévisible en monnaie locale (Gourdes HTG).
                    
                    10. Architecture technique : Architecture distribuée haute disponibilité basée sur des clusters open-source (Kubernetes et Ceph), alimentation hybride solaire/réseau.
                    
                    11. Technologies envisagées : Kubernetes, Ceph Storage, Linux Enterprise, OpenStack, Terraform, solutions de monitoring Prometheus / Grafana.
                    
                    12. Intelligence artificielle : Algorithmes d'optimisation énergétique prédictive pour adapter la charge des serveurs à la disponibilité solaire locale.
                    
                    13. Sécurité : Isolation physique des baies de serveurs, conformité aux standards ISO/IEC 27001 et chiffrement systématique des données au repos et en transit.
                    
                    14. Modèle économique : À définir (Facturation à l'usage réel des ressources consommées et forfaits mensuels pour serveurs réservés).
                    
                    15. Intégration avec AJ-TECH : Socle d'infrastructure sous-jacent hébergeant l'intégralité des 21 entités de l'écosystème.
                    
                    16. Relations avec les autres entités : Connecté à toutes les entités de l'écosystème (AJ-Task, AJ-Mail, EDUKA, AJ-Bioklin, AJ-Pay, etc.).
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2026–2027) : Études techniques d'ingénierie énergétique et modélisation logicielle des clusters ;
                    - Moyen terme (2028–2030) : Déploiement d'un premier centre de données pilote à Port-au-Prince et tests de charge avec les entités AJ-TECH ;
                    - Long terme (2031–2035) : Établissement de nœuds secondaires en province pour assurer une redondance géographique totale.
                    
                    18. Perspectives internationales : Offre d'hébergement de secours et de continuité d'activité pour les pays voisins de la communauté caribéenne (CARICOM).
                """.trimIndent(),
                contentHt = """
                    1. Non : AJ-Cloud (Ebèjman Cloud & Depo Souveren Ayisyen).
                    
                    2. Estati ofisyèl kounye a : PLANIFYE / AN KONSEPSYON ENJENYRI. Pwojè enfrastrikti fizik ak lojisyèl k ap prepare sou plan teknik.
                    
                    3. Orijin konsèp la : Konsta tout done ayisyen pase sou gwo sèvè etranje (AWS, Google, Azure), sa ki fè gwo lajan sòti nan peyi a epi mete sekirite done yo an risk.
                    
                    4. Misyon : Garanti tout done sitwayen, biznis ak leta ayisyen rete sere, pwoteje epi trete sou teritwa nasyonal la menm.
                    
                    5. Vizyon : Bati premye rezo nasyonal sant done (data centers) souveren, ekolojik epi ki mache ak solèy an Ayiti.
                    
                    6. Pwoblèm li rezoud : Pèdi gwo lajan nan peye sèvis deyò, entènèt ki ralanti epi risk pou pèdi aksè si kab entènèt anba lanmè a ta gen pwoblèm.
                    
                    7. Solisyon li pote : Enfrastrikti cloud distribye ki bay espas pou estoke dosye (konpatib S3), sèvè virtiyèl rapid ak baz done ki jere otomatikman.
                    
                    8. Moun li vize : Antrepriz ayisyen, devlopè, inivèsite, labank, ministè ak nouvo ti konpayi teknoloji.
                    
                    9. Fonksyonalite prensipal yo :
                    - Depo dosye solid ki konpatib ak estanda S3 ;
                    - Mete sèvè virtiyèl ak aplikasyon sou pye fasil ;
                    - Sovgad otomatik chifre ki repati nan plizyè kote an Ayiti ;
                    - Peman klè an lajan goud (HTG) san sipriz sou pri.
                    
                    10. Arkitekti teknik : Arkitekti distribye solid ki baze sou zouti ouvè (Kubernetes ak Ceph), ak kouran solèy konbine ak lòt sous enèji.
                    
                    11. Teknoloji yo prevwa itilize : Kubernetes, Ceph Storage, Linux Enterprise, OpenStack, Terraform, zouti siveyans Prometheus / Grafana.
                    
                    12. Entèlijans atifisyèl : Kalkil entèlijan sou konsomasyon kouran pou fè sèvè yo travay pi byen selon kouran solèy ki disponib.
                    
                    13. Sekirite : Pwoteksyon fizik pou lokal sèvè yo, respè prensip ISO/IEC 27001 ak chifreman tout done ki sere ak sa k ap transmèt.
                    
                    14. Modèl ekonomik : Pou defini (Peye selon sa w itilize ak abònman chak mwa pou sèvè dedye).
                    
                    15. Entegrasyon ak AJ-TECH : Fondasyon teknik ki kenbe epi ebèje tout 21 antite nan ekosistèm nan.
                    
                    16. Relasyon ak lòt antite yo : Konekte ak tout antite yo (AJ-Task, AJ-Mail, EDUKA, AJ-Bioklin, AJ-Pay, elatriye).
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2026–2027) : Etid enjenyri sou kouran ak plan teknik pou modèl sèvè yo ;
                    - Mwayen tèm (2028–2030) : Enstale premye ti sant done pilòt nan Pòtoprens epi fè tout zouti AJ-TECH yo travay sou li ;
                    - Long tèm (2031–2035) : Louvri lòt sant done nan lòt vil nan peyi a pou done yo pa janm pèdi menm si yon zòn ta gen pwoblèm.
                    
                    18. Pèspektiv entènasyonal : Bay sèvis ebèjman sekou pou lòt peyi vwazen nan Karayib la (CARICOM).
                """.trimIndent(),
                plannedStartPage = 160,
                plannedEndPage = 164,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 33 : AJ-Meet ====================
            BookChapter(
                id = "ch_3_33",
                chapterNumber = 33,
                partId = "part_3",
                titleFr = "Chapitre 33 — AJ-Meet",
                titleHt = "Chapit 33 — AJ-Meet",
                subtitleFr = "Visioconférence et réunions virtuelles basse bande passante",
                subtitleHt = "Vizyokonferans ak reyinyon virtiyèl pou ti entènèt",
                summaryFr = "Fiche d'ingénierie d'AJ-Meet, projet de visioconférence optimisée pour les réseaux instables.",
                summaryHt = "Fich enjenyri sou AJ-Meet, pwojè reyinyon videyo ki fèt espesyalman pou mache menm lè entènèt la fèb.",
                contentFr = """
                    1. Nom : AJ-Meet (Visioconférence & Réunions Virtuelles Basse Bande Passante).
                    
                    2. Statut actuel officiel : PLANIFIÉ / EN CONCEPTION. Projet de visioconférence résiliente.
                    
                    3. Origine du concept : Difficultés constantes rencontrées par les professionnels et étudiants haïtiens lors des réunions Zoom ou Teams, marquées par des coupures répétées et une consommation excessive de données mobiles.
                    
                    4. Mission : Permettre des échanges audio et vidéo fluides et ininterrompus, même dans des conditions de connectivité extrêmement dégradées.
                    
                    5. Vision : Rapprocher les équipes, les écoles et les familles sans que la faiblesse de la bande passante ne soit un obstacle à la collaboration.
                    
                    6. Problème résolu : Déconnexions intempestives, décalages audio majeurs et épuisement rapide des forfaits data lors des cours en ligne et réunions de travail.
                    
                    7. Solution proposée : Plateforme de visioconférence adaptative ajustant dynamiquement le débit vidéo et basculant automatiquement en mode audio HD ultra-compressé en cas de chute de réseau.
                    
                    8. Public cible : Entreprises, écoles, universités, formateurs, organisations non gouvernementales et télétravailleurs.
                    
                    9. Fonctionnalités principales :
                    - Compression vidéo adaptative en temps réel (résolution dynamique) ;
                    - Mode audio prioritaire ultra-bas débit (compatible 2G/3G) ;
                    - Partage d'écran et tableau blanc collaboratif léger ;
                    - Enregistrement des sessions directement sur AJ-Cloud.
                    
                    10. Architecture technique : Serveurs médias WebRTC distribués avec Selective Forwarding Unit (SFU) adaptatif et routage optimisé.
                    
                    11. Technologies envisagées : WebRTC, Kotlin Multiplatform, Jitsi Core personnalisé, codecs audio Opus et vidéo AV1 / VP9.
                    
                    12. Intelligence artificielle : Réduction intelligente des bruits parasites ambiants (génératrices électriques, circulation urbaine, bruits de vent).
                    
                    13. Sécurité : Chiffrement des flux en transit (DTLS/SRTP), salles de réunion verrouillées par mot de passe et salles d'attente sécurisées.
                    
                    14. Modèle économique : À définir (Usage de base gratuit pour réunions courtes, abonnements professionnels pour sessions illimitées et enregistrements cloud).
                    
                    15. Intégration avec AJ-TECH : Intégration directe dans les tableaux de bord d'AJ-Task, EDUKA et le carnet d'adresses AJ-Mail.
                    
                    16. Relations avec les autres entités : Connecté à AJ-Task pour les réunions de projets, EDUKA pour les cours à distance et AJ-Cloud pour les enregistrements.
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2026–2027) : Études des algorithmes de compression adaptatifs et prototype de communication audio basse bande passante ;
                    - Moyen terme (2028–2030) : Lancement de la version web et mobile avec intégration dans les écoles partenaires d'EDUKA ;
                    - Long terme (2031–2035) : Déploiement institutionnel et adaptation pour la télémédecine en zone rurale.
                    
                    18. Perspectives internationales : Solution adaptée pour tous les pays insulaires et régions émergentes confrontés à des défis de connectivité similaires.
                """.trimIndent(),
                contentHt = """
                    1. Non : AJ-Meet (Vizyokonferans & Reyinyon Virtiyèl pou Ti Entènèt).
                    
                    2. Estati ofisyèl kounye a : PLANIFYE / AN KONSEPSYON. Pwojè reyinyon videyo ki fèt pou reziste tout pwoblèm koneksyon.
                    
                    3. Orijin konsèp la : Gwo difikilte pwofesyonèl ak elèv ayisyen genyen lè y ap fè reyinyon sou Zoom oswa Teams, kote videyo a koupe san rete epi manje tout kat entènèt yo.
                    
                    4. Misyon : Pèmèt moun pale ak wè lòt fasil nan reyinyon san sa pa koupe, menm lè entènèt la trè fèb.
                    
                    5. Vizyon : Mete ekip travay, lekòl ak fanmi an kontak san move entènèt pa janm yon baryè.
                    
                    6. Pwoblèm li rezoud : Apèl k ap koupe tout tan, vwa k ap tranble ak plan entènèt ki fini twò vit pandan gwo reyinyon oswa kou sou entènèt.
                    
                    7. Solisyon li pote : Zouti reyinyon ki ajiste kalite videyo a otomatikman epi ki pase an vwa sèlman ki trè klè si rezo a desann twò ba.
                    
                    8. Moun li vize : Antrepriz, lekòl, inivèsite, pwofesè, asosyasyon ak moun k ap travay adistans.
                    
                    9. Fonksyonalite prensipal yo :
                    - Ajiste kalite videyo a otomatikman selon fòs entènèt la ;
                    - Mòd vwa rapid ki ka mache menm sou rezo 2G ak 3G ;
                    - Pataje ekran ak yon tablo pou ekri ki pa lou ditou ;
                    - Anrejistre reyinyon yo dirèkteman sou AJ-Cloud.
                    
                    10. Arkitekti teknik : Sèvè medya WebRTC distribye ak teknoloji SFU ki jere distribisyon videyo a san chaje aparèy yo.
                    
                    11. Teknoloji yo prevwa itilize : WebRTC, Kotlin Multiplatform, motè Jitsi adapte, kodèk son Opus ak videyo AV1 / VP9.
                    
                    12. Entèlijans atifisyèl : Retire tout bri nan fon otomatikman (bri dèlko, bri machin nan lari, bri van).
                    
                    13. Sekirite : Chifreman son ak videyo pandan y ap vwayaje sou rezo a, chanm reyinyon ak modpas ak sal datant pou kontwole kiyès k ap antre.
                    
                    14. Modèl ekonomik : Pou defini (Ti reyinyon kout gratis, abònman pou reyinyon ki pa gen limit tan ak espas anrejistreman).
                    
                    15. Entegrasyon ak AJ-TECH : Koneksyon dirèk nan paj travay AJ-Task, nan lekòl EDUKA ak nan kalandriye AJ-Mail.
                    
                    16. Relasyon ak lòt antite yo : Konekte ak AJ-Task pou reyinyon sou travay, EDUKA pou klas adistans ak AJ-Cloud pou sere videyo yo.
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2026–2027) : Etidye fason pou konprese son ak videyo pi byen epi fè premye tès apèl vwa sou ti entènèt ;
                    - Mwayen tèm (2028–2030) : Mete vèsyon sitwèb ak telefòn lan deyò epi itilize li nan lekòl ki gen EDUKA ;
                    - Long tèm (2031–2035) : Itilizasyon nan gwo enstitisyon leta ak pou doktè bay konsiltasyon adistans nan zòn andeyò.
                    
                    18. Pèspektiv entènasyonal : Yon solisyon ekselan pou tout lòt zile ak peyi k ap devlope ki gen menm pwoblèm entènèt la.
                """.trimIndent(),
                plannedStartPage = 165,
                plannedEndPage = 169,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 34 : AJ-Mail ====================
            BookChapter(
                id = "ch_3_34",
                chapterNumber = 34,
                partId = "part_3",
                titleFr = "Chapitre 34 — AJ-Mail",
                titleHt = "Chapit 34 — AJ-Mail",
                subtitleFr = "Messagerie électronique professionnelle souveraine",
                subtitleHt = "Mesajri elektwonik pwofesyonèl souveren",
                summaryFr = "Fiche d'ingénierie d'AJ-Mail, service de courriel professionnel souverain pour les organisations haïtiennes.",
                summaryHt = "Fich enjenyri sou AJ-Mail, sèvis imèl pwofesyonèl souveren pou biznis ak administrasyon an Ayiti.",
                contentFr = """
                    1. Nom : AJ-Mail (Messagerie Électronique Professionnelle Souveraine).
                    
                    2. Statut actuel officiel : PLANIFIÉ / EN CONCEPTION. Projet de messagerie d'entreprise nationale.
                    
                    3. Origine du concept : Constat de l'usage prédominant d'adresses e-mails grand public non sécurisées (Gmail, Yahoo) par les entreprises, écoles et institutions publiques en Haïti.
                    
                    4. Mission : Doter chaque entreprise et organisation haïtienne d'une messagerie professionnelle crédible, souveraine et hautement protégée.
                    
                    5. Vision : Mettre fin au déficit de crédibilité numérique en généralisant les adresses institutionnelles avec nom de domaine propre.
                    
                    6. Problème résolu : Vulnérabilité des données stratégiques hébergées sans contrat de confidentialité, usurpations d'identité et décrédibilisation internationale des communications officielles.
                    
                    7. Solution proposée : Service complet de messagerie d'entreprise avec gestion simplifiée des noms de domaine, webmail moderne, calendrier partagé et filtres anti-menaces.
                    
                    8. Public cible : PME, grandes entreprises, universités, écoles, ministères, ambassades et professions libérales.
                    
                    9. Fonctionnalités principales :
                    - Boîtes de réception professionnelles au nom de domaine de l'organisation ;
                    - Webmail épuré, rapide et responsive, optimisé pour les connexions lentes ;
                    - Calendrier collaboratif et carnet d'adresses partagé d'entreprise ;
                    - Filtre anti-spam, anti-phishing et protection contre les logiciels malveillants.
                    
                    10. Architecture technique : Serveurs de transfert de courriers (MTA) souverains configurés avec stockage distribué sur AJ-Cloud et protocoles de synchronisation IMAP/JMAP.
                    
                    11. Technologies envisagées : Postfix, Dovecot, JMAP API, Kotlin / Compose Web, chiffrement OpenPGP, protocoles SPF / DKIM / DMARC.
                    
                    12. Intelligence artificielle : Classement automatique des courriels prioritaires et assistance à la rédaction professionnelle bilingue (Français / Anglais).
                    
                    13. Sécurité : Chiffrement TLS obligatoire des transmissions, protection DNSSEC, filtrage heuristique des pièces jointes et authentification multi-facteurs (MFA).
                    
                    14. Modèle économique : À définir (Abonnement mensuel ou annuel abordable par compte utilisateur professionnel avec paliers de stockage).
                    
                    15. Intégration avec AJ-TECH : Gestionnaire de courriels et de notifications officielles pour l'ensemble des comptes de l'écosystème.
                    
                    16. Relations avec les autres entités : Connecté à AJ-Cloud pour le stockage des boîtes mails, AJ-Fondation Biz pour équiper les nouvelles startups et AJ-TECH pour l'authentification.
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2026–2027) : Configuration des serveurs de test et mise en place des politiques de délivrabilité (SPF/DKIM/DMARC) ;
                    - Moyen terme (2028–2030) : Déploiement interne pour toutes les entités AJ-TECH et ouverture d'une offre pour les PME locales ;
                    - Long terme (2031–2035) : Offre souveraine pour les administrations publiques et institutions d'enseignement supérieur.
                    
                    18. Perspectives internationales : Interopérabilité complète avec tous les standards de messagerie mondiaux et passerelle sécurisée pour le commerce transfrontalier.
                """.trimIndent(),
                contentHt = """
                    1. Non : AJ-Mail (Mesajri Elektwonik Pwofesyonèl Souveren).
                    
                    2. Estati ofisyèl kounye a : PLANIFYE / AN KONSEPSYON. Pwojè sèvis imèl pou antrepriz ak leta nan peyi a.
                    
                    3. Orijin konsèp la : Konsta prèske tout antrepriz, lekòl ak ministè an Ayiti ap itilize vye imèl pèsonèl gratis (Gmail, Yahoo) pou fè zafè ofisyèl.
                    
                    4. Misyon : Bay chak biznis ak chak òganizasyon an Ayiti bon adrès imèl pwofesyonèl ki an sekirite epi ki bay respè.
                    
                    5. Vizyon : Fè tout biznis ak enstitisyon nan peyi a gen pwòp adrès imèl sou non yo pou ogmante kredibilite yo.
                    
                    6. Pwoblèm li rezoud : Done enpòtan ki an risk, moun k ap pran non biznis la pou fè magouy ak mank pwofesyonalis devan patnè entènasyonal.
                    
                    7. Solisyon li pote : Sèvis imèl konplè ak non antrepriz la menm, bèl bwat mesaj ki senp epi rapid, kalandriye pataje ak bon filtè kont vòlè enfòmasyon.
                    
                    8. Moun li vize : Ti ak gwo antrepriz, inivèsite, lekòl, ministè, anbasad ak tout moun k ap travay nan biwo.
                    
                    9. Fonksyonalite prensipal yo :
                    - Bwat imèl sou non antrepriz la menm (pa egzanp : kontak@antrepriz.ht) ;
                    - Paj lekti imèl ki bèl, ki rapid epi ki pa lou sou ti entènèt ;
                    - Kalandriye pou pran randevou ak lis kontak tout moun nan biwo a ;
                    - Pwoteksyon kont spèm ak mesaj ki vle vòlè modpas ou.
                    
                    10. Arkitekti teknik : Sèvè imèl souveren ki konekte ak espas depo AJ-Cloud epi ki itilize pwotokòl modèn tankou JMAP ak IMAP.
                    
                    11. Teknoloji yo prevwa itilize : Postfix, Dovecot, API JMAP, Kotlin / Compose Web, chifreman OpenPGP, estanda SPF / DKIM / DMARC.
                    
                    12. Entèlijans atifisyèl : Klase imèl ki pi enpòtan yo otomatikman epi ede w ekri bèl lèt pwofesyonèl an franse ak angle.
                    
                    13. Sekirite : Chifreman TLS sou tout lèt k ap voye, pwoteksyon DNSSEC ak otantifikasyon milti-faktè (MFA).
                    
                    14. Modèl ekonomik : Pou defini (Ti abònman chak mwa oswa chak ane ki pa chè pou chak bwat imèl ak espas depo).
                    
                    15. Entegrasyon ak AJ-TECH : Sèvi kòm sistèm voye tout notifikasyon ak lèt ofisyèl pou tout kont nan ekosistèm nan.
                    
                    16. Relasyon ak lòt antite yo : Konekte ak AJ-Cloud pou sere imèl yo, AJ-Fondation Biz pou bay nouvo antrepriz imèl pwofesyonèl ak AJ-TECH pou koneksyon.
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2026–2027) : Prepare sèvè tès yo epi mete tout règ sekirite entènasyonal pou imèl yo pa tonbe nan spèm ;
                    - Mwayen tèm (2028–2030) : Sèvi ak li pou tout 21 antite AJ-TECH yo epi louvri sèvis la pou ti antrepriz lokal yo ;
                    - Long tèm (2031–2035) : Sèvis ofisyèl pou gwo enstitisyon leta ak inivèsite nan tout peyi a.
                    
                    18. Pèspektiv entènasyonal : Mache san pwoblèm ak tout lòt sistèm imèl nan mond lan epi bay biznis ayisyen yo bon imaj entènasyonal.
                """.trimIndent(),
                plannedStartPage = 170,
                plannedEndPage = 174,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 35 : AJ-Studio ====================
            BookChapter(
                id = "ch_3_35",
                chapterNumber = 35,
                partId = "part_3",
                titleFr = "Chapitre 35 — AJ-Studio",
                titleHt = "Chapit 35 — AJ-Studio",
                subtitleFr = "Plateforme de création multimédia et design digital",
                subtitleHt = "Platfòm kreyasyon miltimedya ak konsepsyon dijital",
                summaryFr = "Fiche d'ingénierie d'AJ-Studio, outil de création graphique en ligne valorisant le patrimoine visuel et culturel caribéen.",
                summaryHt = "Fich enjenyri sou AJ-Studio, zouti desen ak afich sou entènèt ki mete kilti ak bèl atizay ayisyen an valè.",
                contentFr = """
                    1. Nom : AJ-Studio (Plateforme de Création Multimédia & Design Digital).
                    
                    2. Statut actuel officiel : CONCEPT / EN CONCEPTION. Projet d'outil créatif en ligne.
                    
                    3. Origine du concept : Volonté de démocratiser les outils de conception graphique et de fournir aux créateurs haïtiens des ressources visuelles ancrées dans leur propre culture.
                    
                    4. Mission : Permettre à chaque entrepreneur, communicant et créateur de concevoir rapidement des visuels professionnels sans expertise technique complexe.
                    
                    5. Vision : Constituer la plus vaste bibliothèque numérique de graphismes, typographies et motifs visuels authentiquement caribéens.
                    
                    6. Problème résolu : Coût inaccessible des logiciels de design professionnels étrangers (Adobe, Canva Pro) et absence de représentations culturelles locales dans les banques d'images mondiales.
                    
                    7. Solution proposée : Studio de création graphique en ligne basé sur navigateur, doté de modèles prédéfinis (flyers, affiches, bannières réseaux sociaux) et d'actifs visuels locaux.
                    
                    8. Public cible : Graphistes, créateurs de contenus, responsables marketing de PME, étudiants, organisateurs d'événements et artisans.
                    
                    9. Fonctionnalités principales :
                    - Éditeur visuel interactif glisser-déposer fonctionnant dans le navigateur ;
                    - Bibliothèque de typographies, textures et illustrations inspirées de l'art haïtien ;
                    - Modèles professionnels prêts à l'emploi adaptés aux formats populaires ;
                    - Exportation haute résolution aux formats PNG, SVG et PDF imprimable.
                    
                    10. Architecture technique : Moteur de rendu graphique 2D/3D accéléré par le matériel via WebAssembly (Wasm) et l'API HTML5 Canvas.
                    
                    11. Technologies envisagées : TypeScript, WebAssembly, HTML5 Canvas API, WebGL, Rust pour le moteur de manipulation d'images.
                    
                    12. Intelligence artificielle : Génération assistée d'harmonies de couleurs et détourage intelligent automatique des arrière-plans d'images.
                    
                    13. Sécurité : Protection du droit d'auteur des artistes contributeurs par filigrane numérique et chiffrement des projets personnels.
                    
                    14. Modèle économique : Modèle freemium : outils et modèles de base gratuits, bibliothèque d'actifs exclusifs et exportations vectorielles avancées sur abonnement.
                    
                    15. Intégration avec AJ-TECH : Fournisseur officiel d'outils visuels pour les boutiques d'AJ-Commerce, les cours d'AJ-Learn et les publications institutionnelles.
                    
                    16. Relations avec les autres entités : Connecté à AJ-Commerce pour la création de visuels produits, EDUKA pour les supports pédagogiques et AJ-Cloud pour le stockage des médias.
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2026–2027) : Développement du moteur de rendu graphique dans le navigateur et constitution des premières collections de visuels locaux ;
                    - Moyen terme (2028–2030) : Lancement de la plateforme web et partenariats avec les écoles d'art et graphistes haïtiens ;
                    - Long terme (2031–2035) : Expansion comme référence du design digital pour toute la région des Caraïbes.
                    
                    18. Perspectives internationales : Vitrine internationale pour les artistes visuels haïtiens et exportation de banques d'images caribéennes.
                """.trimIndent(),
                contentHt = """
                    1. Non : AJ-Studio (Platfòm Kreyasyon Miltimedya & Konsepsyon Dijital).
                    
                    2. Estati ofisyèl kounye a : KONSÈP / AN KONSEPSYON. Pwojè zouti desen sou entènèt.
                    
                    3. Orijin konsèp la : Volonte pou pèmèt tout moun fè bèl desen ak afich fasil epi bay kreyatè ayisyen yo bonjan imaj ki soti nan kilti pa nou.
                    
                    4. Misyon : Pèmèt chak moun ki gen biznis oswa k ap kreye kontni fè bèl afich pwofesyonèl san yo pa bezwen se gwo ekspè nan desen.
                    
                    5. Vizyon : Kreye pi gwo bank imaj, bèl lèt ak desen nimerik nan tout Karayib la.
                    
                    6. Pwoblèm li rezoud : Gwo pri lojisyèl etranje yo (Adobe, Canva Pro) ak mank foto ak desen ki sanble ak moun ak kilti ayisyen sou sit entènasyonal yo.
                    
                    7. Solisyon li pote : Zouti desen sou navigatè ki gen anpil modèl afich pare pou fèt (banyè, fleyè, foto pou rezo sosyal) ak bèl imaj lokal.
                    
                    8. Moun li vize : Grafis, moun k ap fè videyo ak foto, ti biznis, etidyan, moun k ap òganize fèt ak atizan.
                    
                    9. Fonksyonalite prensipal yo :
                    - Zouti pou trennen epi depoze foto ak lèt fasil nan navigatè a ;
                    - Bank bèl lèt kreyòl, desen ak imaj ki soti nan atizay ayisyen ;
                    - Modèl afich pare pou itilize pou tout kalite rezo sosyal ;
                    - Ekspòte desen yo an gwo kalite (PNG, SVG, PDF pou enprime).
                    
                    10. Arkitekti teknik : Motè desen grafik 2D/3D ki rapid anpil gras ak teknoloji WebAssembly (Wasm) ak Canvas HTML5.
                    
                    11. Teknoloji yo prevwa itilize : TypeScript, WebAssembly, HTML5 Canvas API, WebGL, motè Rust pou trete foto rapid.
                    
                    12. Entèlijans atifisyèl : Chwazi bèl konbinezon koulè otomatikman epi retire fon ki dèyè foto yo an yon sèl klik.
                    
                    13. Sekirite : Pwoteje dwa atis ki mete desen yo sou sit la ak kache pwojè pèsonèl chak itilizatè.
                    
                    14. Modèl ekonomik : Modèl freemium : zouti ak modèl debaz gratis, bèl imaj espesyal ak ekspòtasyon avanse peye.
                    
                    15. Entegrasyon ak AJ-TECH : Zouti prensipal pou kreye afich pou boutik AJ-Commerce, kou AJ-Learn ak kominikasyon tout rès pwojè yo.
                    
                    16. Relasyon ak lòt antite yo : Konekte ak AJ-Commerce pou foto pwodui, EDUKA pou liv ak fèy travay, ak AJ-Cloud pou sere desen yo.
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2026–2027) : Devlope motè desen an nan navigatè epi rasanble premye bank foto ak desen ayisyen yo ;
                    - Mwayen tèm (2028–2030) : Lansman sitwèb la epi fè patenarya ak atis ak grafis ayisyen ;
                    - Long tèm (2031–2035) : Vin zouti referans pou kreyasyon vizyèl nan tout Karayib la.
                    
                    18. Pèspektiv entènasyonal : Fè tout mond lan dekouvri bèl kilti vizyèl ayisyen an epi vann imaj sa yo bay konpayi etranje.
                """.trimIndent(),
                plannedStartPage = 175,
                plannedEndPage = 179,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 36 : AJ-Dev ====================
            BookChapter(
                id = "ch_3_36",
                chapterNumber = 36,
                partId = "part_3",
                titleFr = "Chapitre 36 — AJ-Dev",
                titleHt = "Chapit 36 — AJ-Dev",
                subtitleFr = "Portail et outils pour développeurs haïtiens",
                subtitleHt = "Pòtay ak zouti pou devlopè ayisyen",
                summaryFr = "Fiche d'ingénierie d'AJ-Dev, portail pour développeurs fournissant SDKs, documentations et bacs à sable techniques.",
                summaryHt = "Fich enjenyri sou AJ-Dev, espas pou devlopè ayisyen jwenn SDK, dokimantasyon ak zouti pou pwograme.",
                contentFr = """
                    1. Nom : AJ-Dev (Portail & Outils pour Développeurs Haïtiens).
                    
                    2. Statut actuel officiel : CONCEPT / EN CONCEPTION. Projet de portail communautaire et technique.
                    
                    3. Origine du concept : Constat du manque de documentation contextualisée et de la difficulté des développeurs haïtiens à intégrer des services locaux fiables dans leurs applications.
                    
                    4. Mission : Fournir aux développeurs haïtiens et de la diaspora les bibliothèques logicielles, APIs et documentations nécessaires pour bâtir la nouvelle économie numérique.
                    
                    5. Vision : Fédérer une communauté nationale de 50 000 ingénieurs logiciels qualifiés et connectés aux standards internationaux.
                    
                    6. Problème résolu : Isolement technique des développeurs locaux, manque d'environnements de test pour les solutions financières et cadastrales locales.
                    
                    7. Solution proposée : Portail unifié pour développeurs regroupant la documentation officielle des 21 entités AJ-TECH, des kits de développement (SDKs), des exemples de code et un espace d'émulation.
                    
                    8. Public cible : Développeurs indépendants, étudiants en informatique, agences de développement web/mobile et startups tech.
                    
                    9. Fonctionnalités principales :
                    - Documentation interactive bilingue (Français / Créole) de toutes les APIs AJ-TECH ;
                    - SDKs officiels pour Kotlin, TypeScript, Python et Dart/Flutter ;
                    - Environnement de test (Sandbox) pour simuler paiements et authentification ;
                    - Forum technique d'entraide et partage de bibliothèques open-source.
                    
                    10. Architecture technique : Portail de documentation généré statiquement avec passerelle API dynamique pour les tests en direct (API Explorer).
                    
                    11. Technologies envisagées : Kotlin Multiplatform, TypeScript, Markdown / Docusaurus, GraphQL, API Gateway REST.
                    
                    12. Intelligence artificielle : Assistant virtuel spécialisé dans l'explication du code et la génération automatique d'exemples d'intégration des APIs AJ-TECH.
                    
                    13. Sécurité : Gestion rigoureuse des clés d'API (API Keys) avec révocation instantanée, limitation de débit (rate limiting) et isolation des comptes bac à sable.
                    
                    14. Modèle économique : Accès gratuit à la documentation et aux SDKs, forfaits payants pour les quotas élevés d'utilisation d'APIs en production.
                    
                    15. Intégration avec AJ-TECH : Vitrine technique officielle permettant à l'écosystème d'attirer et d'intégrer des contributions tierces.
                    
                    16. Relations avec les autres entités : Connecté à toutes les entités techniques (AJ-Pay, AJ-Cloud, AJ-Assistant, AJ-Maps, EDUKA).
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2026–2027) : Publication des spécifications d'APIs préliminaires et des premiers guides de démarrage rapide ;
                    - Moyen terme (2028–2030) : Lancement des SDKs officiels et organisation des premiers hackathons technologiques nationaux ;
                    - Long terme (2031–2035) : Établissement d'un programme de certification pour les développeurs agréés AJ-TECH.
                    
                    18. Perspectives internationales : Collaboration avec les communautés open-source mondiales et mise en valeur des talents haïtiens auprès des recruteurs internationaux.
                """.trimIndent(),
                contentHt = """
                    1. Non : AJ-Dev (Pòtay & Zouti pou Devlopè Ayisyen).
                    
                    2. Estati ofisyèl kounye a : KONSÈP / AN KONSEPSYON. Pwojè pòtay teknik pou rasanble tout devlopè.
                    
                    3. Orijin konsèp la : Konsta mank bon dokimantasyon ki adapte ak difikilte devlopè ayisyen genyen pou jwenn bon zouti lokal pou mete nan aplikasyon yo.
                    
                    4. Misyon : Bay devlopè ayisyen ak sa ki nan dyaspora a tout SDK, API ak dokiman yo bezwen pou kreye nouvo solisyon nimerik pou peyi a.
                    
                    5. Vizyon : Rasanble yon kominote 50 000 enjenyè lojisyèl kalifye an Ayiti ki nan menm nivo ak tout devlopè sou latè.
                    
                    6. Pwoblèm li rezoud : Devlopè ki travay poukont yo san èd, mank espas pou teste lojisyèl ak mank zouti lokal ki fyab.
                    
                    7. Solisyon li pote : Pòtay inifye ki gen tout dokimantasyon ofisyèl sou 21 antite AJ-TECH yo, zouti SDK, egzanp kòd ak espas tès pou pwograme.
                    
                    8. Moun li vize : Devlopè endepandan, etidyan nan enfòmatik, konpayi k ap fè aplikasyon ak tout pasyone kòd.
                    
                    9. Fonksyonalite prensipal yo :
                    - Dokimantasyon entèaktif an de lang (Fransè ak Kreyòl) sou tout API AJ-TECH ;
                    - SDK ofisyèl pou Kotlin, TypeScript, Python ak Dart/Flutter ;
                    - Espas tès (Sandbox) pou teste peman ak koneksyon san touche vrè kòb ;
                    - Fowòm diskisyon pou devlopè ede youn lòt epi pataje kòd ouvè.
                    
                    10. Arkitekti teknik : Pòtay dokimantasyon modèn ki rapid anpil ak yon zouti entèaktif pou teste API yo dirèkteman sou sit la.
                    
                    11. Teknoloji yo prevwa itilize : Kotlin Multiplatform, TypeScript, Markdown / Docusaurus, GraphQL, API Gateway REST.
                    
                    12. Entèlijans atifisyèl : Ti asistan entèlijan ki ede eksplike kòd la epi ki bay egzanp otomatik sou kijan pou itilize API yo.
                    
                    13. Sekirite : Jesyon sekirize sou kle API yo, posiblite pou bloke yo touswit si yo pèdi epi kontwòl strik sou limit apèl yo.
                    
                    14. Modèl ekonomik : Aksè gratis pou aprann ak teste, fòmil peye pou gwo konpayi k ap fè anpil apèl sou API yo an pwodiksyon.
                    
                    15. Entegrasyon ak AJ-TECH : Pòt antre ofisyèl pou tout moun deyò ki vle bati aplikasyon sou ekosistèm AJ-TECH la.
                    
                    16. Relasyon ak lòt antite yo : Konekte ak tout antite teknik yo (AJ-Pay, AJ-Cloud, AJ-Assistant, AJ-Maps, EDUKA).
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2026–2027) : Pibliye premye dokiman sou API yo ak premye gid fasil pou kòmanse kòde ;
                    - Mwayen tèm (2028–2030) : Mete premye SDK ofisyèl yo deyò epi òganize gwo konkou pwogramasyon (hackathons) nan peyi a ;
                    - Long tèm (2031–2035) : Kreye yon sètifika ofisyèl pou devlopè ki metrize teknoloji AJ-TECH yo.
                    
                    18. Pèspektiv entènasyonal : Travay ansanm ak gwo kominote open-source nan mond lan epi ede devlopè ayisyen jwenn bon kontra travay entènasyonal.
                """.trimIndent(),
                plannedStartPage = 180,
                plannedEndPage = 184,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 37 : AJ-Maps ====================
            BookChapter(
                id = "ch_3_37",
                chapterNumber = 37,
                partId = "part_3",
                titleFr = "Chapitre 37 — AJ-Maps",
                titleHt = "Chapit 37 — AJ-Maps",
                subtitleFr = "Service de cartographie et navigation locale",
                subtitleHt = "Sèvis katografi ak navigasyon lokal",
                summaryFr = "Fiche d'ingénierie d'AJ-Maps, projet de cartographie collaborative et de géolocalisation adapté aux réalités haïtiennes.",
                summaryHt = "Fich enjenyri sou AJ-Maps, pwojè kat ak navigasyon ki konnen tout lari ak repè lokal an Ayiti.",
                contentFr = """
                    1. Nom : AJ-Maps (Service de Cartographie & Navigation Locale).
                    
                    2. Statut actuel officiel : PLANIFIÉ / EN CONCEPTION. Projet de cartographie enrichie localement.
                    
                    3. Origine du concept : Constat des lacunes sévères de Google Maps et Apple Maps en Haïti : adresses manquantes, quartiers non répertoriés et absence de prise en compte des repères visuels locaux.
                    
                    4. Mission : Cartographier avec fidélité chaque rue, commune, commerce et point d'intérêt du territoire haïtien.
                    
                    5. Vision : Devenir le système de géolocalisation, de routage et d'adressage de référence en Haïti.
                    
                    6. Problème résolu : Erreurs d'itinéraires, impossibilité pour les livreurs de localiser les clients sans appels téléphoniques répétés et manque de données de secours en cas de catastrophe naturelle.
                    
                    7. Solution proposée : Plateforme cartographique collaborative enrichie de repères communautaires, de données d'altitude et de guidage GPS fonctionnant entièrement hors-ligne.
                    
                    8. Public cible : Chauffeurs, livreurs, commerçants, touristes, services d'urgence, services de voirie et grand public.
                    
                    9. Fonctionnalités principales :
                    - Navigation GPS vocale bilingue (Créole / Français) fonctionnant hors-ligne ;
                    - Recherche par repères visuels populaires locaux (carrefours connus, monuments, boutiques repères) ;
                    - Signalement communautaire des conditions de circulation et obstacles ;
                    - API cartographique pour les services de livraison et d'e-commerce.
                    
                    10. Architecture technique : Moteur de tuiles vectorielles basé sur les données ouvertes OpenStreetMap, enrichi par une base géospatiale nationale propriétaire.
                    
                    11. Technologies envisagées : OpenStreetMap Core, MapLibre GL, PostGIS, Kotlin Multiplatform, protocoles de géocodage local.
                    
                    12. Intelligence artificielle : Calcul d'itinéraires optimisés prenant en compte l'état des routes, les pentes et les zones à risques temporaires.
                    
                    13. Sécurité : Respect strict de la vie privée des utilisateurs, anonymisation complète des trajets et stockage local des historiques de navigation.
                    
                    14. Modèle économique : À définir (Gratuit pour le grand public, API de géocodage et de calcul d'itinéraires payante pour les entreprises de livraison).
                    
                    15. Intégration avec AJ-TECH : Fournisseur de la couche spatiale pour AJ-Tè (foncier), AJ-Commerce (livraison) et AJ-Task (géolocalisation de tâches).
                    
                    16. Relations avec les autres entités : Connecté à AJ-Tè pour les parcelles, AJ-Commerce pour la logistique et AJ-Assistant pour le guidage vocal.
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2026–2027) : Collecte et structuration des données cartographiques de base sur la région métropolitaine de Port-au-Prince ;
                    - Moyen terme (2028–2030) : Lancement de l'application de navigation avec mode hors-ligne et enrichissement communautaire ;
                    - Long terme (2031–2035) : Couverture exhaustive des 10 départements d'Haïti et intégration aux plans de secours d'urgence.
                    
                    18. Perspectives internationales : Contribution active aux bases de données mondiales OpenStreetMap et partage des méthodologies de cartographie participative.
                """.trimIndent(),
                contentHt = """
                    1. Non : AJ-Maps (Sèvis Katografi & Navigasyon Lokal).
                    
                    2. Estati ofisyèl kounye a : PLANIFYE / AN KONSEPSYON. Pwojè kat ak navigasyon ki fèt sou plas.
                    
                    3. Orijin konsèp la : Konsta gwo mank sou Google Maps ak Apple Maps an Ayiti : anpil lari pa gen non, katye ki pa parèt epi zouti etranje yo pa konprann repè moun konn itilize nan zòn nan.
                    
                    4. Misyon : Mete sou kat ak tout presizyon chak lari, chak komin, chak boutik ak tout kote enpòtan an Ayiti.
                    
                    5. Vizyon : Vin pi bon sistèm kat, gid wout ak adrès pou tout peyi Ayiti.
                    
                    6. Pwoblèm li rezoud : Moun k ap pèdi nan wout, livrè ki pa ka jwenn kay kliyan san yo pa rele san rete epi mank kat lè gen gwo dezas natirèl.
                    
                    7. Solisyon li pote : Kat entèaktif ki fèt ak èd tout moun, ki gen repè popilè nou konnen, epi gid GPS ki mache menm san entènèt.
                    
                    8. Moun li vize : Chofè, moun k ap fè livrezon, machann, touris, ponpye ak anbilans, tout moun.
                    
                    9. Fonksyonalite prensipal yo :
                    - Gid GPS ak vwa an Kreyòl ak Fransè ki mache san entènèt ;
                    - Chèche kote pa repè popilè (kafou li te ye, bò pon, bò legliz, bò estasyon) ;
                    - Moun ka bay rapò si gen dlo nan wout oswa si lari a bloke ;
                    - API kat pou tout moun k ap fè biznis livrezon ak komès sou sit.
                    
                    10. Arkitekti teknik : Motè kat modèn ki baze sou baz done ouvè OpenStreetMap konbine ak done nasyonal nou ranmase sou plas.
                    
                    11. Teknoloji yo prevwa itilize : OpenStreetMap Core, MapLibre GL, PostGIS, Kotlin Multiplatform, sistèm adrès lokal.
                    
                    12. Entèlijans atifisyèl : Kalkile pi bon wout selon jan lari a ye, monte desann wout la ak nivo sekirite nan zòn nan.
                    
                    13. Sekirite : Respè total lavi prive moun, kache idantite sou tout wout ou fè epi sere kote w te ale sou telefòn ou sèlman.
                    
                    14. Modèl ekonomik : Pou defini (Gratis pou tout moun senp, API peye pou gwo biznis livrezon ak taksi).
                    
                    15. Entegrasyon ak AJ-TECH : Bay sèvis kat pou AJ-Tè (zafè tè), AJ-Commerce (livre machandiz) ak AJ-Task (kote travay ap fèt).
                    
                    16. Relasyon ak lòt antite yo : Konekte ak AJ-Tè pou limit mòso tè yo, AJ-Commerce pou livrezon ak AJ-Assistant pou bay direksyon ak vwa.
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2026–2027) : Ranmase epi òganize done sou kat zòn Pòtoprens ak vil ki bò kote l yo ;
                    - Mwayen tèm (2028–2030) : Mete aplikasyon navigasyon an deyò ak mòd san entènèt epi pèmèt moun ajoute repè ;
                    - Long tèm (2031–2035) : Fini kat tout 10 depatman nan peyi a epi sèvi kòm zouti sekou nan moman ijans.
                    
                    18. Pèspektiv entènasyonal : Pataje done yo ak rezo entènasyonal OpenStreetMap epi montre kijan kominote ka bati pwòp kat pa yo.
                """.trimIndent(),
                plannedStartPage = 185,
                plannedEndPage = 189,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 38 : AJ-Fondation Biz ====================
            BookChapter(
                id = "ch_3_38",
                chapterNumber = 38,
                partId = "part_3",
                titleFr = "Chapitre 38 — AJ-Fondation Biz",
                titleHt = "Chapit 38 — AJ-Fondation Biz",
                subtitleFr = "Accompagnement et guichet numérique pour startups",
                subtitleHt = "Akonpayman ak pòtay dijital pou nouvo antrepriz",
                summaryFr = "Fiche d'ingénierie d'AJ-Fondation Biz, plateforme d'incubation numérique et de formalisation d'entreprises.",
                summaryHt = "Fich enjenyri sou AJ-Fondation Biz, platfòm pou ede jèn yo monte biznis legal epi fè yo grandi.",
                contentFr = """
                    1. Nom : AJ-Fondation Biz (Accompagnement & Guichet Numérique pour Startups).
                    
                    2. Statut actuel officiel : CONCEPT / EN CONCEPTION. Projet d'accompagnement entrepreneurial numérique.
                    
                    3. Origine du concept : Complexité des démarches administratives, juridiques et fiscales qui découragent les jeunes entrepreneurs et maintiennent une grande majorité de l'économie dans l'informel.
                    
                    4. Mission : Accompagner la formalisation, la structuration et la croissance pérenne des nouvelles entreprises haïtiennes.
                    
                    5. Vision : Propulser l'émergence de 500 startups et PME structurées, viables et créatrices d'emplois en Haïti d'ici 2035.
                    
                    6. Problème résolu : Lenteur bureaucratique, méconnaissance des statuts juridiques adaptés, absence de modèles comptables simples et manque de mentorat d'affaires.
                    
                    7. Solution proposée : Guichet unique numérique guidant pas à pas l'entrepreneur : rédaction de statuts, plans financiers interactifs, checklist fiscale et mise en relation avec des experts.
                    
                    8. Public cible : Porteurs de projets, commerçants souhaitant se formaliser, jeunes diplômés, artisans et startups technologiques.
                    
                    9. Fonctionnalités principales :
                    - Générateur de statuts juridiques et documents contractuels conformes au droit haïtien ;
                    - Modélisateur de plans d'affaires et prévisionnels financiers interactifs ;
                    - Guide des obligations fiscales et administratives locales ;
                    - Coffre-fort documentaire d'entreprise sécurisé.
                    
                    10. Architecture technique : Plateforme web modulaire avec moteur de génération documentaire dynamique et espace collaboratif sécurisé.
                    
                    11. Technologies envisagées : Kotlin Compose Multiplatform, Node.js, PostgreSQL, moteur de génération PDF certifié, chiffrement des pièces d'affaires.
                    
                    12. Intelligence artificielle : Outil de diagnostic automatisé évaluant la viabilité financière et la cohérence du plan d'affaires soumis.
                    
                    13. Sécurité : Confidentialité absolue des données stratégiques d'affaires et coffre-fort documentaire chiffré par clé unique.
                    
                    14. Modèle économique : En cours de conception (Guides et modèles de base en accès libre, services d'accompagnement personnalisé et outils premium payants).
                    
                    15. Intégration avec AJ-TECH : Alimente l'écosystème en nouvelles entreprises utilisatrices des services AJ-Pay, AJ-Mail et AJ-Cloud.
                    
                    16. Relations avec les autres entités : Connecté à AJ-Pay pour la monétisation, AJ-Mail pour la messagerie pro, AJ-Commerce pour les débouchés et AJ-TECH.
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2026–2027) : Rédaction des modèles juridiques et comptables avec des juristes locaux et prototypage de la plateforme web ;
                    - Moyen terme (2028–2030) : Lancement officiel du guichet numérique et premier programme d'accélération pour 50 startups pilotes ;
                    - Long terme (2031–2035) : Réseau national d'accompagnement connecté aux fonds d'investissement et à la diaspora.
                    
                    18. Perspectives internationales : Création de ponts d'investissement entre les startups haïtiennes accompagnées et les réseaux de business angels de la diaspora nord-américaine et européenne.
                """.trimIndent(),
                contentHt = """
                    1. Non : AJ-Fondation Biz (Akonpayman & Pòtay Dijital pou Nouvo Antrepriz).
                    
                    2. Estati ofisyèl kounye a : KONSÈP / AN KONSEPSYON. Pwojè pou ede moun monte biznis sou entènèt.
                    
                    3. Orijin konsèp la : Gwo difikilte nan papye leta, lalwa ak taks ki fè anpil jèn dekouraje monte biznis epi ki kenbe anpil moun nan komès enfòmèl.
                    
                    4. Misyon : Ede tout moun ki vle monte biznis an Ayiti jwenn bon papye legal, byen òganize jesyon yo epi grandi san kase tèt.
                    
                    5. Vizyon : Ede monte 500 nouvo ti antrepriz ki solid, legal epi k ap kreye bon travay an Ayiti anvan lane 2035.
                    
                    6. Pwoblèm li rezoud : Demenajman nan biwo leta, mank modèl papye legal ki kòrèk, mank zouti pou kontwole lajan ak mank konsèy pou antreprenè.
                    
                    7. Solisyon li pote : Yon pòtay dijital ki gide antreprenè a etap pa etap : prepare papye legal, kalkile plan lajan, konnen sa leta mande ak jwenn konsèy nan men ekspè.
                    
                    8. Moun li vize : Moun ki gen lide biznis, machann ki vle vin legal, jèn ki fenk fini inivèsite ak ti konpayi teknoloji.
                    
                    9. Fonksyonalite prensipal yo :
                    - Prepare papye legal ak kontra ki konfòm ak lwa peyi Ayiti ;
                    - Zouti fasil pou kalkile kòb biznis la ap bezwen ak sa li ka fè ;
                    - Gid klè sou tout sa leta mande pou taks ak deklarasyon ;
                    - Kòfrefò dijital an sekirite pou sere tout dokiman biznis la.
                    
                    10. Arkitekti teknik : Platfòm sitwèb modèn ki ka prepare bèl dokiman PDF ofisyèl epi ki gen espas travay an sekirite.
                    
                    11. Teknoloji yo prevwa itilize : Kotlin Compose Multiplatform, Node.js, PostgreSQL, motè PDF sekirize, chifreman dokiman biznis.
                    
                    12. Entèlijans atifisyèl : Analiz otomatik pou gade si plan biznis la solid epi bay konsèy sou kijan pou amelyore li.
                    
                    13. Sekirite : Sekrè total sou tout lide ak chif biznis moun yo ak kòfrefò chifre pou dokiman yo.
                    
                    14. Modèl ekonomik : An kou konsepsyon (Modèl ak gid debaz gratis, akonpayman pèsonalize ak sèvis espesyal peye).
                    
                    15. Entegrasyon ak AJ-TECH : Nouri ekosistèm nan ak nouvo biznis ki pral itilize AJ-Pay, AJ-Mail ak AJ-Cloud.
                    
                    16. Relasyon ak lòt antite yo : Konekte ak AJ-Pay pou peman, AJ-Mail pou bèl imèl biznis, AJ-Commerce pou vann machandiz ak AJ-TECH.
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2026–2027) : Ekri tout modèl papye legal ak kontab ansanm ak avoka ayisyen epi prepare sitwèb la ;
                    - Mwayen tèm (2028–2030) : Lansman ofisyèl pòtay la epi akonpaye premye 50 ti antrepriz pilòt yo ;
                    - Long tèm (2031–2035) : Gwo rezo nasyonal ki konekte antreprenè ayisyen ak envestisè nan tout mond lan.
                    
                    18. Pèspektiv entènasyonal : Konekte antrepriz lokal yo ak moun nan dyaspora a ki vle envesti nan bon pwojè serye nan peyi a.
                """.trimIndent(),
                plannedStartPage = 190,
                plannedEndPage = 194,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 39 : AJ-Commerce ====================
            BookChapter(
                id = "ch_3_39",
                chapterNumber = 39,
                partId = "part_3",
                titleFr = "Chapitre 39 — AJ-Commerce",
                titleHt = "Chapit 39 — AJ-Commerce",
                subtitleFr = "Place de marché et commerce électronique local",
                subtitleHt = "Mache dijital ak komès sou entènèt lokal",
                summaryFr = "Fiche d'ingénierie d'AJ-Commerce, place de marché numérique pour les producteurs et marchands haïtiens.",
                summaryHt = "Fich enjenyri sou AJ-Commerce, platfòm pou achte ak vann pwodui lokal ak atizay sou entènèt.",
                contentFr = """
                    1. Nom : AJ-Commerce (Place de Marché & Commerce Électronique Local).
                    
                    2. Statut actuel officiel : CONCEPT / EN CONCEPTION. Projet de marketplace nationale.
                    
                    3. Origine du concept : Difficulté pour les producteurs agricoles, artisans et commerçants haïtiens d'écouler leurs marchandises en dehors de leur quartier immédiat en raison de l'insécurité routière et des blocages logistiques.
                    
                    4. Mission : Connecter directement producteurs, commerçants et consommateurs à travers une vitrine d'e-commerce fiable et locale.
                    
                    5. Vision : Devenir la plus grande plateforme de vente en ligne et de valorisation des produits haïtiens dans le pays et vers la diaspora.
                    
                    6. Problème résolu : Dépendance aux intermédiaires abusifs, pertes post-récoltes agricoles et isolement commercial des artisans de province.
                    
                    7. Solution proposée : Plateforme de e-commerce multi-vendeurs avec gestion simplifiée des stocks, paiements intégrés et coordination de livraison.
                    
                    8. Public cible : Producteurs locaux, coopératives agricoles, créateurs de mode, artisans d'art, commerçants et consommateurs.
                    
                    9. Fonctionnalités principales :
                    - Boutiques personnalisables pour chaque marchand ou artisan ;
                    - Catalogue de produits avec photos, descriptions et gestion des stocks en temps réel ;
                    - Encaissement sécurisé multi-moyens via AJ-Pay ;
                    - Suivi des commandes et alertes de livraison par SMS / WhatsApp.
                    
                    10. Architecture technique : Plateforme web et mobile progressive, catalogue distribué avec cache optimisé et moteur de recherche sémantique.
                    
                    11. Technologies envisagées : Kotlin Multiplatform, Next.js / Compose Web, PostgreSQL, ElasticSearch / Meilisearch, intégration API logistique.
                    
                    12. Intelligence artificielle : Moteur de recommandation personnalisé pour valoriser les produits du terroir et prévision de la demande saisonnière.
                    
                    13. Sécurité : Protection contre les faux marchands par vérification d'identité (KYC), avis clients certifiés et garantie de remboursement en cas de litige.
                    
                    14. Modèle économique : À définir (Commission modérée sur chaque vente réussie et options de mise en avant publicitaire des boutiques).
                    
                    15. Intégration avec AJ-TECH : Vitrine commerciale connectée aux systèmes de paiement (AJ-Pay) et de livraison (AJ-Maps) de l'écosystème.
                    
                    16. Relations avec les autres entités : Connecté à AJ-Pay pour les paiements, AJ-Maps pour le calcul des frais de livraison, AJ-Studio pour les visuels et AJ-Wallet.
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2026–2027) : Études de flux logistiques et conception de la plateforme pour une catégorie pilote (artisanat et mode) ;
                    - Moyen terme (2028–2030) : Lancement officiel avec livraison dans la zone métropolitaine et ouverture aux commandes de la diaspora ;
                    - Long terme (2031–2035) : Extension aux produits agricoles frais avec relais frigorifiques départementaux.
                    
                    18. Perspectives internationales : Canal direct d'exportation de l'artisanat et des denrées d'exception haïtiennes (café, cacao, huiles essentielles) vers le marché mondial.
                """.trimIndent(),
                contentHt = """
                    1. Non : AJ-Commerce (Mache Dijital & Komès sou Entènèt Lokal).
                    
                    2. Estati ofisyèl kounye a : KONSÈP / AN KONSEPSYON. Pwojè mache sou entènèt pou tout peyi a.
                    
                    3. Orijin konsèp la : Difikilte kiltivatè, atizan ak machann ayisyen genyen pou vann sa yo pwodui bay lòt moun pi lwen poutèt lari bloke ak pwoblèm transpò.
                    
                    4. Misyon : Konekte moun ki fè pwodui yo, machann ak tout moun k ap achte sou yon sèl bèl sitwèb kote tout moun fè konfyans.
                    
                    5. Vizyon : Vin pi gwo mache sou entènèt pou vann tout kalite bèl bagay ki fèt an Ayiti, ni nan peyi a ni pou dyaspora a.
                    
                    6. Pwoblèm li rezoud : Moun nan mitan k ap koupe pri sou do kiltivatè yo, manje k ap pouri nan jaden ak atizan nan pwovens ki pa ka jwenn kliyan.
                    
                    7. Solisyon li pote : Mache dijital kote chak machann gen pwòp ti boutik pa l, li mete foto machandiz li, li resevwa kòb li fasil epi kòmand lan livre byen.
                    
                    8. Moun li vize : Kiltivatè, kowoperativ, kouti ak atizan, boutik ak tout sitwayen k ap chèche bon bagay lokal pou achte.
                    
                    9. Fonksyonalite prensipal yo :
                    - Chak machann gen ti boutik pa l sou sit la ;
                    - Lis machandiz ak bèl foto, pri ak kantite ki rete nan depo ;
                    - Resevwa peman fasil epi an sekirite gras ak AJ-Pay ;
                    - Swiv kote kòmand lan ye epi resevwa mesaj sou telefòn lè l ap rive.
                    
                    10. Arkitekti teknik : Sitwèb ak aplikasyon mobil rapid, motè rechèch ki jwenn nenpòt bagay fasil epi koneksyon ak sèvis livrezon.
                    
                    11. Teknoloji yo prevwa itilize : Kotlin Multiplatform, Next.js / Compose Web, PostgreSQL, Meilisearch pou rechèch rapid, API transpò.
                    
                    12. Entèlijans atifisyèl : Zouti entèlijan ki montre achtè yo bon pwodui peyi a ki ka enterese yo selon sa yo renmen.
                    
                    13. Sekirite : Kontwole tout machann anvan yo louvri boutik, komantè vrè kliyan ak garanti remèt kòb si machandiz la pa bon.
                    
                    14. Modèl ekonomik : Pou defini (Ti pousantaj sou chak vant ki fèt ak ti piblisite pou moun ki vle mete boutik yo pi devan).
                    
                    15. Entegrasyon ak AJ-TECH : Mache ofisyèl ki itilize sistèm peman (AJ-Pay) ak kat jeyografik (AJ-Maps) ekosistèm nan.
                    
                    16. Relasyon ak lòt antite yo : Konekte ak AJ-Pay pou peman, AJ-Maps pou kalkile wout livrezon, AJ-Studio pou bèl foto pwodui ak AJ-Wallet.
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2026–2027) : Fè plan sou livrezon epi prepare sit la pou kòmanse ak atizay ak rad lokal ;
                    - Mwayen tèm (2028–2030) : Lansman ofisyèl nan zòn Pòtoprens epi pèmèt moun nan dyaspora a achte bay fanmi yo ;
                    - Long tèm (2031–2035) : Mete sèvis pou livre manje fre soti nan jaden nan pwovens pou rive nan vil yo.
                    
                    18. Pèspektiv entènasyonal : Pèmèt atizan ak moun ki fè kafe oswa kakawo an Ayiti vann dirèkteman bay kliyan nan tout mond lan.
                """.trimIndent(),
                plannedStartPage = 195,
                plannedEndPage = 199,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 40 : AJ-MathQuest ====================
            BookChapter(
                id = "ch_3_40",
                chapterNumber = 40,
                partId = "part_3",
                titleFr = "Chapitre 40 — AJ-MathQuest",
                titleHt = "Chapit 40 — AJ-MathQuest",
                subtitleFr = "Apprentissage ludo-éducatif des mathématiques et de la logique",
                subtitleHt = "Aprann matematik ak lojik nan jwèt amizan",
                summaryFr = "Fiche d'ingénierie d'AJ-MathQuest, application gamifiée pour l'apprentissage des sciences et du raisonnement logique.",
                summaryHt = "Fich enjenyri sou AJ-MathQuest, jwèt entèlijan pou ede timoun ak jèn vin fò nan kalkil ak lojik.",
                contentFr = """
                    1. Nom : AJ-MathQuest (Apprentissage Ludo-Éducatif des Mathématiques & Logique).
                    
                    2. Statut actuel officiel : CONCEPT / EN CONCEPTION. Projet d'application pédagogique interactive.
                    
                    3. Origine du concept : Constat des difficultés chroniques et de la désaffection des élèves haïtiens pour les mathématiques, souvent enseignées de façon abstraite et rébarbative.
                    
                    4. Mission : Rendre l'apprentissage des mathématiques, du calcul mental et de la pensée algorithmique passionnant et accessible à tous les enfants haïtiens.
                    
                    5. Vision : Éveiller une vocation scientifique et mathématique chez 1 million d'élèves haïtiens d'ici 2035.
                    
                    6. Problème résolu : Blocages psychologiques face aux maths, taux d'échec élevé aux examens nationaux et manque d'outils d'entraînement interactifs.
                    
                    7. Solution proposée : Une aventure interactive gamifiée (jeux de rôle éducatifs, énigmes, défis multijoueurs locaux) alignée sur le programme scolaire haïtien.
                    
                    8. Public cible : Élèves du fondamental et du secondaire, enseignants de sciences, parents d'élèves et passionnés d'énigmes.
                    
                    9. Fonctionnalités principales :
                    - Parcours d'aventures et quêtes mathématiques progressives (arithmétique, algèbre, géométrie) ;
                    - Mode hors-ligne complet fonctionnant sans connexion Internet ;
                    - Duels et tournois de calcul mental en réseau local (Wi-Fi / Bluetooth) ;
                    - Suivi des progrès et tableaux de bord pour les enseignants et parents.
                    
                    10. Architecture technique : Moteur de jeu 2D léger et interactif développé en Kotlin Multiplatform et Jetpack Compose Canvas, optimisé pour les smartphones d'entrée de gamme.
                    
                    11. Technologies envisagées : Kotlin Multiplatform, Compose Canvas, SQLite local / Room, moteur audio léger, protocole de synchronisation Bluetooth P2P.
                    
                    12. Intelligence artificielle : Génération d'exercices adaptatifs ajustant le niveau de difficulté en fonction du temps de réponse et des erreurs de l'élève.
                    
                    13. Sécurité : Environnement 100% protégé pour les enfants, absence totale de publicités intrusives et respect strict de la vie privée des mineurs.
                    
                    14. Modèle économique : Accès gratuit et universel à tous les niveaux de base, licences scolaires groupées avec outils de suivi pour les établissements privés.
                    
                    15. Intégration avec AJ-TECH : Brique ludo-éducative intégrée à la suite EDUKA et synchronisée avec le compte élève AJ-ID.
                    
                    16. Relations avec les autres entités : Connecté à EDUKA pour le suivi scolaire, AJ-Learn pour les concepts avancés et AJ-Cloud pour la sauvegarde des scores.
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2026–2027) : Conception des univers narratifs et prototypage des premiers modules d'arithmétique fondamentale ;
                    - Moyen terme (2028–2030) : Lancement de l'application mobile et tournois scolaires pilotes dans les écoles de Port-au-Prince et des provinces ;
                    - Long terme (2031–2035) : Intégration officielle comme support pédagogique recommandé dans le système éducatif haïtien.
                    
                    18. Perspectives internationales : Traduction et adaptation culturelle pour les écoles d'autres pays francophones et caribéens.
                """.trimIndent(),
                contentHt = """
                    1. Non : AJ-MathQuest (Aprann Matematik & Lojik nan Jwèt Amizan).
                    
                    2. Estati ofisyèl kounye a : KONSÈP / AN KONSEPSYON. Pwojè aplikasyon jwèt edikatif.
                    
                    3. Orijin konsèp la : Konsta anpil timoun ak jèn an Ayiti pè matematik paske fason yo montre l nan lekòl yo souvan twò difisil epi li pa atiran.
                    
                    4. Misyon : Fè timoun ak jèn ayisyen renmen kalkil, matematik ak lojik gras ak bèl jwèt ki fè yo konprann san fòse.
                    
                    5. Vizyon : Ede 1 milyon elèv ayisyen vin trè fò nan syans ak matematik anvan lane 2035.
                    
                    6. Pwoblèm li rezoud : Pè matematik, anpil elèv ki echwe nan egzamen leta ak mank bon zouti amizan pou fè egzèsis lakay.
                    
                    7. Solisyon li pote : Yon bèl avanti nan jwèt sou telefòn ki gen ti defi, devinèt ak konkou kalkil ki mache menm jan ak pwogram lekòl la.
                    
                    8. Moun li vize : Elèv tout klas, pwofesè matematik, paran ak tout moun ki renmen jwèt lojik.
                    
                    9. Fonksyonalite prensipal yo :
                    - Avanti ak nivo k ap monte piti piti (kalkil rapid, jeyometri, aljèb) ;
                    - Mache san okenn entènèt (Offline-First) sou tout ti telefòn ;
                    - Konkou kalkil fasil ak lòt elèv pa Bluetooth san bezwen entènèt ;
                    - Tablo rapò pou paran ak pwofesè wè kijan timoun nan ap amelyore.
                    
                    10. Arkitekti teknik : Ti motè jwèt 2D ki lejè anpil ki fèt ak Kotlin Multiplatform ak Jetpack Compose Canvas pou l pa janm ralanti sou ti telefòn.
                    
                    11. Teknoloji yo prevwa itilize : Kotlin Multiplatform, Compose Canvas, baz done SQLite / Room, son lejè, kominikasyon Bluetooth P2P.
                    
                    12. Entèlijans atifisyèl : Chwazi egzèsis ki adapte ak nivo elèv la pou l ka konprann sa k te difisil pou li a san l pa dekouraje.
                    
                    13. Sekirite : Espas 100% pwoteje pou timoun, pa gen okenn move piblisite epi lavi prive tout timoun respekte.
                    
                    14. Modèl ekonomik : Nivo debaz yo gratis nèt pou tout timoun, ti lisans pou lekòl prive ki vle zouti espesyal pou pwofesè.
                    
                    15. Entegrasyon ak AJ-TECH : Zouti edikatif ki konekte dirèkteman ak EDUKA ak kont elèv AJ-ID.
                    
                    16. Relasyon ak lòt antite yo : Konekte ak EDUKA pou lekòl yo, AJ-Learn pou aprann plis ak AJ-Cloud pou sere pwen ak nivo jwè a.
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2026–2027) : Ekri istwa jwèt la epi fè premye tès pou kalkil debaz sou ti telefòn ;
                    - Mwayen tèm (2028–2030) : Mete aplikasyon an deyò epi òganize gwo chanpyona kalkil nan lekòl yo ;
                    - Long tèm (2031–2035) : Sèvi kòm zouti ofisyèl nan tout lekòl nan peyi a pou ede timoun yo reyisi nan egzamen leta.
                    
                    18. Pèspektiv entènasyonal : Tradui jwèt la an lòt lang pou lòt timoun nan Karayib la ak Lafrik ka itilize l tou.
                """.trimIndent(),
                plannedStartPage = 200,
                plannedEndPage = 204,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 41 : AJ-Bioklin ====================
            BookChapter(
                id = "ch_3_41",
                chapterNumber = 41,
                partId = "part_3",
                titleFr = "Chapitre 41 — AJ-Bioklin",
                titleHt = "Chapit 41 — AJ-Bioklin",
                subtitleFr = "Dossier médical numérique et gestion clinique",
                subtitleHt = "Dosye medikal dijital ak jesyon lopital",
                summaryFr = "Fiche d'ingénierie d'AJ-Bioklin, projet de dossier médical partagé et de gestion hospitalière sécurisée.",
                summaryHt = "Fich enjenyri sou AJ-Bioklin, pwojè dosye sante dijital pou lopital ak pasyan an Ayiti.",
                contentFr = """
                    1. Nom : AJ-Bioklin (Dossier Médical Numérique & Gestion Clinique).
                    
                    2. Statut actuel officiel : PLANIFIÉ / EN ÉTUDE TECHNIQUE ET BIOÉTHIQUE. Projet de santé numérique sous réserve de conformité médicale.
                    
                    3. Origine du concept : Constat de la perte fréquente des dossiers médicaux papier lors des transferts de patients entre cliniques et hôpitaux, entraînant erreurs de diagnostic et retards de soins critiques.
                    
                    4. Mission : Sauvegarder et unifier les données de santé des patients haïtiens pour améliorer la qualité et la continuité des soins.
                    
                    5. Vision : Bâtir le réseau numérique de santé le plus sûr et le plus accessible d'Haïti.
                    
                    6. Problème résolu : Perte d'antécédents médicaux, allergies non signalées, ordonnances manuscrites illisibles et gestion chaotique des stocks de médicaments.
                    
                    7. Solution proposée : Système informatisé de gestion clinique avec carnet de santé numérique individuel sécurisé, accessible par carte QR médicale d'urgence.
                    
                    8. Public cible : Hôpitaux, centres de santé communautaires, cliniques privées, médecins, infirmiers, pharmaciens et patients.
                    
                    9. Fonctionnalités principales :
                    - Dossier médical partagé avec historique des consultations, diagnostics et allergies ;
                    - Fiche d'urgence accessible par scan d'un QR code sécurisé (groupe sanguin, allergies graves) ;
                    - Gestion des consultations, lits d'hospitalisation et stocks de médicaments ;
                    - Module de prescription électronique claire évitant les erreurs de dosage.
                    
                    10. Architecture technique : Architecture décentralisée haute sécurité, bases de données chiffrées conformes aux normes de santé internationales (HL7 / FHIR).
                    
                    11. Technologies envisagées : Kotlin backend, PostgreSQL chiffré, standard FHIR pour l'interopérabilité des données de santé, protocoles cryptographiques Zero-Knowledge.
                    
                    12. Intelligence artificielle : Système d'alerte automatisé pour détecter les interactions médicamenteuses dangereuses et aide à l'orientation diagnostique précoce.
                    
                    13. Sécurité : Chiffrement de niveau bancaire et médical, consentement explicite du patient pour l'accès aux données, traçabilité absolue des consultations de dossiers.
                    
                    14. Modèle économique : À définir (Licences logicielles adaptées pour les cliniques et hôpitaux privés, carnet d'urgence de base gratuit pour chaque citoyen).
                    
                    15. Intégration avec AJ-TECH : Utilisation de l'identité sécurisée AJ-ID et hébergement des données médicales hautement protégées sur AJ-Cloud.
                    
                    16. Relations avec les autres entités : Connecté à AJ-Cloud pour le stockage sécurisé, AJ-Assistant pour les rappels de prise de médicaments et AJ-Fitness.
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2026–2027) : Élaboration des protocoles éthiques et techniques de protection des données de santé avec des professionnels médicaux locaux ;
                    - Moyen terme (2028–2030) : Déploiement pilote dans 3 centres de santé partenaires et test de la carte QR d'urgence ;
                    - Long terme (2031–2035) : Interconnexion avec les principaux hôpitaux universitaires et départements sanitaires du pays.
                    
                    18. Perspectives internationales : Alignement sur les standards mondiaux de l'Organisation Mondiale de la Santé (OMS) en matière de santé numérique.
                """.trimIndent(),
                contentHt = """
                    1. Non : AJ-Bioklin (Dosye Medikal Dijital & Jesyon Lopital).
                    
                    2. Estati ofisyèl kounye a : PLANIFYE / SOU ETID TEKNIK AK ETIK SANTE. Pwojè sante dijital ki bezwen tout otorizasyon medikal anvan li deplwaye.
                    
                    3. Orijin konsèp la : Konsta jan kanè papye lopital pèdi fasil lè yon moun chanje klinik, sa ki lakòz doktè pa konnen tout maladi oswa medikaman pasyan an pa ka pran.
                    
                    4. Misyon : Sere tout enfòmasyon sou sante pasyan yo an sekirite pou doktè ka ba yo pi bon swen pi vit.
                    
                    5. Vizyon : Bati pi bon rezo dijital pou lopital ak pasyan ki pi an sekirite an Ayiti.
                    
                    6. Pwoblèm li rezoud : Pèdi dosye malad, pa konnen si malad la gen alèji ak yon medikaman, lèt doktè moun pa ka li ak vòl oswa gaspiyaj medikaman.
                    
                    7. Solisyon li pote : Sistèm enfòmatik pou lopital ak yon kanè sante sou telefòn ki gen yon kòd QR sekou pou ka ijans.
                    
                    8. Moun li vize : Lopital, sant sante nan komin yo, klinik prive, doktè, enfimyè, famasi ak tout malad.
                    
                    9. Fonksyonalite prensipal yo :
                    - Dosye sante elektwonik ki kenbe tout istwa konsiltasyon ak tès laboratwa ;
                    - Kat QR sekou ki bay gwoup san ak alèji grav touswit si yon moun ta fè aksidan ;
                    - Jesyon kabann lopital, randevou ak medikaman ki nan famasi lopital la ;
                    - Preskripsyon medikaman klè sou òdinatè pou famasyen pa fè erè sou dòz.
                    
                    10. Arkitekti teknik : Sistèm trè sekirize ki respekte gwo estanda entènasyonal sou zafè sante (estanda FHIR) ak baz done chifre.
                    
                    11. Teknoloji yo prevwa itilize : Kotlin backend, PostgreSQL chifre, estanda sante FHIR, pwotokòl sekirite Zero-Knowledge.
                    
                    12. Entèlijans atifisyèl : Sistèm alèt otomatik ki avèti doktè a si de medikaman li ekri ka fè reyaksyon danjere ansanm.
                    
                    13. Sekirite : Gwo nivo chifreman medikal, pasyan an dwe bay otorizasyon anvan doktè gade dosye l, epi yo konnen kiyès ki te ouvri dosye a.
                    
                    14. Modèl ekonomik : Pou defini (Ti abònman pou klinik ak lopital prive, kanè sekou gratis pou tout sitwayen).
                    
                    15. Entegrasyon ak AJ-TECH : Pasyan yo konekte ak AJ-ID epi tout done yo sere anba gwo sekirite sou AJ-Cloud.
                    
                    16. Relasyon ak lòt antite yo : Konekte ak AJ-Cloud pou depo done sante, AJ-Assistant pou sonje bwè medikaman ak AJ-Fitness.
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2026–2027) : Prepare tout règ sou sekirite done sante ansanm ak doktè ayisyen epi fè plan teknik lojisyèl la ;
                    - Mwayen tèm (2028–2030) : Premye tès pilòt nan 3 sant sante epi teste kat QR sekou a ;
                    - Long tèm (2031–2035) : Itilize sistèm nan nan gwo lopital ak tout rezo sante nan peyi a.
                    
                    18. Pèspektiv entènasyonal : Respekte tout prensip Òganizasyon Mondyal Lasante (OMS) sou zafè sante dijital.
                """.trimIndent(),
                plannedStartPage = 205,
                plannedEndPage = 209,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 42 : AJ-Fitness ====================
            BookChapter(
                id = "ch_3_42",
                chapterNumber = 42,
                partId = "part_3",
                titleFr = "Chapitre 42 — AJ-Fitness",
                titleHt = "Chapit 42 — AJ-Fitness",
                subtitleFr = "Bien-être, activité physique et nutrition équilibrée",
                subtitleHt = "Byenèt, aktivite fizik ak bon manje pou lasante",
                summaryFr = "Fiche d'ingénierie d'AJ-Fitness, application de santé préventive, remise en forme et nutrition adaptée aux produits locaux.",
                summaryHt = "Fich enjenyri sou AJ-Fitness, aplikasyon pou fè egzèsis ak manje byen ak pwodui lokal nou yo.",
                contentFr = """
                    1. Nom : AJ-Fitness (Bien-Être, Activité Physique & Nutrition Équilibrée).
                    
                    2. Statut actuel officiel : CONCEPT / EN CONCEPTION. Projet d'application mobile de santé préventive.
                    
                    3. Origine du concept : Constat de la montée des maladies chroniques évitables (hypertension, diabète, surpoids) en Haïti et du manque de conseils nutritionnels adaptés à l'alimentation locale.
                    
                    4. Mission : Promouvoir un mode de vie sain, actif et équilibré grâce à des programmes de remise en forme simples et une valorisation des aliments traditionnels sains.
                    
                    5. Vision : Aider 500 000 Haïtiens à adopter des habitudes de vie préventives et durables d'ici 2035.
                    
                    6. Problème résolu : Conseils de santé inadaptés ignorant les denrées locales (igname, manioc, moringa, fruits tropicaux) et coût élevé des abonnements en salle de sport.
                    
                    7. Solution proposée : Application mobile proposant des entraînements physiques guidés sans matériel, un suivi des pas et un guide nutritionnel basé sur les produits des marchés haïtiens.
                    
                    8. Public cible : Grand public, jeunes adultes, sportifs amateurs, personnes souffrant de maladies métaboliques et seniors.
                    
                    9. Fonctionnalités principales :
                    - Programmes d'exercices physiques guidés au poids du corps (vidéos légères et illustrations) ;
                    - Podomètre et suivi de l'activité quotidienne fonctionnant hors-ligne ;
                    - Guide nutritionnel valorisant les aliments locaux sains et recettes équilibrées ;
                    - Défis communautaires et suivi des progrès de santé.
                    
                    10. Architecture technique : Application mobile native optimisée pour l'autonomie de batterie, utilisant les capteurs de mouvements intégrés (podomètre matériel).
                    
                    11. Technologies envisagées : Kotlin Multiplatform / Jetpack Compose, CoreMotion / Android Sensor API, SQLite local.
                    
                    12. Intelligence artificielle : Recommandations personnalisées de programmes d'entraînement en fonction de l'âge, de l'indice de masse corporelle (IMC) et des objectifs de l'utilisateur.
                    
                    13. Sécurité : Confidentialité absolue des données biométriques personnelles, stockées localement sur le smartphone de l'utilisateur.
                    
                    14. Modèle économique : Version de base 100% gratuite, programmes personnalisés avancés et suivi par des coachs certifiés disponibles en formule premium.
                    
                    15. Intégration avec AJ-TECH : Synchronisation facultative avec le dossier médical préventif AJ-Bioklin et le profil citoyen AJ-ID.
                    
                    16. Relations avec les autres entités : Connecté à AJ-Bioklin pour la prévention de santé, AJ-Commerce pour les produits bio locaux et AJ-Assistant.
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2026–2027) : Recherche nutritionnelle sur les aliments locaux et conception des premiers modules d'exercices à domicile ;
                    - Moyen terme (2028–2030) : Lancement de l'application mobile grand public et organisation de défis sportifs communautaires ;
                    - Long terme (2031–2035) : Partenariats avec le ministère de la Santé et les universités pour des programmes de prévention santé nationaux.
                    
                    18. Perspectives internationales : Diffusion auprès de la diaspora caribéenne à la recherche de programmes de remise en forme culturellement familiers.
                """.trimIndent(),
                contentHt = """
                    1. Non : AJ-Fitness (Byenèt, Aktivite Fizik & Bon Manje pou Lasante).
                    
                    2. Estati ofisyèl kounye a : KONSÈP / AN KONSEPSYON. Pwojè aplikasyon sante ak espò pou telefòn.
                    
                    3. Orijin konsèp la : Konsta anpil moun ap soufri ak tansyon, dyabèt ak twòp pwa an Ayiti, epi konsèy sou entènèt yo pa janm pale de bon manje lokal nou yo.
                    
                    4. Misyon : Ede tout moun viv an sante, fè ti mouvman chak jou epi byen manje ak sa nou plante nan peyi a.
                    
                    5. Vizyon : Ede 500 000 Ayisyen pran bon abitid pou pwoteje sante yo anvan lane 2035.
                    
                    6. Pwoblèm li rezoud : Konsèy manje etranje ki pa konnen mayi, yanm, manyòk, lalo ak fèy moringa, epi jimnastik ki twò chè.
                    
                    7. Solisyon li pote : Aplikasyon telefòn ki bay ti egzèsis fasil ou ka fè lakay san okenn zouti, ki konte pa ou fè nan jounen an epi ki bay bon konsèy manje lokal.
                    
                    8. Moun li vize : Tout popilasyon an, jèn, moun ki vle pèdi pwa, moun k ap veye tansyon yo ak granmoun.
                    
                    9. Fonksyonalite prensipal yo :
                    - Ti videyo ak desen pou fè egzèsis lakay ak pwa kò w ;
                    - Konte konbyen pa ou fè chak jou menm lè pa gen entènèt ;
                    - Gid manje ki montre kijan pou manje ekilibre ak bon viv peyi a ;
                    - Ti defi amizan pou motive moun mache ak fè espò ansanm.
                    
                    10. Arkitekti teknik : Aplikasyon mobil ki pa manje batri telefòn epi ki sèvi ak ti detektè mouvman ki nan telefòn lan.
                    
                    11. Teknoloji yo prevwa itilize : Kotlin Multiplatform / Jetpack Compose, Sensor API Android / CoreMotion, baz done lokal SQLite.
                    
                    12. Entèlijans atifisyèl : Konsèy espò ki adapte ak laj, pwa ak sa chak moun vle reyalize pou kò yo.
                    
                    13. Sekirite : Tout enfòmasyon sou pwa ak sante moun nan rete sere sou telefòn pa l sèlman.
                    
                    14. Modèl ekonomik : Pati debaz gratis pou tout moun, ti fòmil primyòm pou moun ki vle antrenè pèsonèl swiv yo.
                    
                    15. Entegrasyon ak AJ-TECH : Posiblite pou konekte ak AJ-Bioklin pou veye sante epi itilize kont AJ-ID.
                    
                    16. Relasyon ak lòt antite yo : Konekte ak AJ-Bioklin pou prevansyon maladi, AJ-Commerce pou jwenn bon manje lokal ak AJ-Assistant.
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2026–2027) : Fè etid sou valè nitrisyon manje lokal yo epi prepare premye seri ti egzèsis ;
                    - Mwayen tèm (2028–2030) : Mete aplikasyon an deyò pou tout moun epi fè gwo mouvman mach pou lasante ;
                    - Long tèm (2031–2035) : Travay ak ministè sante pou ede popilasyon an evite maladi kè ak dyabèt.
                    
                    18. Pèspektiv entènasyonal : Ede moun nan dyaspora a jwenn bon konsèy sante ki pale de manje kilti pa nou.
                """.trimIndent(),
                plannedStartPage = 210,
                plannedEndPage = 214,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 43 : AJ-Assistant ====================
            BookChapter(
                id = "ch_3_43",
                chapterNumber = 43,
                partId = "part_3",
                titleFr = "Chapitre 43 — AJ-Assistant",
                titleHt = "Chapit 43 — AJ-Assistant",
                subtitleFr = "Intelligence artificielle conversationnelle bilingue et souveraine",
                subtitleHt = "Entèlijans atifisyèl konvèsasyonèl bileng ak souveren",
                summaryFr = "Fiche d'ingénierie d'AJ-Assistant, modèle d'intelligence artificielle contextuel bilingue (Créole / Français).",
                summaryHt = "Fich enjenyri sou AJ-Assistant, asistan entèlijan ki konprann epi pale ni Kreyòl ni Fransè natirèlman.",
                contentFr = """
                    1. Nom : AJ-Assistant (Intelligence Artificielle Conversationnelle Bilingue & Souveraine).
                    
                    2. Statut actuel officiel : CONCEPT / EN RECHERCHE APPLIQUÉE. Projet de recherche en traitement du langage naturel (NLP).
                    
                    3. Origine du concept : Constat de la faible compréhension du Créole haïtien et du contexte socioculturel par les grands modèles de langage internationaux (ChatGPT, Gemini, Claude).
                    
                    4. Mission : Fournir à chaque citoyen et professionnel haïtien une assistance intelligente qui comprend parfaitement sa langue, sa culture et ses besoins quotidiens.
                    
                    5. Vision : Bâtir le premier grand modèle de fondation linguistique et contextuel haïtien.
                    
                    6. Problème résolu : Barrière linguistique pour les créolophones unilingues, hallucinations culturelles des IAs étrangères et absence d'expertise sur le droit et l'histoire haïtienne.
                    
                    7. Solution proposée : Assistant conversationnel bilingue (Créole / Français) entraîné sur des corpus textuels et oraux authentiques, capable de répondre à la voix ou par texte.
                    
                    8. Public cible : Citoyens, étudiants, professionnels, agriculteurs, administrations et développeurs de l'écosystème.
                    
                    9. Fonctionnalités principales :
                    - Compréhension et génération de texte fluides en Créole haïtien et en Français ;
                    - Reconnaissance vocale (Speech-to-Text) et synthèse vocale (Text-to-Speech) en Créole ;
                    - Aide aux démarches administratives, explications juridiques et soutien éducatif ;
                    - Intégration transversale dans toutes les applications de la suite AJ-TECH.
                    
                    10. Architecture technique : Modèle de langage (LLM) compact optimisé pour l'inférence locale ou sur serveurs souverains AJ-Cloud, complété par une architecture RAG (Retrieval-Augmented Generation).
                    
                    11. Technologies envisagées : Python / PyTorch pour l'entraînement, Transformers, ONNX Runtime pour l'inférence optimisée, Kotlin Multiplatform SDK.
                    
                    12. Intelligence artificielle : Modèle linguistique contextuel affiné (fine-tuning) sur des données historiques, juridiques, scientifiques et culturelles haïtiennes.
                    
                    13. Sécurité : Alignement éthique strict, respect de la confidentialité des conversations des utilisateurs et absence de réutilisation des données privées pour l'entraînement.
                    
                    14. Modèle économique : Version standard gratuite pour le grand public, API facturée à l'usage pour les développeurs et entreprises intégrant l'assistant.
                    
                    15. Intégration avec AJ-TECH : Cerveau transversal et interface vocale universelle pour l'ensemble des 20 autres entités de l'écosystème.
                    
                    16. Relations avec les autres entités : Connecté à AJ-Task (gestion vocale de tâches), EDUKA (tuteur scolaire), AJ-Bioklin (orientation santé) et AJ-Maps.
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2026–2027) : Constitution du corpus linguistique bilingue annoté et premiers modèles de synthèse vocale créole ;
                    - Moyen terme (2028–2030) : Lancement de l'assistant bilingue intégré aux entités AJ-Task et EDUKA ;
                    - Long terme (2031–2035) : Modèle de fondation complet multimodal (voix, texte, vision) souverain hébergé sur AJ-Cloud.
                    
                    18. Perspectives internationales : Coopération avec les laboratoires de linguistique computationnelle de la Caraïbe et préservation numérique du patrimoine créole mondial.
                """.trimIndent(),
                contentHt = """
                    1. Non : AJ-Assistant (Entèlijans Atifisyèl Konvèsasyonèl Bileng & Souveren).
                    
                    2. Estati ofisyèl kounye a : KONSÈP / AN RECHÈCH APLIKE. Pwojè rechèch sou langaj ak entèlijans atifisyèl.
                    
                    3. Orijin konsèp la : Konsta gwo modèl entènasyonal yo (ChatGPT, Claude) pa konprann Kreyòl ayisyen an byen epi yo pa konnen reyalite, kilti ak lwa peyi nou an.
                    
                    4. Misyon : Bay chak sitwayen ak chak pwofesyonèl ayisyen yon asistan entèlijan ki konprann lang li, kilti l ak tout sa l bezwen chak jou.
                    
                    5. Vizyon : Kreye premye gwo modèl entèlijans atifisyèl ki fèt espesyalman pou Ayiti ak lang Kreyòl la.
                    
                    6. Pwoblèm li rezoud : Moun ki pale Kreyòl sèlman ki pa ka sèvi ak zouti modèn, move repons sou istwa ak lwa peyi a epi mank vwa Kreyòl sou entènèt.
                    
                    7. Solisyon li pote : Asistan entèlijan ki pale epi konprann ni Kreyòl ni Fransè trè byen, ki ka tande vwa w epi reponn ou ak bèl vwa Kreyòl natirèl.
                    
                    8. Moun li vize : Tout sitwayen, elèv ak etidyan, travayè biwo, kiltivatè ak devlopè aplikasyon.
                    
                    9. Fonksyonalite prensipal yo :
                    - Pale ak ekri an Kreyòl ayisyen ak Fransè san fot sans ;
                    - Tande sa w di nan mikwo epi pale repons lan ak vwa Kreyòl ;
                    - Ede w konprann papye leta, lwa peyi a epi ede elèv fè devwa yo ;
                    - Travay andedan tout lòt aplikasyon nan ekosistèm AJ-TECH la.
                    
                    10. Arkitekti teknik : Modèl langaj (LLM) ki lejè ki ka travay sou sèvè souveren AJ-Cloud oswa dirèkteman sou gwo telefòn, konbine ak zouti rechèch RAG.
                    
                    11. Teknoloji yo prevwa itilize : Python / PyTorch, Transformers, ONNX Runtime pou l kouri vit, SDK Kotlin Multiplatform.
                    
                    12. Entèlijans atifisyèl : Modèl ki fòme ak liv istwa, lwa, syans ak tout kilti ayisyen pou l bay bon repons egzat.
                    
                    13. Sekirite : Respè total lavi prive, pa janm vann oswa itilize sa w pale ak asistan an pou lòt bagay san konsantman w.
                    
                    14. Modèl ekonomik : Gratis pou tout moun senp, API peye pou gwo biznis ki vle mete asistan an sou sitwèb pa yo.
                    
                    15. Entegrasyon ak AJ-TECH : Sèvi kòm sèvo santral ak gid vwa pou tout 20 lòt pwojè nan ekosistèm nan.
                    
                    16. Relasyon ak lòt antite yo : Konekte ak AJ-Task (ajoute travay ak vwa), EDUKA (ede elèv etidye), AJ-Bioklin ak AJ-Maps.
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2026–2027) : Rasanble tèks ak vwa Kreyòl pou fòme premye ti modèl vwa ak tèks yo ;
                    - Mwayen tèm (2028–2030) : Mete asistan an andedan AJ-Task ak EDUKA pou moun kòmanse sèvi avè l ;
                    - Long tèm (2031–2035) : Gwo modèl konplè ki konprann vwa, foto ak tèks k ap kouri sou sèvè AJ-Cloud.
                    
                    18. Pèspektiv entènasyonal : Travay ak lòt inivèsite nan Karayib la pou pwoteje ak devlope lang Kreyòl la nan lemonn dijital.
                """.trimIndent(),
                plannedStartPage = 215,
                plannedEndPage = 219,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 44 : EDUKA ====================
            BookChapter(
                id = "ch_3_44",
                chapterNumber = 44,
                partId = "part_3",
                titleFr = "Chapitre 44 — EDUKA",
                titleHt = "Chapit 44 — EDUKA",
                subtitleFr = "Système intégré de gestion scolaire et pédagogie numérique",
                subtitleHt = "Sistèm entegre pou jesyon lekòl ak liv dijital",
                summaryFr = "Fiche d'ingénierie d'EDUKA, système de gestion scolaire et d'accès aux manuels scolaires numériques.",
                summaryHt = "Fich enjenyri sou EDUKA, platfòm pou jere lekòl, nòt elèv, kanè ak liv dijital.",
                contentFr = """
                    1. Nom : EDUKA (Système Intégré de Gestion Scolaire & Pédagogie Numérique).
                    
                    2. Statut actuel officiel : CONCEPT / EN CONCEPTION. Projet de transformation numérique du système éducatif.
                    
                    3. Origine du concept : Constat du coût écrasant des manuels scolaires physiques pour les familles haïtiennes et de la gestion administrative manuelle et vulnérable des écoles (registres papier, pertes de notes).
                    
                    4. Mission : Moderniser la gestion des établissements scolaires et démocratiser l'accès aux manuels et contenus pédagogiques de qualité pour chaque élève.
                    
                    5. Vision : Équiper 3 000 écoles fondamentales et secondaires en Haïti d'un système de gestion numérique d'ici 2035.
                    
                    6. Problème résolu : Poids financier des livres scolaires, falsification de bulletins, retards dans les communications parents-écoles et lourdeur administrative.
                    
                    7. Solution proposée : Plateforme scolaire unifiée intégrant gestion des inscriptions, relevés de notes, bulletins numérisés, bibliothèque de manuels scolaires interactifs et communication par SMS.
                    
                    8. Public cible : Directeurs d'établissements, enseignants, parents d'élèves, élèves du fondamental et secondaire, ministère de l'Éducation nationale (MENFP).
                    
                    9. Fonctionnalités principales :
                    - Gestion des inscriptions, présences et bulletins de notes sécurisés ;
                    - Bibliothèque numérique de manuels scolaires accessibles hors-ligne ;
                    - Envoi automatique des notes et alertes d'absences aux parents par SMS ;
                    - Emplois du temps interactifs et suivi des paiements de scolarité via AJ-Pay.
                    
                    10. Architecture technique : Application web et mobile avec stockage local hors-ligne (IndexedDB / SQLite), synchronisation automatique et portail d'administration sécurisé.
                    
                    11. Technologies envisagées : Kotlin Multiplatform, Jetpack Compose, PostgreSQL, PWA pour les enseignants, passerelle SMS locale.
                    
                    12. Intelligence artificielle : Suivi prédictif du risque de décrochage scolaire et génération automatisée d'exercices de révision personnalisés.
                    
                    13. Sécurité : Protection stricte des données personnelles des mineurs, archivage chiffré des relevés de notes et bulletins infalsifiables avec QR Code de vérification.
                    
                    14. Modèle économique : Abonnements modulaires très abordables pour les établissements scolaires, accès gratuit pour les parents et élèves.
                    
                    15. Intégration avec AJ-TECH : Utilisation de l'identité unique AJ-ID et synchronisation avec les modules pédagogiques d'AJ-Learn et AJ-MathQuest.
                    
                    16. Relations avec les autres entités : Connecté à AJ-Learn pour les formations, AJ-MathQuest pour les exercices de calcul, AJ-Pay pour les frais scolaires et AJ-Cloud.
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2026–2027) : Développement du module de gestion des notes et bulletins et numérisation des premiers manuels scolaires libres ;
                    - Moyen terme (2028–2030) : Déploiement pilote dans 50 écoles partenaires et intégration du paiement des frais de scolarité via AJ-Pay ;
                    - Long terme (2031–2035) : Généralisation nationale et interconnexion avec les registres officiels d'examens d'État.
                    
                    18. Perspectives internationales : Adaptation du modèle aux systèmes éducatifs d'autres pays francophones et caribéens partageant des défis similaires.
                """.trimIndent(),
                contentHt = """
                    1. Non : EDUKA (Sistèm Entegre pou Jesyon Lekòl & Liv Dijital).
                    
                    2. Estati ofisyèl kounye a : KONSÈP / AN KONSEPSYON. Pwojè pou modènize jan lekòl fonksyone nan peyi a.
                    
                    3. Orijin konsèp la : Konsta liv lekòl papye koute twò chè pou paran yo chak ane epi fason lekòl yo ap ekri nòt nan vye kanè papye ki ka pèdi oswa chanje fasil.
                    
                    4. Misyon : Fè jesyon lekòl yo vin modèn, fasil epi pèmèt chak elèv jwenn bon liv ak leson sou tablèt oswa telefòn san gwo depans.
                    
                    5. Vizyon : Ede 3 000 lekòl primè ak segondè an Ayiti gen bon sistèm dijital anvan lane 2035.
                    
                    6. Pwoblèm li rezoud : Gwo depans pou achte liv chak ane, fo kanè nòt, paran ki pa konnen si timoun nan ale lekòl ak gwo fatig nan prepare bilten alamen.
                    
                    7. Solisyon li pote : Yon sèl gwo platfòm pou enskri elèv, kalkile nòt, fè bèl bilten sekirize, bay liv dijital ki ka li san entènèt epi voye mesaj bay paran.
                    
                    8. Moun li vize : Direktè lekòl, pwofesè, paran, elèv ak Ministè Edikasyon Nasyonal (MENFP).
                    
                    9. Fonksyonalite prensipal yo :
                    - Jesyon prezans, nòt ak fè bilten otomatik ki pa ka falsifye ;
                    - Bibliyotèk liv lekòl dijital ki mache menm san entènèt ;
                    - Voye nòt ak mesaj si timoun nan pa vin lekòl dirèkteman sou telefòn paran an pa SMS ;
                    - Orè klas ak peye frè lekòl fasil gras ak AJ-Pay.
                    
                    10. Arkitekti teknik : Sitwèb ak aplikasyon mobil ki ka travay san entènèt epi ki voye tout done yo sou sèvè kou entènèt retounen.
                    
                    11. Teknoloji yo prevwa itilize : Kotlin Multiplatform, Jetpack Compose, PostgreSQL, PWA pou pwofesè, sèvis SMS lokal.
                    
                    12. Entèlijans atifisyèl : Avèti pwofesè yo si yon elèv kòmanse gen move nòt pou yo ka ede l anvan l twò ta, epi bay egzèsis pou ede l konprann.
                    
                    13. Sekirite : Pwoteje tout enfòmasyon sou timoun yo, kanè nòt ki gen kòd QR pou verifye si se yon vrè bilten.
                    
                    14. Modèl ekonomik : Ti frè ki tou piti pou chak lekòl ki sèvi ak sistèm nan, gratis pou tout paran ak elèv.
                    
                    15. Entegrasyon ak AJ-TECH : Elèv ak pwofesè konekte ak AJ-ID epi itilize zouti AJ-Learn ak AJ-MathQuest.
                    
                    16. Relasyon ak lòt antite yo : Konekte ak AJ-Learn pou leson avanse, AJ-MathQuest pou kalkil, AJ-Pay pou peye lekòl ak AJ-Cloud.
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2026–2027) : Fini sistèm pou kalkile nòt ak fè bilten epi mete premye liv lekòl dijital yo ;
                    - Mwayen tèm (2028–2030) : Kòmanse nan 50 premye lekòl epi mete peman frè lekòl pa AJ-Pay ;
                    - Long tèm (2031–2035) : Gaye nan tout peyi a epi konekte ak egzamen leta ofisyèl yo.
                    
                    18. Pèspektiv entènasyonal : Pataje modèl sa a ak lòt peyi nan Karayib la ak Lafrik ki gen menm defi nan lekòl yo.
                """.trimIndent(),
                plannedStartPage = 220,
                plannedEndPage = 224,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 45 : EDH ====================
            BookChapter(
                id = "ch_3_45",
                chapterNumber = 45,
                partId = "part_3",
                titleFr = "Chapitre 45 — EDH",
                titleHt = "Chapit 45 — EDH",
                subtitleFr = "École de Développement d'Haïti et académie de leadership technologique",
                subtitleHt = "Lekòl Devlopman Ayiti ak akademi lidèchip teknolojik",
                summaryFr = "Fiche d'ingénierie d'EDH, académie d'excellence formant les futurs leaders et ingénieurs de l'écosystème.",
                summaryHt = "Fich enjenyri sou EDH, gwo lekòl ekselans pou fòme enjenyè ak gwo lidè teknoloji an Ayiti.",
                contentFr = """
                    1. Nom : EDH (École de Développement d'Haïti & Académie de Leadership Technologique).
                    
                    2. Statut actuel officiel : CONCEPT / EN CONCEPTION ACADÉMIQUE. Projet d'institution de formation d'élite et de recherche technologique.
                    
                    3. Origine du concept : Constat du besoin impérieux de former sur place des ingénieurs d'élite, des architectes logiciels et des bâtisseurs de systèmes capables de porter la souveraineté technologique haïtienne sur le long terme.
                    
                    4. Mission : Forger la nouvelle génération de leaders techniques, d'innovateurs et d'architectes numériques d'Haïti par une pédagogie d'excellence pratique et exigeante.
                    
                    5. Vision : Établir la première grande école d'ingénierie logicielle et de leadership technologique de classe mondiale en Haïti.
                    
                    6. Problème résolu : Fuite massive des cerveaux, dépendance envers l'expertise étrangère et manque de formation de très haut niveau aux architectures distribuées et à la cybersécurité.
                    
                    7. Solution proposée : Cursus intensif d'immersion pratique (bootcamps avancés, projets réels au sein des entités AJ-TECH, mentorat international par la diaspora).
                    
                    8. Public cible : Meilleurs talents en programmation, étudiants brillants, ingénieurs en reconversion et chercheurs en informatique.
                    
                    9. Fonctionnalités principales :
                    - Cursus intensifs en architecture logicielle, systèmes distribués, IA et cybersécurité ;
                    - Projets pratiques obligatoires au cœur des entités opérationnelles de l'écosystème AJ-TECH ;
                    - Programme de mentorat direct avec des experts haïtiens et internationaux de haut niveau ;
                    - Laboratoire de recherche appliquée sur les technologies résilientes en contexte difficile.
                    
                    10. Architecture technique : Plateforme d'apprentissage immersif et de gestion de laboratoires virtuels distribués sur infrastructure souveraine AJ-Cloud.
                    
                    11. Technologies envisagées : Linux Kernel, Rust, Kotlin Multiplatform, Kubernetes, C / C++, environnements de virtualisation et de conteneurisation avancés.
                    
                    12. Intelligence artificielle : Laboratoire d'IA avancée pour la recherche sur les modèles de langage créolophones et les systèmes prédictifs d'optimisation énergétique.
                    
                    13. Sécurité : Laboratoires isolés d'entraînement à la cybersécurité (Red Team / Blue Team) et pratiques strictes de sécurité dès la conception (Security by Design).
                    
                    14. Modèle économique : Financement hybride (Bourses d'excellence, partenariats avec les entreprises technologiques, mécénat de la diaspora et contrats d'apprentissage).
                    
                    15. Intégration avec AJ-TECH : Bras académique et laboratoire de recherche fournissant les futurs directeurs techniques et ingénieurs en chef de l'écosystème.
                    
                    16. Relations avec les autres entités : Connecté à AJ-Learn pour la passerelle de sélection, AJ-Dev pour les outils et à l'ensemble des entités pour les projets d'application.
                    
                    17. Feuille de route 2026–2035 :
                    - Court terme (2026–2027) : Élaboration des programmes pédagogiques d'excellence avec des experts universitaires et de la diaspora ;
                    - Moyen terme (2028–2030) : Première promotion pilote de 50 étudiants boursiers en immersion complète ;
                    - Long terme (2031–2035) : Campus technologique physique autonome et reconnaissance internationale des diplômes délivrés.
                    
                    18. Perspectives internationales : Alliances académiques avec les plus prestigieuses universités technologiques caribéennes, nord-américaines et européennes.
                """.trimIndent(),
                contentHt = """
                    1. Non : EDH (Lekòl Devlopman Ayiti & Akademi Lidèchip Teknolojik).
                    
                    2. Estati ofisyèl kounye a : KONSÈP / AN KONSEPSYON AKADEMIK. Pwojè gwo lekòl pou fòme gwo enjenyè ak lidè teknoloji.
                    
                    3. Orijin konsèp la : Konsta nou bezwen fòme bonjan gwo enjenyè, chèf pwojè ak achitèk lojisyèl sou plas an Ayiti pou bati otonomi nimerik peyi a pou tout tan.
                    
                    4. Misyon : Fòme yon nouvo jenerasyon gwo lidè teknik, enjenyè ak moun k ap kreye nouvo teknoloji an Ayiti gras ak yon fòmasyon pratik ki gen gwo nivo.
                    
                    5. Vizyon : Mete sou pye premye gwo lekòl jeni lojisyèl ak lidèchip teknolojik ki gen menm nivo ak pi bon lekòl nan mond lan an Ayiti.
                    
                    6. Pwoblèm li rezoud : Tout gwo tèt k ap kouri kite peyi a, depann tout tan sou ekspè etranje ak mank fòmasyon gwo nivo sou sekirite enfòmatik ak gwo sistèm sèvè.
                    
                    7. Solisyon li pote : Gwo pwogram fòmasyon entansif kote etidyan yo travay dirèkteman sou vrè pwojè AJ-TECH, ak èd gwo enjenyè nan dyaspora a.
                    
                    8. Moun li vize : Moun ki trè fò nan kòd, elèv ak etidyan briyan, enjenyè ak tout moun ki vle vin gwo ekspè nan enfòmatik.
                    
                    9. Fonksyonalite prensipal yo :
                    - Fòmasyon gwo nivo nan achitekti lojisyèl, entèlijans atifisyèl ak sekirite enfòmatik ;
                    - Travay obligatwa sou vrè pwojè k ap fonksyone nan ekosistèm AJ-TECH la ;
                    - Èd ak konsèy dirèk nan men gwo ekspè ayisyen ak entènasyonal ;
                    - Laboratwa rechèch sou kijan pou fè teknoloji mache menm kote kouran ak entènèt difisil.
                    
                    10. Arkitekti teknik : Platfòm aprantisaj modèn ak espas laboratwa virtiyèl ki kouri sou sèvè souveren AJ-Cloud.
                    
                    11. Teknoloji yo prevwa itilize : Linux Kernel, Rust, Kotlin Multiplatform, Kubernetes, C / C++, zouti avanse pou sèvè ak sekirite.
                    
                    12. Entèlijans atifisyèl : Laboratwa rechèch pou travay sou zouti entèlijans atifisyèl an Kreyòl ak sistèm pou byen jere kouran solèy.
                    
                    13. Sekirite : Laboratwa espesyal pou antrene etidyan yo defann kont atak enfòmatik (Red Team / Blue Team) ak bati sistèm ki an sekirite depi nan kòmansman.
                    
                    14. Modèl ekonomik : Bous detid pou etidyan ki pi fò yo, patenarya ak konpayi teknoloji ak èd moun nan dyaspora a ki vle sipòte ekselans.
                    
                    15. Entegrasyon ak AJ-TECH : Sèvi kòm gwo sous konesans ak rechèch ki fòme tout gwo direktè teknik ak enjenyè pou ekosistèm nan.
                    
                    16. Relasyon ak lòt antite yo : Konekte ak AJ-Learn pou chwazi pi bon etidyan yo, AJ-Dev pou zouti kòd ak tout rès 20 antite yo pou fè pratik.
                    
                    17. Plan wout 2026–2035 :
                    - Kout tèm (2026–2027) : Prepare tout pwogram kou ekselans yo ansanm ak gwo pwofesè inivèsite ak enjenyè nan dyaspora a ;
                    - Mwayen tèm (2028–2030) : Premye pwomosyon pilòt 50 etidyan ki gen bous detid konplè ;
                    - Long tèm (2031–2035) : Gwo kanpis fizik modèn an Ayiti epi diplòm ki rekonèt nan tout gwo inivèsite sou latè.
                    
                    18. Pèspektiv entènasyonal : Travay ansanm ak pi gwo inivèsite teknoloji nan Karayib la, Etazini, Kanada ak Ewòp.
                """.trimIndent(),
                plannedStartPage = 225,
                plannedEndPage = 230,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            )
        )
    )
}



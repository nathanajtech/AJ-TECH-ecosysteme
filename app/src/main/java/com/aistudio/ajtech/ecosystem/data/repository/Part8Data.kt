package com.aistudio.ajtech.ecosystem.data.repository

import com.aistudio.ajtech.ecosystem.data.model.BookChapter
import com.aistudio.ajtech.ecosystem.data.model.BookContentStatus
import com.aistudio.ajtech.ecosystem.data.model.BookPart
import com.aistudio.ajtech.ecosystem.data.model.PartType

/**
 * PARTIE VIII — INTELLIGENCE ARTIFICIELLE, INNOVATION ET AVENIR
 * Chapitres 107 à 121 (Exactement 15 chapitres d'analyse IA, éthique, pédagogie, développement et stratégie 2026–2035).
 */
object Part8Data {

    val part8: BookPart = BookPart(
        id = "part_8",
        partNumber = 8,
        type = PartType.MAIN_PART,
        titleFr = "PARTIE VIII — INTELLIGENCE ARTIFICIELLE, INNOVATION ET AVENIR",
        titleHt = "PATI VIII — ENTÈLIJANS ATIFISYÈL, INOVASYON AK LAVNI",
        subtitleFr = "Transformation technologique, accélération de l'ingénierie, éthique et feuille de route IA 2026–2035",
        subtitleHt = "Chanjman nan mond teknoloji, travay enjenyè pi vit, etik ak plan estratejik IA 2026–2035",
        plannedPages = "pp. 151–166",
        status = BookContentStatus.IN_PROGRESS,
        chapters = listOf(
            // ==================== CHAPITRE 107 : L’intelligence artificielle au service d’Haïti ====================
            BookChapter(
                id = "ch_8_107",
                chapterNumber = 107,
                partId = "part_8",
                titleFr = "Chapitre 107 — L’intelligence artificielle au service d’Haïti",
                titleHt = "Chapit 107 — Entèlijans atifisyèl nan sèvis Ayiti",
                subtitleFr = "Opportunités d'émancipation cognitive, souveraineté algorithmique et défis structurels",
                subtitleHt = "Opòtinite pou lespri n libere, metriz kalkil nimerik ak gwo defi peyi a",
                summaryFr = "Positionnement stratégique de l'IA pour Haïti : dépasser la simple consommation d'outils étrangers pour devenir des concepteurs conscients de nos réalités.",
                summaryHt = "Wòl estratejik entèlijans atifisyèl pou Ayiti : sispann senp itilizatè teknoloji blan pou n tounen moun k ap kreye zouti ki reponn ak bezwen nou.",
                contentFr = """
                    1. Une opportunité historique de saut technologique (Leapfrogging) :
                    Tout comme la téléphonie mobile a permis à Haïti de s'affranchir du déploiement lent et coûteux des lignes filaires traditionnelles dans les années 2000, l'intelligence artificielle offre l'opportunité de franchir un cap historique. Elle permet à des équipes d'ingénieurs locales réduites de concevoir des systèmes d'information sophistiqués, d'automatiser des diagnostics préventifs et de vulgariser des connaissances universitaires sans attendre des décennies d'accumulation matérielle lourde.
                    
                    2. Rompre avec le statut de simple consommateur passif :
                    Pendant trop longtemps, notre pays n'a été qu'un débouché commercial pour des logiciels et des plateformes pensés ailleurs, calibrés sur des réalités étrangères et ignorant nos langues nationales. L'ambition d'AJ-TECH est claire : nous refusons la vassalisation technologique. L'intelligence artificielle doit être étudiée, comprise, adaptée et codée par des cerveaux haïtiens pour répondre aux urgences locales : éducation, gestion des catastrophes, santé de proximité et soutien au commerce populaire.
                    
                    3. Les réalités matérielles et l'impératif de frugalité :
                    Bâtir des solutions d'IA en Haïti impose une lucidité totale face aux contraintes du terrain. Nous composons quotidiennement avec un réseau électrique discontinu, une connectivité Internet coûteuse et instable, et un pouvoir d'achat mesuré. Développer une IA utile pour Haïti, ce n'est pas rêver de supercalculateurs inaccessibles, c'est concevoir des modèles légers (Small Language Models), optimisés pour fonctionner sur des appareils modestes et capables de tourner en mode Offline-First.
                """.trimIndent(),
                contentHt = """
                    1. Yon bèl chans pou n fè yon gwo pa annavan :
                    Menm jan telefòn selilè te pèmèt Ayiti pa t bezwen tann fil kouran ak fil telefòn pase nan tout mòn anvan moun te ka pale nan lane 2000 yo, entèlijans atifisyèl ban nou yon gwo opòtinite jodi a. Li pèmèt ti ekip jèn enjenyè ayisyen kreye bèl aplikasyon ki gen gwo valè, ede jwenn enfòmasyon sou lasante epi gaye bon konesans lekòl san nou pa bezwen gwo milya dola gwo nasyon yo genyen.
                    
                    2. Sispann rete nan wòl moun k ap sèlman achte :
                    Pandan twòp lane, peyi nou te sèlman la pou achte aplikasyon etranje te fè, aplikasyon ki pa t janm konprann lang Kreyòl nou an ni reyalite lavi nou. Pozisyon AJ-TECH klè : nou pa ka ret ap tann lòt moun panse pou nou. Fòk jèn nou yo metrize entèlijans atifisyèl la pou n kreye zouti pou rezoud pwoblèm pa nou : lekòl timoun yo, ede ti machann nan mache, prevansyon siklòn ak premye swen lasante.
                    
                    3. Gade verite peyi a nan je :
                    Nou pa ka bati zouti entèlijan si nou bliye reyalite Pòtoprens ak pwovens yo : kouran ki pa estab, entènèt ki chè epi ki konn koupe souvan. Pou yon IA itil tout bon an Ayiti, li dwe senp, li dwe pa mande twòp kouran epi li dwe ka mache san entènèt (Offline-First) sou ti telefòn òdinè.
                """.trimIndent(),
                plannedStartPage = 151,
                plannedEndPage = 152,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 108 : Comprendre l’intelligence artificielle ====================
            BookChapter(
                id = "ch_8_108",
                chapterNumber = 108,
                partId = "part_8",
                titleFr = "Chapitre 108 — Comprendre l’intelligence artificielle",
                titleHt = "Chapit 108 — Konprann entèlijans atifisyèl",
                subtitleFr = "Des algorithmes symboliques aux réseaux de neurones profonds et au Machine Learning",
                subtitleHt = "Soti nan kalkil senp rive nan rezo newòn ak aprantisaj otomatik",
                summaryFr = "Démystification technique de l'IA : apprentissage supervisé, non supervisé, modèles statistiques et fonctionnement fondamental des réseaux de neurones.",
                summaryHt = "Eksplikasyon klè sou sa entèlijans atifisyèl ye tout bon : aprantisaj otomatik, kalkil estatistik ak kijan rezo newòn yo fonksyone san mistè.",
                contentFr = """
                    1. Qu'est-ce que l'IA réellement ?
                    L'intelligence artificielle n'a rien de magique ni de conscient. Il ne s'agit pas d'un cerveau vivant doté d'émotions ou d'intentions, mais d'un ensemble rigoureux de méthodes mathématiques, statistiques et algorithmiques permettant à un programme informatique d'identifier des régularités (patterns) dans d'immenses volumes de données et de produire des prédictions ou des inférences.
                    
                    2. Les grandes familles de l'apprentissage automatique (Machine Learning) :
                    - L'apprentissage supervisé (Supervised Learning) : l'algorithme s'entraîne sur des exemples étiquetés (par exemple, des milliers d'images annotées "mangue saine" ou "mangue malade") pour apprendre à classer de nouvelles données non étiquetées ;
                    - L'apprentissage non supervisé (Unsupervised Learning) : le modèle explore des données brutes sans indication préalable pour y découvrir des regroupements naturels (clustering) ;
                    - L'apprentissage par renforcement (Reinforcement Learning) : un agent logiciel apprend par essais et erreurs en recevant des récompenses ou des pénalités selon ses actions dans un environnement donné.
                    
                    3. Des réseaux de neurones artificiels au Deep Learning :
                    Inspirés de manière très simplifiée des connexions synaptiques, les réseaux de neurones artificiels empilent des couches d'équations linéaires suivies de fonctions d'activation non linéaires. L'apprentissage profond (Deep Learning) multiplie ces couches cachées pour capturer des représentations de plus en plus abstraites (pixels -> contours -> textures -> objets complexes). Comprendre cette logique mathématique est le premier pas pour démystifier la technologie et former nos étudiants à l'ingénierie rigoureuse.
                """.trimIndent(),
                contentHt = """
                    1. Kisa IA ye tout bon vre ?
                    Entèlijans atifisyèl pa gen anyen ki majik ladan l, li pa gen lespri, li pa gen kè ni li pa vivan. Se senpleman yon bèl seri fòmil matematik, kalkil estatistik ak kòd pwogramasyon ki pèmèt yon òdinatè gade yon gwo pil enfòmasyon, wè kijan yo sanble, epi devine ki rezilta ki pi bon an.
                    
                    2. Twa gwo fason aprantisaj otomatik (Machine Learning) la mache :
                    - Aprantisaj gide (Supervised) : nou bay òdinatè a anpil egzanp ki gen non yo sou yo (tankou 10 000 foto mango ki gen maladi ak mango ki bon) pou l aprann rekonèt yo lè l wè yon lòt ;
                    - Aprantisaj san gide (Unsupervised) : nou lage machin nan nan yon pil done san n pa di l anyen, pou l chèche gwoupe sa ki sanble yo ansanm ;
                    - Aprantisaj pa rekonpans (Reinforcement) : sistèm nan eseye plizyè aksyon, lè l fè bon bagay li jwenn pwen, lè l fè erè li pèdi pwen, konsa l vin konn pi bon chemen an.
                    
                    3. Rezo newòn ak Aprantisaj Pwofon (Deep Learning) :
                    Menm jan selil sèvo a kominike ansanm, enjenyè yo mete plizyè kouch kalkil youn dèyè lòt. Sa pèmèt òdinatè a konprann bagay ki konplike anpil : soti nan ti pwen foto rive nan yon figi moun oswa yon mo konplè. Lè jèn nou yo konprann sa, mistè a kraze epi yo ka aprann bati l ak pwòp men yo.
                """.trimIndent(),
                plannedStartPage = 153,
                plannedEndPage = 154,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 109 : IA générative et création numérique ====================
            BookChapter(
                id = "ch_8_109",
                chapterNumber = 109,
                partId = "part_8",
                titleFr = "Chapitre 109 — IA générative et création numérique",
                titleHt = "Chapit 109 — IA jeneratif ak kreyasyon nimerik",
                subtitleFr = "Grands modèles de langage (LLM), diffusion, génération multimodale et production de code",
                subtitleHt = "Gwo modèl langaj (LLM), modèl difizyon, kreyasyon miltimodyal ak pwodiksyon kòd lojisyèl",
                summaryFr = "Fonctionnement de l'IA générative, architecture Transformer, génération de texte, de code, d'images et amplification de la créativité humaine.",
                summaryHt = "Kijan IA jeneratif mache, achitekti Transformer, kreyasyon tèks, kòd pwogramasyon, imaj ak fason li ede devlopè ak atis kreye pi vit.",
                contentFr = """
                    1. La révolution des modèles de fondation et des Transformers :
                    Introduite en 2017 avec le mécanisme d'attention (« Attention Is All You Need »), l'architecture Transformer a transformé le traitement du langage naturel. En calculant les relations probabilistes entre chaque mot (token) d'une séquence, les grands modèles de langage (LLM) sont devenus capables de générer des textes cohérents, de traduire des langues, de résumer des ouvrages entiers et de raisonner de manière logique sur des problèmes complexes.
                    
                    2. L'IA générative comme amplificateur pour les créateurs haïtiens :
                    - Production logicielle : assistanat au code, génération de tests unitaires, détection de failles de sécurité et documentation accélérée ;
                    - Création visuelle et multimédia : génération d'illustrations pédagogiques, conception d'interfaces graphiques (UI/UX) et maquettage rapide sans nécessiter de coûteux studios de design ;
                    - Préservation culturelle : numérisation, transcription et valorisation du patrimoine littéraire et historique haïtien.
                    
                    3. L'humain reste le pilote souverain :
                    L'IA générative ne crée pas à partir de rien : elle recombine des régularités statistiques apprises lors de son entraînement. Sans la créativité, l'esprit critique, le goût artistique et le jugement éthique de l'humain, les productions de l'IA restent génériques et parfois erronées. Chez AJ-TECH, nous considérons l'IA comme un formidable pinceau numérique, mais le tableau final appartient toujours à l'artiste haïtien.
                """.trimIndent(),
                contentHt = """
                    1. Gwo revolisyon Transformer ak modèl langaj yo :
                    Depi lè syantifik yo te envante sistèm « Transformer » nan lane 2017 la, tout fason òdinatè konprann pawòl moun chanje nèt. Olye l li mo yo youn apre lòt tou dousman, li gade tout fraz la ansanm epi l kalkile ki mo ki pi byen kole ak lòt la. Se konsa gwo zouti jeneratif yo rive ekri bon tèks, tradui lang, epi reponn bèl kesyon difisil.
                    
                    2. Yon gwo kout men pou devlopè ak atis ayisyen :
                    - Ekri kòd enfòmatik pi vit : zouti a ka ede jwenn erè nan kòd la, pwopoze solisyon epi ekri tès pou asire lojisyèl la solid ;
                    - Bèl desen ak konsepsyon vizyèl : kreye bèl desen pou liv lekòl ak aplikasyon san koute gwo lajan nan kòmansman yon pwojè ;
                    - Sove memwa peyi a : ede mete liv istwa ak kilti nou sou fòm nimerik pou jenerasyon k ap vini yo ka li yo fasil.
                    
                    3. Moun nan rete chèf la :
                    IA pa gen lide pa li : li sèlman kalkile sa l te wè nan liv ak dokiman yo te ba li pou l etidye. Si yon moun pa gen konesans, bon gou ak bon jijman, sa IA a bay la ka plen erè. Nan AJ-TECH, nou wè IA tankou yon bon bwòs penti, men se enjenyè ak atis ayisyen an ki konn ki bèl bagay l ap pentire sou twal la.
                """.trimIndent(),
                plannedStartPage = 155,
                plannedEndPage = 156,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 110 : IA et automatisation des tâches ====================
            BookChapter(
                id = "ch_8_110",
                chapterNumber = 110,
                partId = "part_8",
                titleFr = "Chapitre 110 — IA et automatisation des tâches",
                titleHt = "Chapit 110 — IA ak automatisation travay yo",
                subtitleFr = "Productivité décuplée, flux de travail automatisés, scripts et assistance opérationnelle",
                subtitleHt = "Pwodiktivite miltipliye, sikwi travay otomatik, pwogramasyon rapid ak èd chak jou",
                summaryFr = "Comment l'IA transforme l'automatisation administrative, le traitement de documents et l'ingénierie logicielle pour démultiplier l'impact des équipes réduites.",
                summaryHt = "Kijan IA ede òganize travay papye, trete dokiman vit epi ede ti ekip jèn enjenyè fè travay ki te konn pran semèn nan kèk èdtan sèlman.",
                contentFr = """
                    1. Dépasser les tâches répétitives à faible valeur ajoutée :
                    Dans les administrations comme dans les entreprises privées en Haïti, d'innombrables heures de travail sont gaspillées dans la saisie manuelle de formulaires, le tri de reçus papier, le classement de répertoires ou la rédaction de courriels stéréotypés. L'association de l'automatisation robotisée des processus (RPA) et de l'intelligence artificielle permet d'extraire automatiquement des données structurées, de catégoriser les requêtes et de libérer du temps pour la réflexion stratégique et le contact humain.
                    
                    2. L'impact direct sur les cycles de développement logiciel :
                    Pour une jeune entreprise technologique comme AJ-TECH, l'automatisation assistée par IA est un démultiplicateur de force indispensable :
                    - Génération automatique de squelettes d'API et de modèles de données ;
                    - Automatisation des tests de non-régression et d'intégration continue (CI/CD) ;
                    - Synthèse instantanée des rapports d'erreurs et des journaux de crash ;
                    - Traduction et synchronisation automatique des dictionnaires de ressources bilingues (FR / HT).
                    
                    3. La vigilance opérationnelle face à l'automatisation aveugle :
                    Automatiser ne signifie pas démissionner. Tout flux de travail automatisé doit comporter des points de contrôle stricts (Human-in-the-Loop). Une automatisation sans supervision risquerait de propager des erreurs à grande vitesse, d'envoyer des informations erronées à des citoyens ou d'altérer des bases de données critiques. L'excellence réside dans l'alliance de la vitesse algorithmique et de la rigueur humaine.
                """.trimIndent(),
                contentHt = """
                    1. Fini ak travay fatigan ki pa fè w aprann anyen :
                    Kit se nan biwo leta oswa nan ti biznis an Ayiti, gen twòp tan k ap pèdi nan kopye menm papye, klase fich ak men oswa ekri menm lèt chak jou. Lè nou mete bon kòd ak IA sou sa, sistèm nan ka li dokiman an otomatikman, ranje enfòmasyon yo kote yo dwe ye, pou travayè yo ka jwenn tan pou pale ak kliyan epi rezoud pwoblèm ki pi enpòtan yo.
                    
                    2. Kijan sa ede ekip AJ-TECH travay pi vit :
                    Pou yon jèn ekip teknoloji k ap bati yon gwo ekosistèm, automatisation ak IA se yon zouti ki bay anpil fòs :
                    - Kreye premye baz kòd ak estrikti done yo rapidman ;
                    - Teste aplikasyon yo otomatikman pou asire pa gen anyen ki kraze ;
                    - Li rapò sou pann pou wè kote erè a soti nan kèk segonn ;
                    - Ede mete tèks yo ni an Fransè ni an Kreyòl san bliye okenn mo.
                    
                    3. Fòk nou toujou veye ak de je nou :
                    Mete sistèm otomatik pa vle di kwaze bra kite machin nan fè sa l vle. Fòk gen moun responsab k ap tcheke tout bagay avan yo voye l bay moun k ap itilize l. Si w pa kontwole l, machin nan ka voye move enfòmasyon vit anpil epi gate done moun yo. Se entèlijans moun marye ak vitès òdinatè ki bay bon kalite travay.
                """.trimIndent(),
                plannedStartPage = 157,
                plannedEndPage = 158,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 111 : Données, modèles et qualité des résultats ====================
            BookChapter(
                id = "ch_8_111",
                chapterNumber = 111,
                partId = "part_8",
                titleFr = "Chapitre 111 — Données, modèles et qualité des résultats",
                titleHt = "Chapit 111 — Done, modèl ak kalite rezilta yo",
                subtitleFr = "Le cycle de vie des données, nettoyage, biais statistiques, fine-tuning et hallucinations",
                subtitleHt = "Lavi yon done, netwayaj enfòmasyon, prejije nan kalkil, antrenman espesyal ak manti modèl yo",
                summaryFr = "L'adage « Garbage In, Garbage Out » appliqué à l'IA : importance cruciale de la qualité des données, représentativité culturelle et lutte contre les hallucinations.",
                summaryHt = "Enpòtans kalite done yo : si w mete fatra w ap jwenn fatra. Valè lang Kreyòl la nan done yo ak fason pou rekonèt lè yon modèl ap bay manti.",
                contentFr = """
                    1. La maxime fondatrice : « Garbage In, Garbage Out » :
                    La performance et la fiabilité de n'importe quel modèle d'IA dépendent à 90 % de la qualité des données sur lesquelles il a été entraîné. Si les données d'entrée sont bruitées, obsolètes, partiales ou non représentatives, les réponses générées seront inévitablement dégradées, voire dangereusement erronées. La rigueur commence donc par l'ingénierie des données : collecte éthique, nettoyage, déduplication, normalisation et validation méthodique.
                    
                    2. Le défi de la représentativité linguistique et culturelle haïtienne :
                    Les grands modèles mondiaux ont été entraînés sur des corpus composés à plus de 90 % d'anglais et de quelques langues dominantes. Le créole haïtien, langue maternelle partagée par plus de 12 millions de citoyens, y est cruellement sous-représenté et trop souvent traité avec des approximations grossières. La mission d'AJ-TECH est de constituer des corpus d'apprentissage bilingues propres, respectueux des règles orthographiques officielles de l'Académie du Créole Haïtien (AKA) et ancrés dans notre vocabulaire technique, juridique et quotidien.
                    
                    3. Comprendre et atténuer les hallucinations :
                    Une hallucination désigne le moment où un modèle d'IA génère avec une assurance parfaite une information totalement factice, inventant des faits historiques, des références de lois ou des citations inexistantes. Pour contrecarrer ce risque dans nos applications, nous privilégions la génération augmentée par récupération (RAG — Retrieval-Augmented Generation) : l'IA ne brode pas à partir de sa mémoire statistique floue, mais base strictement ses réponses sur des documents vérifiés et sourcés.
                """.trimIndent(),
                contentHt = """
                    1. Prensip debaz la : si w mete fatra w ap jwenn fatra :
                    Yon machin pa ka bay bon repons si enfòmasyon yo te mete ladan l lan te mal ranmase, te gen erè oswa te gen manti. Fòs yon entèlijans atifisyèl soti nan kalite done yo ba li pou l travay la. Sa vle di enjenyè yo dwe pase anpil tan ap netwaye done yo, retire erè epi asire chak fraz ak chak chif kòrèk avan yo antrene yon modèl.
                    
                    2. Defann lang Kreyòl Ayisyen an nan mond nimerik la :
                    Gwo konpayi etranje yo te antrene zouti yo sèlman ak lang Anglè ak lòt gwo lang rich. Lang Kreyòl la, lang plis pase 12 milyon Ayisyen pale chak jou, pa t jwenn plas li merite nan zouti sa yo. Se poutèt sa souvan zouti sa yo pale yon Kreyòl kwochi ki pa gen sans. Youn nan gwo misyon AJ-TECH se rasanble bon dokiman nèt ak bèl tèks Kreyòl ki respekte règ Akademi Kreyòl Ayisyen an pou zouti nou yo ka pale ak moun yo jan sa dwe ye.
                    
                    3. Konprann lè machin nan ap bay manti (alisinasyon) :
                    Yon modèl ka reponn yon kesyon avèk anpil bèl pawòl, li sanble gen rezon, men tout sa l di a se manti li envante paske l pa t jwenn bon repons lan. Pou anpeche sa rive nan aplikasyon nou yo, nou itilize metòd RAG (Retrieval-Augmented Generation) : nou fòse sistèm nan al li nan liv ak dokiman ofisyèl nou verifye yo dabò anvan l ouvè bouch li pou l reponn.
                """.trimIndent(),
                plannedStartPage = 159,
                plannedEndPage = 160,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 112 : Éthique et responsabilité de l’intelligence artificielle ====================
            BookChapter(
                id = "ch_8_112",
                chapterNumber = 112,
                partId = "part_8",
                titleFr = "Chapitre 112 — Éthique et responsabilité de l’intelligence artificielle",
                titleHt = "Chapit 112 — Etik ak responsablite entèlijans atifisyèl",
                subtitleFr = "Transparence algorithmique, protection de la vie privée, justice sociale et encadrement",
                subtitleHt = "Transparans nan kalkil yo, pwoteksyon vi prive moun, jistis sosyal ak règleman klè",
                summaryFr = "Principes éthiques cardinaux : responsabilité humaine non délégable, consentement éclairé, équité, absence de manipulation et protection des données sensibles.",
                summaryHt = "Prensip etik fondamantal : responsablite toujou rete nan men moun, respè vi prive, pa kite machin manipile moun epi pwoteje enfòmasyon sekrè.",
                contentFr = """
                    1. La primauté de la dignité humaine :
                    L'intelligence artificielle doit être conçue pour émanciper l'être humain, jamais pour le subjuguer, le manipuler ou le réduire à une variable numérique. Chez AJ-TECH, nous réaffirmons avec force que la technologie n'est pas neutre : elle porte les valeurs de ceux qui la fabriquent. Nous faisons le choix délibéré d'une technologie au service du bien commun, de la justice sociale et de l'élévation morale et matérielle du peuple haïtien.
                    
                    2. Les quatre piliers de notre charte éthique IA :
                    - Responsabilité humaine inaliénable : aucune décision ayant un impact juridique, financier, médical ou moral sur une personne ne peut être abandonnée à un algorithme autonome sans recours ni validation humaine ;
                    - Transparence et explicabilité : les utilisateurs ont le droit absolu de savoir quand ils interagissent avec une IA et sur quels critères généraux les recommandations ont été formulées ;
                    - Équité et non-discrimination : vigilance active contre les stéréotypes sexistes, socio-économiques ou géographiques dans les jeux de données ;
                    - Souveraineté de la vie privée : interdiction formelle d'exploiter les données personnelles ou les conversations des utilisateurs pour alimenter des régies publicitaires prédatrices.
                    
                    3. Prévenir la création de nouvelles fractures sociales :
                    Si l'IA n'est accessible qu'à une élite fortunée munie des derniers équipements et capable de payer des abonnements en devises étrangères, elle creusera encore davantage les inégalités criantes de notre pays. L'éthique commence par l'accessibilité : concevoir des outils légers, utilisables gratuitement ou à coût dérisoire sur les réseaux locaux.
                """.trimIndent(),
                contentHt = """
                    1. Respè pou diyite chak grenn moun :
                    Entèlijans atifisyèl dwe la pou ede moun viv pi byen, li pa dwe janm la pou twonpe moun, fè yo pè oswa trete yo tankou senp nimewo. Nan AJ-TECH, nou kwè fò teknoloji pa fèt pou kont li : li pote lespri ak valè moun ki kode l la. Nou chwazi mete teknoloji nou an nan sèvis verite, lajistis ak devlopman tout pèp Ayisyen an.
                    
                    2. Kat gwo prensip moral nou pou IA :
                    - Responsablite rete nan men moun : okenn machin pa gen dwa pran yon desizyon sou lavi, lajan oswa lasante yon moun san yon vrè moun pa verifye sa ;
                    - Transparans total : moun gen dwa konnen aklè lè se ak yon sistèm entèlijan y ap pale, epi kijan li fè jwenn repons li bay yo ;
                    - Jistis san prejije : veye pou machin nan pa repete vye pawòl ak prejije sou fanm, sou moun ki pòv oswa sou moun ki soti nan zòn rekile ;
                    - Pwoteksyon lavi prive : nou pap janm pran pawòl sekrè moun yo pou n al vann lòt konpayi pou fè piblisite.
                    
                    3. Pa kreye plis divizyon nan sosyete a :
                    Si se sèlman moun rich ki gen gwo telefòn nèf ak kat kredi ki ka sèvi ak IA, sa ap vin mete plis mizè ak separasyon nan peyi a. Bon moral mande pou zouti sa yo rive nan men tout moun gratis oswa pou yon ti kras kòb sou ti telefòn senp.
                """.trimIndent(),
                plannedStartPage = 161,
                plannedEndPage = 162,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 113 : IA, éducation et apprentissage ====================
            BookChapter(
                id = "ch_8_113",
                chapterNumber = 113,
                partId = "part_8",
                titleFr = "Chapitre 113 — IA, éducation et apprentissage",
                titleHt = "Chapit 113 — IA, edikasyon ak aprantisaj",
                subtitleFr = "Tutorat personnalisé, démocratisation du savoir avec EDUKA et AJ-Learn",
                subtitleHt = "Pwofesè pèsonèl pou chak elèv, gaye konesans fasil gras ak EDUKA ak AJ-Learn",
                summaryFr = "L'impact révolutionnaire de l'IA dans l'éducation haïtienne : adaptation du rythme d'apprentissage, vulgarisation scientifique bilingue et appui aux enseignants.",
                summaryHt = "Kijan IA ap transfòme lekòl an Ayiti : ede chak timoun aprann nan vitès pa li, eksplike leson an Fransè ak Kreyòl epi ede mèt lekòl yo prepare klas.",
                contentFr = """
                    1. Le défi éducatif haïtien et la réponse technologique :
                    En Haïti, le système éducatif souffre d'un manque criant d'enseignants qualifiés, de bibliothèques physiques à jour et de laboratoires scientifiques. Dans une classe surchargée de soixante élèves, le maître ne peut matériellement s'adapter au rythme de chacun. L'intelligence artificielle, intégrée intelligemment dans nos plateformes officielles EDUKA et AJ-Learn, agit comme un tuteur bienveillant et infatigable, disponible 24 heures sur 24 pour réexpliquer un théorème de mathématiques, corriger une dissertation ou guider un apprenti programmeur.
                    
                    2. Pédagogie différenciée et multilinguisme :
                    Chaque enfant apprend à son propre rythme. L'IA permet d'évaluer en temps réel les lacunes d'un élève (par exemple sur les fractions avec AJ-MathQuest) et de lui proposer des exercices sur mesure, gradués en difficulté. Mieux encore : elle brise la barrière de la langue. Un concept scientifique complexe présenté en français peut être instantanément réexpliqué en créole haïtien avec des métaphores tirées du quotidien local, favorisant une compréhension conceptuelle profonde plutôt qu'un psittacisme stérile.
                    
                    3. Renforcer l'enseignant, sans jamais le remplacer :
                    L'IA dans EDUKA n'a pas vocation à remplacer les professeurs, mais à les soulager de la correction mécanique des devoirs standardisés et de la rédaction fastidieuse de fiches de cours. L'enseignant retrouve ainsi son rôle le plus noble : celui de mentor, d'éducateur moral, d'inspirateur et de guide humain.
                """.trimIndent(),
                contentHt = """
                    1. Gwo pwoblèm lekòl an Ayiti ak solisyon nimerik :
                    Lekòl nan peyi nou soufri anpil : pa gen ase bon pwofesè kalifye, pa gen bon bibliyotèk ak liv modèn, epi sal klas yo souvan plen twòp timoun. Yon sèl pwofesè pa ka okipe 60 elèv an menm tan. Lè nou mete entèlijans atifisyèl nan platfòm ofisyèl tankou EDUKA ak AJ-Learn, chak timoun vin gen tankou yon pwofesè pèsonèl ki gen pasyans, ki la nenpòt lè pou re-eksplike yon leson matematik oswa ede l konprann yon tèks difisil.
                    
                    2. Aprann nan vitès pa w epi nan lang manman w :
                    Chak timoun pa aprann menm jan. Gen sa ki konprann vit, gen sa ki bezwen plis tan. Zouti entèlijan an ka wè ki kote elèv la bloke (pa egzanp nan fraksyon nan AJ-MathQuest) epi ba li ti egzèsis ki adapte ak nivo li. Sa ki pi bèl la : li kraze baryè lang lan. Si yon leson difisil an Fransè, sistèm nan ka re-eksplike l an Kreyòl ak bèl egzanp lavi chak jou pou timoun nan ka konprann lespri bagay la tout bon vre.
                    
                    3. Ede mèt lekòl yo fè travay yo pi byen :
                    IA nan EDUKA pa la pou ranplase pwofesè yo. Li la pou ede yo korije devwa pi vit, prepare plan kou pi fasil, pou pwofesè a ka gen plis tan pou pale ak elèv yo, ankouraje yo epi ba yo bon konsèy lavi.
                """.trimIndent(),
                plannedStartPage = 163,
                plannedEndPage = 164,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 114 : IA et développement des entreprises ====================
            BookChapter(
                id = "ch_8_114",
                chapterNumber = 114,
                partId = "part_8",
                titleFr = "Chapitre 114 — IA et développement des entreprises",
                titleHt = "Chapit 114 — IA ak devlopman antrepriz yo",
                subtitleFr = "Modernisation des PME haïtiennes, relation client et compétitivité avec AJ-Biz et AJ-Commerce",
                subtitleHt = "Ede ti antrepriz lokal grandi, bon kominikasyon ak kliyan ak AJ-Biz ak AJ-Commerce",
                summaryFr = "Application pragmatique de l'IA pour les PME et micro-entreprises haïtiennes : relation client multilingue, prévisions de vente et gains d'efficacité avec AJ-Biz et AJ-Commerce.",
                summaryHt = "Kijan ti machann ak ti antrepriz ayisyen ka itilize IA pou reponn kliyan rapid, konnen ki machandiz k ap vann pi vit ak AJ-Biz ak AJ-Commerce.",
                contentFr = """
                    1. La compétitivité des entreprises haïtiennes à l'ère numérique :
                    Dans un monde globalisé où les géants internationaux automatisent l'ensemble de leur chaîne de valeur, les entreprises haïtiennes ne peuvent plus se contenter d'une gestion empirique sur cahiers papier. Pour survivre, croître et créer des emplois durables, nos entrepreneurs doivent s'approprier les outils d'aide à la décision. L'IA n'est pas un luxe réservé aux multinationales de la Silicon Valley : c'est un levier d'optimisation immédiat pour l'atelier artisanal, la pharmacie de quartier ou la coopérative agricole.
                    
                    2. Cas d'usage concrets avec nos entités AJ-Biz et AJ-Commerce :
                    - Gestion prédictive des stocks : anticiper les ruptures d'approvisionnement en analysant les cycles saisonniers de vente et les aléas de transport ;
                    - Service client bilingue automatisé : répondre instantanément aux questions fréquentes des clients sur WhatsApp ou sur le Web via des agents conversationnels formés sur les produits de l'entreprise ;
                    - Analyse comptable simplifiée : catégorisation automatique des dépenses et des rentrées de fonds pour aider le commerçant à identifier ses marges réelles ;
                    - Marketing de contenu ciblé : génération d'annonces commerciales et de visuels promotionnels adaptés aux habitudes locales.
                    
                    3. Accompagner la transition sans exclusion :
                    La mission d'AJ-Biz est d'offrir des interfaces tellement intuitives que même un commerçant peu familier de l'informatique puisse bénéficier de la puissance de l'IA sans avoir besoin d'écrire une seule ligne de code. La technologie doit s'adapter à la réalité du commerçant haïtien, et non l'inverse.
                """.trimIndent(),
                contentHt = """
                    1. Kijan biznis ayisyen ka kenbe tèt devan konpetisyon :
                    Jodi a nan lemonn, gwo konpayi yo itilize zouti modèn pou jere tout bagay vit. Ti biznis ak antrepriz an Ayiti pa ka rete sèlman nan ekri sou ti kaye ki ka pèdi oswa pran dlo. Pou yon boutik, yon famasi oswa yon ti izin ka fè plis kòb epi bay jèn travay, fòk yo konn sèvi ak bon zouti nimerik. IA se pa yon bagay pou gwo peyi rich sèlman : li ka ede ti kòmèsan bò lakay nou travay pi byen tou.
                    
                    2. Bèl egzanp travay pratik nan AJ-Biz ak AJ-Commerce :
                    - Konnen machandiz ki pral fini davans : sistèm nan ka gade sa k vann pi vit pou di mèt boutik la kilè pou l al achte lòt machandiz pou l pa janm manke anyen ;
                    - Reponn kliyan sou WhatsApp nenpòt lè : yon ti asistan ka bay pri machandiz ak adrès boutik la byen vit menm nan mitan lannwit ;
                    - Kalkile benefis nèt : ranje depans ak lajan ki rantre pou mèt biznis la konnen si l ap fè benefis tout bon ;
                    - Fè bèl ti afich piblisite pou atire plis moun vin achte.
                    
                    3. Fè zouti a fasil pou tout moun :
                    Misyon AJ-Biz se fè aplikasyon an tèlman fasil, menm yon machann ki pa t janm touche òdinatè ka sèvi avè l san tèt chaje. Se zouti a ki dwe aprann pale lang machann nan, se pa machann nan ki pou al kraze tèt li nan bagay teknik konplike.
                """.trimIndent(),
                plannedStartPage = 165,
                plannedEndPage = 166,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 115 : IA dans l’écosystème AJ-TECH ====================
            BookChapter(
                id = "ch_8_115",
                chapterNumber = 115,
                partId = "part_8",
                titleFr = "Chapitre 115 — IA dans l’écosystème AJ-TECH",
                titleHt = "Chapit 115 — IA nan ekosistèm AJ-TECH la",
                subtitleFr = "Cartographie transversale de l'intelligence artificielle appliquée aux 22 entités officielles",
                subtitleHt = "Kijan entèlijans atifisyèl travèse tout 22 antite ofisyèl ekosistèm nan",
                summaryFr = "Intégration raisonnée et transparente de l'IA au sein d'AJ-TECH : statut réel des briques IA, principes Offline-First et modèles frugaux adaptés à nos réalités.",
                summaryHt = "Kijan nou itilize IA tout bon nan AJ-TECH : eta reyèl chak moso lojisyèl, prensip mache san entènèt ak ti modèl ki pa lou pou telefòn senp.",
                contentFr = """
                    1. Une approche systémique et décloisonnée :
                    L'intelligence artificielle n'est pas un produit isolé dans l'écosystème AJ-TECH : elle constitue une couche transversale qui irrigue progressivement nos 22 entités officielles selon leurs besoins spécifiques. Qu'il s'agisse de l'optimisation des requêtes hors-ligne dans AJ-Task, de l'assistance au code dans AJ-Dev, du filtrage intelligent des pourriels dans AJ-Mail, de la transcription de réunions dans AJ-Meet ou du calcul d'itinéraires frugaux dans AJ-Maps, l'IA agit comme un catalyseur d'efficacité.
                    
                    2. L'impératif de sobriété et les modèles exécutés sur l'appareil (On-Device) :
                    Contrairement aux architectures classiques qui envoient systématiquement chaque donnée vers de gigantesques centres de calcul distants, AJ-TECH fait le choix audacieux de l'inférence locale (Edge AI). Grâce à la quantification des modèles (formats 4-bit / GGUF), de petits modèles de langage hautement spécialisés peuvent s'exécuter directement dans le navigateur ou sur la puce du smartphone, sans consommer de bande passante Internet et en garantissant une confidentialité totale des données citoyennes.
                    
                    3. Transparence absolue sur l'état d'avancement des fonctionnalités :
                    Conformément à notre charte de véracité, nous rappelons que nos briques d'IA sont réparties selon leur statut réel :
                    - Opérationnel / Expérimental : fonctionnalités d'assistance et de complétion locale intégrées dans nos premières PWA ;
                    - En développement / Prototype : modèles conversationnels bilingues spécialisés pour AJ-Assistant et EDUKA ;
                    - En conception / Feuille de route 2026–2035 : intégrations avancées pour AJ-Pay, AJ-Tè et AJ-Cloud.
                    Nous ne disposons d'aucun centre de calcul propriétaire à ce jour et nous refusons toute promesse marketing trompeuse.
                """.trimIndent(),
                contentHt = """
                    1. Yon zouti ki sèvi tout 22 antite yo ansanm :
                    Nan AJ-TECH, nou pa wè entèlijans atifisyèl tankou yon ti bagay apa : li tankou dlo k ap wouze tout 22 antite ofisyèl yo pou ede yo travay pi byen. Kit se nan AJ-Task pou ede ranje travay ou san entènèt, nan AJ-Dev pou ede ekri bon kòd, nan AJ-Mail pou bare move mesaj k ap vin fatige moun, nan AJ-Meet pou pran nòt nan reyinyon oswa nan AJ-Maps pou jwenn pi bon chemen, IA la pou rann sèvis la pi dous.
                    
                    2. Fè modèl yo mache tou dwat sou telefòn moun nan :
                    Olye nou voye tout enfòmasyon moun yo al tonbe sou gwo sèvè lòt bò dlo chak segonn, nou chwazi travay ak ti modèl espesyal ki ka kouri tou dwat sou telefòn moun nan (On-Device AI). Sa pèmèt aplikasyon an mache menm lè pa gen entènèt, li pa boufe batri telefòn nan, epi li asire pèsonn lòt moun pa ka wè sa w ap fè.
                    
                    3. Tout verite aklè sou eta pwojè yo :
                    Jan nou toujou pwomèt li, nou di laverite sou ki kote chak moso lojisyèl rive :
                    - Sa k ap mache kounye a : ti modèl senp k ap ede nan premye PWA nou yo ;
                    - Sa k nan faz tès ak prototip : ti asistan ki pale de lang pou AJ-Assistant ak EDUKA ;
                    - Sa k nan plan pou 2026–2035 : gwo koneksyon entèlijan pou AJ-Pay, AJ-Tè ak AJ-Cloud.
                    Nou pa gen okenn gwo sant kalkil prive pou kounye a, epi nou pap janm bay manti pou fè bèl wè.
                """.trimIndent(),
                plannedStartPage = 153,
                plannedEndPage = 156,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 116 : AJ-Assistant et les assistants intelligents ====================
            BookChapter(
                id = "ch_8_116",
                chapterNumber = 116,
                partId = "part_8",
                titleFr = "Chapitre 116 — AJ-Assistant et les assistants intelligents",
                titleHt = "Chapit 116 — AJ-Assistant ak asistan entèlijan yo",
                subtitleFr = "Conception d'un compagnon numérique bilingue, contextuel, respectueux de la vie privée",
                subtitleHt = "Konsepsyon yon asistan nimerik ki pale de lang, ki konprann reyalite nou san vòlè done nou",
                summaryFr = "Analyse approfondie de l'entité officielle AJ-Assistant : architecture de prototypage, inférence locale, traitement du langage créole et sécurité des échanges.",
                summaryHt = "Gwo etid sou antite ofisyèl AJ-Assistant : kijan pwototip la konstwi, kijan l pale Kreyòl byen, pwoteje vi prive epi ede itilizatè a chak jou.",
                contentFr = """
                    1. La genèse et la mission d'AJ-Assistant :
                    L'entité officielle AJ-Assistant est conçue pour devenir le compagnon numérique universel de chaque citoyen, étudiant et travailleur haïtien. Contrairement aux assistants virtuels généralistes étrangers qui peinent à saisir le contexte culturel, linguistique et géographique de notre île, AJ-Assistant est pensé dès sa conception pour comprendre nativement les subtilités du créole haïtien, les expressions idiomatiques, les réalités du transport en tap-tap, les coupures d'électricité et les spécificités du droit et de l'administration locale.
                    
                    2. Architecture technique du prototype :
                    - Moteur bilingue hybride : traitement fluide des échanges en créole haïtien et en français avec bascule dynamique sans perte de contexte ;
                    - Orchestration d'outils locaux (Function Calling) : capacité à interagir de manière sécurisée avec les autres applications de l'écosystème (créer une tâche dans AJ-Task, vérifier un rendez-vous dans AJ-Meet, consulter un cours dans EDUKA) ;
                    - Inférence locale et passerelle sécurisée : exécution sur l'appareil pour les requêtes courantes et délégation chiffrée de bout en bout vers des passerelles d'API lorsque des modèles plus volumineux sont requis.
                    
                    3. Confidentialité intransigeante :
                    Les conversations avec AJ-Assistant touchent à la vie intime, aux finances personnelles ou à la santé des usagers. Aucun enregistrement audio, aucune transcription textuelle n'est revendue à des tiers ou utilisée pour le ciblage publicitaire. AJ-Assistant est un serviteur loyal, dont la loyauté algorithmique va exclusivement à son utilisateur.
                """.trimIndent(),
                contentHt = """
                    1. Poukisa nou kreye AJ-Assistant :
                    Antite ofisyèl AJ-Assistant la fèt pou tounen bon zanmi nimerik chak sitwayen, chak elèv lekòl ak chak moun k ap travay an Ayiti. Gwo asistan etranje yo pa konn anyen nan reyalite peyi nou : yo pa konprann lè w di w pran tap-tap, yo pa konn sa k pase lè kouran koupe, epi yo pa konprann bèl blag ak pwovèb Kreyòl nou yo. AJ-Assistant fèt depi nan premye liy kòd li pou l konprann tout bagay sa yo byen fon.
                    
                    2. Kijan pwototip la konstwi anndan l :
                    - Li pale de lang san pwoblèm : ou ka pale avè l an Kreyòl oswa an Fransè, li reponn ou byen san l pa pèdi fil koze a ;
                    - Li ka ede w nan lòt aplikasyon yo : li ka mete yon rapèl pou ou nan AJ-Task, gade ki lè w gen reyinyon nan AJ-Meet oswa louvri yon leson nan EDUKA ;
                    - Mache tou dwat nan telefòn nan : li fè kalkil yo nan telefòn nan pou l ka reponn vit menm si entènèt la koupe, epi lè l bezwen plis fòs li voye mesaj la byen kache pou pèsonn pa ka vòlè l.
                    
                    3. Respekte sekrè chak moun :
                    Tout sa w di AJ-Assistant se sekrè pa w. Pèsonn pa gen dwa koute vwa w, pèsonn pap pran sa w ekri pou al vann lòt moun pou fè piblisite. AJ-Assistant se yon zouti fidèl ki la sèlman pou rann ou sèvis ak tout kè l.
                """.trimIndent(),
                plannedStartPage = 157,
                plannedEndPage = 159,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 117 : IA, santé et innovation responsable ====================
            BookChapter(
                id = "ch_8_117",
                chapterNumber = 117,
                partId = "part_8",
                titleFr = "Chapitre 117 — IA, santé et innovation responsable",
                titleHt = "Chapit 117 — IA, sante ak inovasyon responsab",
                subtitleFr = "Orientation diagnostique préventive, bien-être communautaire avec AJ-Bioklin et AJ-Fitness",
                subtitleHt = "Oryantasyon sante pou anpeche maladi, byennèt kominotè ak AJ-Bioklin ak AJ-Fitness",
                summaryFr = "L'apport de l'IA dans la santé publique et le bien-être en Haïti : triage informatif, suivi nutritionnel et limites strictes face à l'acte médical professionnel.",
                summaryHt = "Wòl IA nan sante piblik ak byennèt an Ayiti : ede moun konprann sentòm, konsèy nitrisyon ak AJ-Bioklin ak AJ-Fitness san janm ranplase vrè doktè.",
                contentFr = """
                    1. Le désert médical haïtien et le rôle de l'orientation préventive :
                    Dans de nombreuses communes et sections rurales d'Haïti, il n'y a pas un seul médecin pour dix mille habitants. Face à cette pénurie dramatique, des maladies curables s'aggravent faute de détection précoce et de conseils d'hygiène élémentaires. L'intelligence artificielle, intégrée au sein de notre entité officielle AJ-Bioklin, a pour vocation de fournir une première orientation préventive, d'informer sur les signaux d'alerte du choléra, du paludisme ou de l'hypertension artérielle, et d'orienter vers les structures de soins disponibles.
                    
                    2. La frontière éthique infranchissable : l'IA n'est pas médecin :
                    Nous posons un principe absolu : AJ-Bioklin ne pose aucun diagnostic médical définitif et ne prescrit aucun traitement médicamenteux autonome. L'acte médical engage la vie humaine et relève exclusivement de praticiens de santé diplômés et assermentés. L'IA agit uniquement comme un système expert d'aide au triage et d'éducation sanitaire communautaire.
                    
                    3. Bien-être quotidien, activité physique et nutrition avec AJ-Fitness :
                    La santé ne se résume pas à soigner la maladie : elle commence par la prévention au quotidien. Grâce à AJ-Fitness, l'IA adapte des programmes d'entraînement physique sans équipement coûteux et propose des recommandations nutritionnelles valorisant les produits du terroir haïtien (légumes locaux, tubercules, fruits de saison), encourageant des modes de vie sains et durables.
                """.trimIndent(),
                contentHt = """
                    1. Mank doktè nan peyi a ak solisyon prevansyon :
                    Nan anpil zòn nan pwovens an Ayiti, ou ka mache plizyè èdtan san w pa jwenn yon sèl dispansè oswa yon doktè. Sa fè anpil ti maladi ki te ka geri fasil vin tounen gwo danje paske moun yo pa t konnen sa pou yo fè bonè. Lè nou mete entèlijans atifisyèl nan antite ofisyèl AJ-Bioklin, sa ka ede moun yo konprann premye siy maladi tankou kolera, malarya oswa tansyon, epi montre yo ki kote yo dwe kouri ale pou jwenn swen.
                    
                    2. Yon limit klè ki pap janm chanje : machin pa doktè :
                    Nou fikse yon règ trè strik : AJ-Bioklin pap janm di yon moun ki medikaman pou l bwè pou kont li, ni li pap janm di l li gen yon maladi san yon vrè doktè pa egzamine l. Lavi moun se yon bagay sakre, se doktè ki fè etid medsin ki gen dwa bay medikaman. Zouti nou an la sèlman pou bay bon enfòmasyon ak konsèy ijyèn pou pwoteje fanmi yo.
                    
                    3. Fè egzèsis epi manje sa k bon ak AJ-Fitness :
                    Pou w an sante, fòk ou pa tann maladi tonbe sou ou. Gras ak AJ-Fitness, sistèm nan ka ede chak moun fè ti egzèsis fizik lakay yo san yo pa bezwen machin konplike, epi li bay bon konsèy sou kijan pou n manje bon manje peyi a (mayi, bannann, fèy ak fwi lokal) pou kò nou ka rete djanm.
                """.trimIndent(),
                plannedStartPage = 159,
                plannedEndPage = 161,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 118 : IA et inclusion numérique ====================
            BookChapter(
                id = "ch_8_118",
                chapterNumber = 118,
                partId = "part_8",
                titleFr = "Chapitre 118 — IA et inclusion numérique",
                titleHt = "Chapit 118 — IA ak enklizyon nimerik",
                subtitleFr = "Accessibilité vocale, franchissement de la barrière de l'analphabétisme et inclusion citoyenne",
                subtitleHt = "Kominikasyon ak vwa, kraze baryè lekti ak ekriti pou tout sitwayen patisipe",
                summaryFr = "Utiliser l'IA pour abolir les exclusions : synthèse et reconnaissance vocale en créole haïtien, interfaces multimodales et solidarité numérique via AJ-Fondation.",
                summaryHt = "Sèvi ak IA pou pèsonn pa rete dèyè : pale ak telefòn nan vwa Kreyòl pou moun ki pa konn li, ak sipò AJ-Fondation pou bay tout moun menm chans.",
                contentFr = """
                    1. L'illettrisme comme barrière d'accès au monde numérique :
                    Près de 40 % de la population adulte haïtienne éprouve d'importantes difficultés de lecture et d'écriture. Jusqu'à présent, cette réalité condamnait des millions de nos concitoyens à l'exclusion des services bancaires, des démarches administratives et des plateformes éducatives, tous conçus exclusivement sous forme textuelle. L'intelligence artificielle générative et multimodale apporte une réponse historique à cette injustice structurelle.
                    
                    2. La voix créole comme interface citoyenne universelle :
                    Grâce aux technologies de reconnaissance vocale (Speech-to-Text) et de synthèse vocale naturelle (Text-to-Speech) adaptées au créole haïtien, un citoyen qui ne sait ni lire ni écrire peut désormais s'adresser oralement à son téléphone, comprendre les réponses énoncées à voix haute avec un accent familier et chaleureux, et accomplir en toute autonomie des opérations essentielles :
                    - Consulter le solde de son portefeuille mobile et ordonner un transfert dans AJ-Pay / AJ-Wallet ;
                    - Connaître les cours du marché agricole ou l'état de la route ;
                    - Écouter une leçon ou une consigne sanitaire expliquée pas à pas.
                    
                    3. L'action solidaire portée par AJ-Fondation :
                    L'inclusion ne se décrète pas dans un laboratoire de code : elle se construit sur le terrain. À travers l'entité philanthropique AJ-Fondation, nous prévoyons de déployer des ateliers d'initiation et de mettre à disposition des bornes vocales d'information citoyenne dans les quartiers défavorisés et les zones rurales enclavées.
                """.trimIndent(),
                contentHt = """
                    1. Kraze baryè pou moun ki pa konn li ak ekri :
                    Prèske 40 % nan granmoun nan peyi a gen gwo difikilte pou li ak ekri. Sa te toujou anpeche plizyè milyon frè ak sè nou sèvi ak sèvis labank, fè papye nan leta oswa aprann sou entènèt paske tout bagay te ekri sou papye oswa sou ekran. Jodi a, entèlijans atifisyèl pote yon gwo delivrans pou tout moun sa yo.
                    
                    2. Pale ak telefòn nan ak bèl vwa Kreyòl nou an :
                    Gras ak zouti ki ka tande sa w di (Speech-to-Text) epi ki ka reponn ou ak yon bèl vwa Kreyòl natirèl (Text-to-Speech), menm yon moun ki pa janm al lekòl ka senpleman pale ak telefòn li pou l fè tout sa l bezwen fè san l pa bezwen èd pèsonn :
                    - Konnen konbyen kòb li genyen nan AJ-Pay oswa AJ-Wallet epi voye kòb bay fanmi l ;
                    - Mande ki pri mayi ak pwa ye nan mache a oswa si wout la pa gen danje ;
                    - Tande yon bèl leson oswa konsèy doktè sou fason pou l pran swen yon timoun ki malad.
                    
                    3. Wòl espesyal AJ-Fondation nan katye ak pwovens yo :
                    Se pa nan biwo sèlman pou bèl bagay sa yo rete. Gras ak antite filantwopik AJ-Fondation, nou gen plan pou n al nan katye popilè ak zòn ki lwen yo pou montre tout moun kijan pou yo sèvi ak zouti sa yo gratis pou pèsonn pa rete nan fènwa.
                """.trimIndent(),
                plannedStartPage = 161,
                plannedEndPage = 163,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 119 : Les limites et les risques de l’IA ====================
            BookChapter(
                id = "ch_8_119",
                chapterNumber = 119,
                partId = "part_8",
                titleFr = "Chapitre 119 — Les limites et les risques de l’IA",
                titleHt = "Chapit 119 — Limit ak risk IA",
                subtitleFr = "Hallucinations, biais culturels, dépendance technologique, coût et vulnérabilités de sécurité",
                subtitleHt = "Manti envante, move prejije, depandans sou lòt nasyon, gwo depans ak danje sekirite",
                summaryFr = "Examen critique et sans complaisance des risques de l'IA : fausses informations générées, colonialisme numérique, fragilités de sécurité et consommation électrique exorbitante.",
                summaryHt = "Gade tout danje IA nan je : move enfòmasyon ki sanble vre, depandans sou founisè etranje, move itilizasyon pa pirat ak depans kouran ki twò wo.",
                contentFr = """
                    1. Refuser l'aveuglement technophile :
                    Une démarche scientifique authentique exige de regarder avec la plus grande lucidité les faiblesses structurelles des outils que nous concevons. L'intelligence artificielle n'est ni omnisciente ni infaillible. Présenter l'IA comme une solution magique capable de résoudre instantanément les maux d'Haïti relèverait de l'escroquerie intellectuelle. Ses limites techniques, énergétiques et sociétales sont considérables.
                    
                    2. La cartographie des risques majeurs :
                    - Les hallucinations factuelles : des réponses inventées de toutes pièces présentées avec un ton docte et persuasif, capables d'induire en erreur des étudiants, des juristes ou des techniciens ;
                    - Les biais discriminatoires et culturels : des modèles formés sur des corpus occidentaux qui reproduisent des stéréotypes dégradants sur Haïti et son histoire révolutionnaire ;
                    - La dépendance stratégique (Vendor Lock-in) : lier l'infrastructure numérique d'un pays à des API propriétaires étrangères soumises à des hausses tarifaires unilatérales ou à des restrictions géopolitiques soudaines ;
                    - Le coût financier et énergétique : l'entraînement et l'inférence des modèles géants consomment des mégawatts d'énergie et des millions de dollars, une équation intenable pour Haïti sans une orientation stricte vers des modèles frugaux et optimisés ;
                    - Les risques de sécurité et de cybercriminalité : utilisation d'outils génératifs pour concevoir des campagnes de désinformation massive, des arnaques par hameçonnage vocal (Voice Phishing) ou pour sonder les vulnérabilités de nos applications.
                    
                    3. La posture d'AJ-TECH : prudence, audit et contrôle :
                    Face à ces périls, notre mot d'ordre demeure la retenue d'ingénierie. Chaque composant intégrant de l'IA fait l'objet de tests de robustesse (Red Teaming), de garde-fous stricts et d'une surveillance continue. La meilleure défense reste l'éducation critique de nos utilisateurs.
                """.trimIndent(),
                contentHt = """
                    1. Pa kite bèl pawòl bouche je nou :
                    Lè w se yon vrè syantifik, ou dwe gade tout feblès zouti w ap bati a aklè. Entèlijans atifisyèl pa konn tout bagay, li konn fè erè, epi li pa yon baton majik ki pral chanje peyi a nan yon sèl nuit. Si yon moun di w konsa IA pa gen danje, se manti l ap ba ou. Li gen anpil limit ak gwo danje fòk nou konnen.
                    
                    2. Gwo danje fòk nou veye yo byen :
                    - Manti ki sanble ak verite (alisinasyon) : sistèm nan ka envante yon gwo manti ak tout fòs li, sa ka twonpe elèv lekòl, avoka oswa enjenyè si yo pa verifye ;
                    - Move prejije sou peyi nou : kòm zouti yo te fèt lòt bò dlo, yo ka repete vye koze ak manti sou listwa peyi d Ayiti ak zansèt nou yo ;
                    - Depann twòp sou gwo konpayi etranje : si nou bati tout bagay sou sèvis etranje sèlman, jou yo deside fèmen l oswa monte pri a, tout peyi a ka rete bloke nan fènwa ;
                    - Gwo depans kouran ak lajan : gwo modèl sa yo mande twòp kouran ak twòp lajan, yon bagay rezo kouran EDH ak pòch moun pa ka sipòte si nou pa kreye ti modèl senp ki pa koute chè ;
                    - Vòlè ak pirat nimerik : move moun ka sèvi ak IA pou vòlè vwa moun, fè fo mesaj sou WhatsApp pou vòlè kòb oswa atake aplikasyon nou yo.
                    
                    3. Desizyon AJ-TECH : veye ak prekosyon :
                    Pou n pare tout danje sa yo, nou teste chak ti kòd avèk anpil atansyon, nou mete baryè sekirite solid, epi nou toujou ankouraje moun yo sèvi ak lespri yo pou verifye tout bagay anvan yo kwè sa yon machin di yo.
                """.trimIndent(),
                plannedStartPage = 163,
                plannedEndPage = 164,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 120 : Préparer Haïti à l’économie de l’IA ====================
            BookChapter(
                id = "ch_8_120",
                chapterNumber = 120,
                partId = "part_8",
                titleFr = "Chapitre 120 — Préparer Haïti à l’économie de l’IA",
                titleHt = "Chapit 120 — Prepare Ayiti pou ekonomi IA",
                subtitleFr = "Formation des ingénieurs, synergie avec EDH, recherche appliquée et emplois du futur",
                subtitleHt = "Fòmasyon jèn enjenyè, travay ansanm ak EDH, rechèch pratik ak nouvo metye demen",
                summaryFr = "Plan d'action national pour l'insertion d'Haïti dans l'économie mondiale de l'intelligence artificielle : synergie université-entreprise, incubation et compétences d'avenir.",
                summaryHt = "Gwo plan aksyon pou mete jèn ayisyen nan premye liy ekonomi mondyal IA : fòmasyon espesyalize nan EDH, pwojè pratik ak kreyasyon valè lakay nou.",
                contentFr = """
                    1. Le tsunami économique mondial et l'obsolescence des compétences :
                    Dans les dix prochaines années, l'automatisation cognitive redéfinira la division internationale du travail. Les emplois intellectuels répétitifs (traduction basique, télémarketing, saisie comptable, rédaction standard) seront massivement absorbés par les algorithmes. Si la jeunesse haïtienne n'est formée qu'à ces tâches de premier niveau, elle se retrouvera massivement au chômage technique. Nous devons impérativement élever le niveau de qualification de nos talents vers les métiers de l'ingénierie avancée de l'IA.
                    
                    2. Les trois piliers de notre stratégie de formation nationale :
                    - L'ingénierie des invites et l'orchestration (Prompt Engineering & Tool Calling) : apprendre aux étudiants à dialoguer avec précision avec les modèles et à orchestrer des chaînes d'agents autonomes ;
                    - Le Fine-tuning et le MLOps frugal : former nos développeurs à réentraîner des modèles ouverts légers sur des données locales et à les déployer en production sur des architectures sobres et résilientes ;
                    - L'éthique, la gouvernance et la sécurité des données : doter nos cadres des compétences juridiques et méthodologiques pour auditer les algorithmes et protéger le patrimoine numérique de nos institutions.
                    
                    3. Le rôle structurant de l'EDH (École de Développement d'Haïti) :
                    À travers notre entité académique EDH, nous posons les fondations d'un programme d'excellence dédié à l'IA appliquée. En connectant nos cohortes d'étudiants aux projets réels des 22 entités d'AJ-TECH, nous transformons des apprenants théoriques en concepteurs opérationnels, prêts à créer des startups technologiques et à valoriser le génie haïtien sur le marché mondial.
                """.trimIndent(),
                contentHt = """
                    1. Gwo chanjman nan travay ak danje pou jèn yo :
                    Nan 10 lane k ap vini yo, tout metye sou latè ap chanje fòm. Travay senp moun te konn fè nan biwo tankou tradui ti tèks senp, reponn telefòn pou fè piblisite oswa tape menm papye pral fèt pa machin. Si jèn Ayisyen pa aprann fè travay ki pi avanse, yo pap ka jwenn travay nan mond demen an. Se devwa nou pou n fòme yo sou vrè konesans teknik solid ki gen valè.
                    
                    2. Twa gwo konesans fòk jèn nou yo metrize :
                    - Aprann pale byen ak machin nan (Prompt Engineering) : konnen kijan pou w bay sistèm nan bon lòd klè pou l fè travay konplike san erè ;
                    - Aprann antrene ti modèl pou peyi a (Fine-tuning ak MLOps) : konn kijan pou w pran yon ti modèl gratis, mete bon done Kreyòl ladan l epi fè l mache sou ti machin ki pa chè ;
                    - Konnen lwa ak etik nimerik : aprann kijan pou w pwoteje done moun yo, verifye si lojisyèl yo pa gen danje epi defann dwa sitwayen yo.
                    
                    3. Wòl espesyal EDH (École de Développement d'Haïti) :
                    Gras ak lekòl teknoloji nou an ki se EDH, nou mete yon bèl pwogram fòmasyon sou pye pou prepare jèn yo. Elèv yo pap sèlman chita nan teyori : y ap travay tou dwat sou 22 antite nan ekosistèm AJ-TECH la pou yo ka aprann kreye pwòp konpayi pa yo epi montre tout lemonn bèl talan ki genyen nan peyi d Ayiti.
                """.trimIndent(),
                plannedStartPage = 164,
                plannedEndPage = 165,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 121 : Stratégie IA AJ-TECH 2026–2035 ====================
            BookChapter(
                id = "ch_8_121",
                chapterNumber = 121,
                partId = "part_8",
                titleFr = "Chapitre 121 — Stratégie IA AJ-TECH 2026–2035",
                titleHt = "Chapit 121 — Estrateji IA AJ-TECH 2026–2035",
                subtitleFr = "Feuille de route décennale en 4 phases : modèles frugaux, souveraineté linguistique et éthique",
                subtitleHt = "Plan 10 lane an 4 faz : ti modèl ki pa lou, defans kilti ak lang Kreyòl epi bon moral",
                summaryFr = "Feuille de route en 4 phases pour l'intégration progressive, sobre et souveraine de l'IA au sein d'AJ-TECH entre 2026 et 2035, fondée sur des engagements réels et mesurables.",
                summaryHt = "Plan 4 faz pou entegre IA ti pa ti pa nan AJ-TECH ant 2026 ak 2035, sou baz verite, respè resous nou yo ak defans idantite kiltirèl nou.",
                contentFr = """
                    1. Le sens d'une feuille de route décennale :
                    Bâtir une filière technologique pérenne ne s'improvise pas au gré des effets de mode éphémères. L'horizon 2026–2035 fixe le cap stratégique d'AJ-TECH pour faire de notre écosystème un modèle d'ingénierie sobre, éthique et souveraine dans le domaine de l'intelligence artificielle appliquée.
                    
                    2. Les 4 phases de la stratégie IA 2026–2035 :
                    
                    - Phase 1 (2026–2027) — Prototypage frugal et assistance locale :
                      - Intégration de petits modèles locaux (On-Device SLM) dans les PWA AJ-Task, EDUKA et AJ-Dev ;
                      - Développement et stabilisation du prototype bilingue d'AJ-Assistant en mode hybride ;
                      - Constitution méthodique des premiers jeux de données d'apprentissage bilingues (FR / HT) conformes aux standards académiques.
                    
                    - Phase 2 (2028–2030) — Souveraineté linguistique et démocratisation vocale :
                      - Entraînement et mise à disposition libre de modèles de transcription vocale (Speech-to-Text) et de synthèse vocale (Text-to-Speech) de haute précision pour le créole haïtien ;
                      - Déploiement des assistants d'orientation santé dans AJ-Bioklin et des tuteurs d'apprentissage adaptatifs dans EDUKA et AJ-Learn ;
                      - Mise en place d'un comité indépendant d'éthique et d'audit algorithmique.
                    
                    - Phase 3 (2031–2033) — Déploiement transversal et automatisation distribuée :
                      - Intégration de modules d'optimisation prédictive dans l'ensemble des 22 entités officielles (gestion des flux logistiques, analyse financière responsable, réseaux de capteurs agricoles avec AJ-Tè) ;
                      - Interopérabilité sécurisée entre agents autonomes sous protocole de communication auditable ;
                      - Premiers partenariats académiques régionaux avec les universités de la Caraïbe et de la francophonie.
                    
                    - Phase 4 (2034–2035) — Rayonnement international et souveraineté logicielle accomplie :
                      - Positionnement d'AJ-TECH comme référence internationale incontournable pour l'ingénierie de l'IA en milieu contraint et à faible empreinte énergétique ;
                      - Exportation de solutions logicielles complètes auprès d'organisations d'Afrique, d'Amérique latine et des Caraïbes ;
                      - Pleine souveraineté technologique démontrant que le génie haïtien est capable d'éclairer l'avenir numérique mondial.
                    
                    3. Engagement de vérité et de détermination :
                    Ce calendrier ambitieux n'est pas une collection de promesses en l'air, mais notre cahier des charges public. Étape après étape, avec humilité, persévérance et foi dans le potentiel de notre jeunesse, nous transformerons cette vision en réalité tangible pour la nation haïtienne.
                """.trimIndent(),
                contentHt = """
                    1. Poukisa nou gen yon plan 10 lane :
                    Bati yon gwo ekosistèm teknoloji mande pasyans ak disiplin, se pa yon bagay moun ka fè nan kouri dèyè ti bri ki pase sou entènèt. Plan 2026–2035 lan se bousòl nou pou n mennen AJ-TECH vin yon gwo modèl entènasyonal pou lojisyèl entèlijan ki pa mande twòp kouran, ki fèt ak bon moral epi ki respekte kilti peyi nou.
                    
                    2. Kat gwo faz nan estrateji IA 2026–2035 lan :
                    
                    - Faz 1 (2026–2027) — Bati premye baz ak ti modèl senp :
                      - Mete ti modèl ki pa lou tou dwat nan telefòn moun nan pou ede nan AJ-Task, EDUKA ak AJ-Dev ;
                      - Fini epi byen teste premye pwototip AJ-Assistant ki pale Kreyòl ak Fransè a ;
                      - Ranmase premye bon tèks pwòp ni an Fransè ni an Kreyòl Ayisyen ki respekte règ Akademi Kreyòl la.
                    
                    - Faz 2 (2028–2030) — Defann lang Kreyòl la ak pale nan telefòn :
                      - Kreye pi bon zouti ki ka tande epi pale Kreyòl byen klè pou moun ki pa konn li ka sèvi ak telefòn yo fasil ;
                      - Mete ti asistan sante nan AJ-Bioklin ak pwofesè entèlijan nan EDUKA ak AJ-Learn ;
                      - Mete yon komite moun serye sou pye pou kontwole zouti yo pou yo pa janm fè erè oswa prejije.
                    
                    - Faz 3 (2031–2033) — Travay nan tout 22 antite yo nèt :
                      - Mete ti modèl entèlijan nan tout 22 antite ofisyèl yo pou ede nan biznis, nan kalkil kòb ak nan zafè agrikilti ak AJ-Tè ;
                      - Fè aplikasyon yo kominike ansanm an sekirite san okenn danje pou done moun yo ;
                      - Kòmanse travay ansanm ak gwo inivèsite nan Karayib la ak nan lòt peyi ki pale Fransè.
                    
                    - Faz 4 (2034–2035) — Fè non Ayiti klere nan lemonn antye :
                      - Fè AJ-TECH tounen yon gwo modèl mondyal pou teknoloji entèlijan ki mache kote ki pa gen gwo kouran ni gwo entènèt ;
                      - Vann bèl aplikasyon solid nou yo bay lòt peyi ann Afrik, nan Amerik Latin ak nan Karayib la ;
                      - Montre tout nasyon sou latè entèlijans jèn Ayisyen ka kreye gwo zouti pou ede tout limanite avanse.
                    
                    3. Angajman nou devan tout peyi a :
                    Dat sa yo se pa bèl rèv nou lage anlè, se travay n ap fè chak jou ti pa ti pa ak tout kè nou. Ak anpil kouraj, disiplin ak lafwa nan Bondye ak nan jèn peyi nou, n ap reyalize gwo vizyon sa a pou fyète Ayiti.
                """.trimIndent(),
                plannedStartPage = 165,
                plannedEndPage = 166,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            )
        )
    )
}

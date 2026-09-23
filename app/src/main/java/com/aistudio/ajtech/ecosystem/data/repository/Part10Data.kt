package com.aistudio.ajtech.ecosystem.data.repository

import com.aistudio.ajtech.ecosystem.data.model.BookChapter
import com.aistudio.ajtech.ecosystem.data.model.BookContentStatus
import com.aistudio.ajtech.ecosystem.data.model.BookPart
import com.aistudio.ajtech.ecosystem.data.model.PartType

/**
 * PARTIE X — DIASPORA, RAYONNEMENT INTERNATIONAL ET EXPANSION
 * PATI X — DYASPORA, RAYONNMAN ENTÈNASYONAL AK EKSPANSYON
 * Chapitres 137 à 151 (Exactement 15 chapitres, pp. 183–198).
 */
object Part10Data {

    val part10: BookPart = BookPart(
        id = "part_10",
        partNumber = 10,
        type = PartType.MAIN_PART,
        titleFr = "PARTIE X — DIASPORA, RAYONNEMENT INTERNATIONAL ET EXPANSION",
        titleHt = "PATI X — DYASPORA, RAYONNMAN ENTÈNASYONAL AK EKSPANSYON",
        subtitleFr = "Construire des ponts entre Haïti, sa diaspora et le monde par la technologie",
        subtitleHt = "Konstwi pon ant Ayiti, dyaspora li ak lemonn atravè teknoloji",
        plannedPages = "pp. 183–198",
        status = BookContentStatus.IN_PROGRESS,
        chapters = listOf(
            // ==================== CHAPITRE 137 : Haïti et le potentiel d’un écosystème numérique ouvert ====================
            BookChapter(
                id = "ch_10_137",
                chapterNumber = 137,
                partId = "part_10",
                titleFr = "Chapitre 137 — Haïti et le potentiel d’un écosystème numérique ouvert",
                titleHt = "Chapit 137 — Ayiti ak potansyèl yon ekosistèm nimerik ouvè",
                subtitleFr = "Opportunités, défis structurels et construction méthodique : dépasser les mythes pour forger une réalité technologique",
                subtitleHt = "Opòtinite, gwo defi ak travay metodik : depase vye pawòl anlè pou bati vrè reyalite teknolojik la",
                summaryFr = "Analyse lucide du potentiel numérique d'Haïti : une jeunesse inventive et connectée, confrontée aux contraintes énergétiques et télécoms, ouvrant la voie à des architectures résilientes et ouvertes.",
                summaryHt = "Analiz reyalis sou chans Ayiti genyen nan zafè nimerik : jèn ki gen anpil lide ak kouraj, men ak gwo defi kouran ak entènèt pou n simonte ak travay.",
                contentFr = """
                    1. Le potentiel réel du pays :
                    Haïti dispose d'un capital démographique exceptionnel où plus de 60 % de la population a moins de trente ans. Cette jeunesse fait preuve d'une agilité remarquable dans l'adoption des téléphones mobiles et des réseaux sociaux, démontrant une soif d'émancipation et d'apprentissage par le numérique.
                    
                    2. Lucidité sur l'état du marché et les défis structurels :
                    Il serait illusoire de masquer les contraintes réelles :
                    - La fracture énergétique et l'instabilité du réseau électrique national ;
                    - Le coût élevé et la volatilité de la connectivité Internet mobile ;
                    - L'absence quasi-totale d'infrastructures locales de centres de données (data centers) ;
                    - Un marché intérieur aux revenus limités, nécessitant des modèles économiques sobres et inclusifs.
                    
                    3. La philosophie de l'écosystème numérique ouvert :
                    Pour surmonter ces obstacles sans attendre des solutions miracles, AJ-TECH prône une approche d'écosystème ouvert fondée sur :
                    - La conception logicielle résiliente (Offline-First, faible empreinte mémoire) ;
                    - L'interopérabilité stricte permettant aux initiatives locales de coopérer sans monopole prédateur ;
                    - La transparence documentaire absolue pour instaurer la confiance avec les citoyens, les étudiants et les partenaires.
                """.trimIndent(),
                contentHt = """
                    1. Vrè fòs peyi Dayiti genyen :
                    Ayiti gen yon gwo richès nan jèn li yo : plis pase 60% moun nan popilasyon an gen mwens pase 30 lane. Jèn sa yo renmen telefòn ak teknoloji, yo aprann vit epi yo anvi kreye bèl bagay pou chanje lavi yo ak peyi a.
                    
                    2. Gade verite a nan je san kache anyen :
                    Nou pa dwe bay manti sou jan sitiyasyon an ye jodi a :
                    - Mank kouran regilye ak pwoblèm enèji nan peyi a ;
                    - Entènèt ki koute chè epi ki konn koupe souvan ;
                    - Pa gen gwo sant sèvè nasyonal ki konstwi pou sere done yo ;
                    - Pifò moun nan peyi a pa gen gwo mwayen lajan, sa vle di fòk aplikasyon yo pa koute chè.
                    
                    3. Poukisa nou bezwen yon ekosistèm nimerik ouvè :
                    Pou n ka vanse malgre tout difikilte sa yo, AJ-TECH chwazi yon wout entèlijan :
                    - Bati aplikasyon ki ka mache menm san entènèt (Offline-First) epi ki pa pran anpil espas ;
                    - Fè lojisyèl yo ka pale youn ak lòt san okenn baryè pou tout moun ka kolabore ;
                    - Ekri tout verite sou sa k fèt tout bon pou tout jèn ak patnè ka gen konfyans nan nou.
                """.trimIndent(),
                plannedStartPage = 183,
                plannedEndPage = 183,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 138 : La diaspora haïtienne comme force technologique ====================
            BookChapter(
                id = "ch_10_138",
                chapterNumber = 138,
                partId = "part_10",
                titleFr = "Chapitre 138 — La diaspora haïtienne comme force technologique",
                titleHt = "Chapit 138 — Dyaspora ayisyen an kòm yon fòs teknolojik",
                subtitleFr = "Capital humain, expertise mondiale et transmission : mobiliser les compétences pour accélérer l'écosystème local",
                subtitleHt = "Kapasite, gwo konesans mondyal ak transmisyon : pote ekspètiz entènasyonal pou ede jèn k ap monte yo",
                summaryFr = "La diaspora haïtienne ne se limite pas à des transferts financiers : elle regroupe des ingénieurs, chercheurs et cadres dans les plus grands pôles mondiaux, prêts à transmettre leur expertise.",
                summaryHt = "Dyaspora ayisyen an se pa voye transfè lajan sèlman : li gen gwo enjenyè, devlopè ak espesyalis nan gwo konpayi mondyal ki pare pou fòme jèn yo epi sipòte pwojè yo.",
                contentFr = """
                    1. Redéfinir le rôle stratégique de la diaspora :
                    Historiquement perçue comme un soutien financier direct aux familles, la diaspora haïtienne rassemble aujourd'hui une communauté dynamique d'ingénieurs en logiciels, d'architectes cloud, de chercheurs en intelligence artificielle et de chefs d'entreprise répartis en Amérique du Nord, en Europe, dans la Caraïbe et en Amérique latine.
                    
                    2. Le transfert de compétences et le mentorat :
                    La véritable valeur de la diaspora réside dans le capital intellectuel et les méthodologies professionnelles acquises au contact d'environnements technologiques de pointe :
                    - Transmission des standards d'ingénierie (Clean Architecture, CI/CD, tests automatisés) ;
                    - Accompagnement bienveillant des étudiants et autodidactes locaux formés notamment via EDH et la plateforme éducative EDUKA ;
                    - Partage de retours d'expérience sur la gestion de projet et l'agilité organisationnelle.
                    
                    3. Un partenariat basé sur le respect mutuel :
                    La collaboration entre la diaspora et les talents locaux doit reposer sur l'écoute et l'humilité : les développeurs vivant en Haïti maîtrisent les réalités du terrain et les contraintes opérationnelles, tandis que la diaspora apporte une perspective internationale indispensable.
                """.trimIndent(),
                contentHt = """
                    1. Chanje jan moun wè wòl dyaspora a :
                    Moun te konn wè dyaspora a sèlman pou voye ti kòb pou ede fanmi. Jodi a, gen yon bann enjenyè lojisyèl, espesyalis sou sèvè, chèchè nan entèlijans atifisyèl ak lidè antrepriz ki soti an Ayiti epi k ap travay nan pi gwo konpayi nan peyi Etazini, Kanada, Ewòp ak nan Karayib la.
                    
                    2. Pataje konesans ak gide jèn yo :
                    Pi gwo richès dyaspora a ka bay, se sa yo gen nan tèt yo ak bon jan eksperyans travay yo :
                    - Montre jèn yo kijan pou yo ekri kòd ki pwòp, teste pwogram yo epi travay tankou gwo pwofesyonèl ;
                    - Ede etidyan ak jèn ki fòme tèt yo nan EDH ak sou platfòm EDUKA pou yo monte nan nivo pi vit ;
                    - Pataje konsèy sou jan yo jere gwo pwojè ak kijan pou yo dirije yon ekip.
                    
                    3. Travay men nan men ak respè :
                    Relasyon ant dyaspora a ak moun k ap viv nan peyi a dwe fèt sou baz respè mityèl : jèn ki an Ayiti yo konnen reyalite tè a pi byen, epi dyaspora a pote eksperyans entènasyonal ki nesesè anpil.
                """.trimIndent(),
                plannedStartPage = 184,
                plannedEndPage = 184,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 139 : Connecter les talents haïtiens du monde ====================
            BookChapter(
                id = "ch_10_139",
                chapterNumber = 139,
                partId = "part_10",
                titleFr = "Chapitre 139 — Connecter les talents haïtiens du monde",
                titleHt = "Chapit 139 — Konekte talan ayisyen ki nan lemonn",
                subtitleFr = "Réseaux professionnels, communautés de pratique et collaboration à distance par les outils numériques",
                subtitleHt = "Rezo pwofesyonèl, kominote travay ak koutmen a distans grasa zouti nimerik",
                summaryFr = "Création de canaux pérennes de communication et de collaboration entre professionnels haïtiens de l'étranger et développeurs émergents en Haïti.",
                summaryHt = "Mete bonjan rezo pou konekte espesyalis lòtbò dlo ak jèn devlopè nan peyi a pou fè fòmasyon, bay konsèy epi kode ansanm.",
                contentFr = """
                    1. Briser l'isolement géographique :
                    Pendant longtemps, la distance géographique a constitué une barrière infranchissable entre les cerveaux haïtiens expatriés et ceux restés au pays. Les outils de travail collaboratif contemporains (Git, messageries chiffrées, visioconférences, revues de code asynchrones) permettent désormais de créer un continuum de travail sans friction.
                    
                    2. Structurer des réseaux professionnels d'ingénieurs :
                    AJ-TECH milite pour la création de collectifs ouverts et de cercles techniques thématiques :
                    - Groupes de travail sur le développement Android moderne et Jetpack Compose ;
                    - Cercles d'études sur l'IA frugale et le traitement automatique du Kreyòl Ayisyen ;
                    - Communautés de cybersécurité focalisées sur la protection des données et des infrastructures critiques.
                    
                    3. Le mentorat comme passerelle intergénérationnelle :
                    Un ingénieur sénior de la diaspora peut guider trois à cinq jeunes développeurs locaux à travers des revues de code régulières, leur permettant d'atteindre en quelques mois le niveau technique exigé par les entreprises internationales.
                """.trimIndent(),
                contentHt = """
                    1. Kraze baryè distans la :
                    Pandan lontan, distans te fè li difisil anpil pou ayisyen lòtbò dlo kolabore ak sa ki nan peyi a. Jodi a, ak zouti modèn tankou Git, kominikasyon sekirize ak videyo sou entènèt, nou ka travay ansanm san okenn difikilte kèlkeswa kote nou ye.
                    
                    2. Òganize kominote devlopè ak espesyalis :
                    AJ-TECH ankouraje tout moun rasanble nan gwoup travay ki klè :
                    - Gwoup k ap travay sou aplikasyon Android modèn ak Compose ;
                    - Gwoup k ap etidye entèlijans atifisyèl ki konprann Kreyòl Ayisyen ;
                    - Gwoup ki konsantre sou sekirite enfòmatik pou pwoteje done ak sistèm yo.
                    
                    3. Bay jèn yo koutmen ak konsèy :
                    Yon enjenyè ki gen anpil eksperyans nan dyaspora a ka pran 3 a 5 jèn anba zèl li, gade kòd yo ekri chak semèn epi ba yo konsèy pou yo ka rive nan menm nivo ak pi bon devlopè nan lemonn.
                """.trimIndent(),
                plannedStartPage = 185,
                plannedEndPage = 185,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 140 : Le travail numérique sans frontières ====================
            BookChapter(
                id = "ch_10_140",
                chapterNumber = 140,
                partId = "part_10",
                titleFr = "Chapitre 140 — Le travail numérique sans frontières",
                titleHt = "Chapit 140 — Travay nimerik san fwontyè",
                subtitleFr = "Télétravail, freelancing et équipes distribuées : transformer les compétences locales en opportunités mondiales",
                subtitleHt = "Travay a distans, kontra lib ak ekip dispèse : transfòme talan lokal yo an opòtinite sou tout mache mondyal",
                summaryFr = "Le travail numérique et le travail à distance comme vecteurs d'inclusion économique : exporter des lignes de code et des services plutôt que contraindre les talents à l'exil.",
                summaryHt = "Kijan travay nimerik san fwontyè pèmèt jèn yo rete lakay yo, touche nan deviz epi vann sèvis enfòmatik bay gwo konpayi etranje.",
                contentFr = """
                    1. La révolution du travail distribué :
                    L'expansion du travail à distance et des modèles asynchrones constitue l'une des opportunités économiques les plus transformatrices pour la jeunesse haïtienne. Pour la première fois dans l'histoire, un jeune professionnel peut percevoir des revenus internationaux en devises tout en vivant en Haïti et en participant activement à l'économie locale.
                    
                    2. Les formes contemporaines du travail numérique :
                    - Le freelancing et les prestations logicielles spécialisées auprès d'entreprises étrangères ;
                    - L'intégration au sein d'équipes techniques internationales distribuées en télétravail complet ;
                    - La maintenance applicative, l'assurance qualité (QA) et les tests automatisés ;
                    - La création de micro-services et de modules réutilisables monétisés à l'échelle globale.
                    
                    3. Exigences et professionnalisme :
                    Cette liberté suppose une rigueur sans faille : maîtrise des fuseaux horaires, respect strict des engagements contractuels, communication écrite impeccable et autonomie dans la résolution de problèmes complexes.
                """.trimIndent(),
                contentHt = """
                    1. Gwo chanjman travay a distans la pote :
                    Kapasite pou travay a distans sou òdinatè se youn nan pi bèl chans jèn Ayisyen genyen jodi a. Pou premye fwa, yon jèn ka rete viv nan peyi l, kode sou òdinatè l epi touche bon kòb nan lajan etranje pandan l ap depanse l nan kominote l.
                    
                    2. Diferan fason moun travay sou nimerik san fwontyè :
                    - Travay sou kontra lib (freelancing) pou fè lojisyèl pou konpayi lòtbò dlo ;
                    - Travay a plen tan nan yon gwo ekip enjenyè ki dispèse toupatou nan lemonn ;
                    - Fè tès sou aplikasyon pou verifye si yo pa gen erè anvan yo soti ;
                    - Kreye ti sèvis oswa moso kòd solid pou vann bay lòt devlopè sou mache entènasyonal.
                    
                    3. Sa sa mande pou w reyisi :
                    Travay sa a mande anpil disiplin : respekte lè randevou, fini travay ou alè jan w te pwomèt la, konn ekri byen klè epi konn rezoud pwoblèm san w pa bezwen yon moun dèyè do w tout tan.
                """.trimIndent(),
                plannedStartPage = 186,
                plannedEndPage = 186,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 141 : Exporter le savoir-faire technologique haïtien ====================
            BookChapter(
                id = "ch_10_141",
                chapterNumber = 141,
                partId = "part_10",
                titleFr = "Chapitre 141 — Exporter le savoir-faire technologique haïtien",
                titleHt = "Chapit 141 — Ekspòte konesans teknolojik ayisyen",
                subtitleFr = "De la prestation de service aux produits propriétaires : valoriser l'ingénierie sobre et la résilience logicielle",
                subtitleHt = "Soti nan ti sèvis senp pou rive nan kreye bon pwodui : vann lojisyèl ki solid ak enjenyeri ki rezistan",
                summaryFr = "Méthodologie pour exporter des solutions technologiques conçues en Haïti : faire de nos contraintes de départ (bande passante limitée, instabilité réseau) un avantage concurrentiel mondial.",
                summaryHt = "Estrateji pou ekspòte konesans teknolojik ayisyen : vann bon lojisyèl ki ka mache san entènèt ak zouti enfòmatik efikas bay lòt peyi.",
                contentFr = """
                    1. Passer de la simple consommation à l'exportation technologique :
                    Haïti a trop longtemps été confinée au rôle de simple consommatrice de technologies conçues sous d'autres cieux. L'objectif stratégique d'AJ-TECH est d'inverser cette dynamique : concevoir localement des architectures logicielles compétitives et exporter notre savoir-faire.
                    
                    2. Transformer la contrainte en avantage distinctif :
                    Développer des applications dans le contexte haïtien oblige les ingénieurs à exceller là où d'autres échouent :
                    - Conception Offline-First native et tolérance extrême aux coupures réseau ;
                    - Optimisation drastique de la consommation de batterie et de la mémoire RAM ;
                    - Interfaces légères, rapides et immédiatement compréhensibles.
                    Ces qualités techniques sont particulièrement recherchées dans les marchés émergents de la Caraïbe, d'Amérique latine et d'Afrique subsaharienne.
                    
                    3. Les vecteurs d'exportation :
                    - Librairies open source et composants logiciels réutilisables ;
                    - Formations techniques certifiées et ingénierie pédagogique ;
                    - Produits applicatifs SaaS adaptés aux économies décentralisées.
                """.trimIndent(),
                contentHt = """
                    1. Sispann konsome sèlman, kòmanse ekspòte :
                    Pandan twòp tan, Ayiti te sèlman ap achte epi itilize teknoloji lòt moun kreye. Gwo objektif AJ-TECH se chanje sa nèt : kreye bon lojisyèl solid lakay nou epi vann konesans ak pwodui nou bay lòt nasyon.
                    
                    2. Fè difikilte nou yo tounen yon gwo fòs :
                    Lè w ap devlope lojisyèl an Ayiti, ou oblije fò anpil nan bagay lòt moun pa menm panse :
                    - Fè lojisyèl la mache nèt san entènèt (Offline-First) epi senkronize lè rezo a tounen ;
                    - Fè aplikasyon an pa vide batri telefòn lan epi li pa pran twòp memwa ;
                    - Fè ekran yo senp, bèl epi fasil pou tout moun konprann touswit.
                    Kapasite sa yo gen anpil valè pou peyi nan Karayib la, Amerik Latin ak Lafrik ki gen menm reyalite avèk nou.
                    
                    3. Kisa nou ka ekspòte :
                    - Bon moso kòd ak bibliyotèk louvri ke lòt devlopè bezwen ;
                    - Bon kou ak fòmasyon sou fason pou kode lojisyèl ki reziste ;
                    - Aplikasyon konplè ki ede ti antrepriz ak kominote yo fonksyone pi byen.
                """.trimIndent(),
                plannedStartPage = 187,
                plannedEndPage = 187,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 142 : Construire des produits pensés pour plusieurs marchés ====================
            BookChapter(
                id = "ch_10_142",
                chapterNumber = 142,
                partId = "part_10",
                titleFr = "Chapitre 142 — Construire des produits pensés pour plusieurs marchés",
                titleHt = "Chapit 142 — Konstwi pwodui ki fèt pou plizyè mache",
                subtitleFr = "Internationalisation (i18n), localisation (l10n) et adaptation culturelle dès la première ligne de code",
                subtitleHt = "Lokalizasyon, lang, lajan ak kilti : prepare estrikti lojisyèl la depi nan kòmansman pou l adapte fasil",
                summaryFr = "Principes d'ingénierie logicielle pour l'internationalisation et la localisation : gestion multi-devises, multilinguisme dynamique, conformité légale et sensibilité culturelle.",
                summaryHt = "Règ teknik pou lojisyèl ki dwe mache nan plizyè peyi : separe tèks ak kòd, jere lajan diferan, zòn lè, ak respè lwa sou vi prive chak teritwa.",
                contentFr = """
                    1. La rigueur technique de l'internationalisation (i18n) :
                    Un logiciel ne peut s'exporter s'il est conçu de manière rigide. Dès la phase de prototypage, chaque composant doit séparer strictement la logique métier des chaînes de texte et des paramètres régionaux :
                    - Externalisation des ressources textuelles dans des fichiers dédiés sans chaînes codées en dur ;
                    - Prise en charge universelle de l'encodage UTF-8 et gestion des particularités typographiques ;
                    - Formatage dynamique des dates, heures et unités de mesure selon la locale de l'utilisateur.
                    
                    2. La localisation (l10n) et l'adaptation aux contextes régionaux :
                    - Gestion native de devises multiples (Gourde haïtienne HTG, Dollar américain USD, Euro EUR, etc.) ;
                    - Prise en compte des contraintes réglementaires locales (protection des données personnelles, RGPD, fiscalité numérique) ;
                    - Adaptation de l'expérience utilisateur (UX) aux habitudes culturelles et aux métaphores visuelles de chaque public cible.
                    
                    3. L'approche modulaire d'AJ-TECH :
                    Construire des moteurs applicatifs génériques dont les couches d'interface et de configuration peuvent être ajustées en quelques jours pour un nouveau territoire sans réécrire le cœur applicatif.
                """.trimIndent(),
                contentHt = """
                    1. Prepare kòd la depi nan premye jou (i18n) :
                    Yon lojisyèl pa ka vann nan lòt peyi si li pa t fèt pou sa depi nan rasin li. Se poutèt sa, depi nan premye liy kòd, fòk ou separe sa aplikasyon an ap fè ak tèks li montre sou ekran an :
                    - Mete tout tèks yo nan dosye apa pou yo ka tradui fasil san manyen kòd la ;
                    - Sèvi ak estanda UTF-8 pou tout aksan ak karaktè Kreyòl ka parèt byen pwòp ;
                    - Montre dat, lè ak distans jan moun nan peyi kote itilizatè a ye a abitye wè l.
                    
                    2. Adapte lojisyèl la ak chak mache (l10n) :
                    - Jere plizyè lajan byen fasil (Goud HTG, Dola USD, Ewo EUR) ;
                    - Respekte lwa chak peyi sou zafè pwoteje enfòmasyon prive sitwayen yo ;
                    - Chwazi desen ak fason paj yo prezante pou moun nan diferan kilti santi yo alèz.
                    
                    3. Jan AJ-TECH kode pwojè l yo :
                    Bati motè aplikasyon an yon fason pou n ka chanje lang ak opsyon yo an kèk minit pou yon nouvo peyi san n pa bezwen re-ekri tout aplikasyon an depi nan zewo.
                """.trimIndent(),
                plannedStartPage = 188,
                plannedEndPage = 188,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 143 : Le bilinguisme et le multilinguisme comme avantage ====================
            BookChapter(
                id = "ch_10_143",
                chapterNumber = 143,
                partId = "part_10",
                titleFr = "Chapitre 143 — Le bilinguisme et le multilinguisme comme avantage",
                titleHt = "Chapit 143 — Bilengwis ak miltilengwis kòm yon avantaj",
                subtitleFr = "Français, Kreyòl et passerelles mondiales : faire de la diversité linguistique un levier d'expansion stratégique",
                subtitleHt = "Fransè, Kreyòl ak ouvèti sou lemonn : sèvi ak richès lang nou yo pou n antre nan mache Anglè, Panyòl ak Pòtigè",
                summaryFr = "Le bilinguisme constitutionnel d'Haïti comme tremplin d'exportation : synergie Kreyòl/Français, et transition aisée vers l'Anglais et l'Espagnol dans la région Caraïbe-Amériques.",
                summaryHt = "Kijan pale de lang ofisyèl (Kreyòl ak Fransè) se yon gwo kado pou kominike ak mond frankofòn lan, epi fasilite aprann Anglè ak Panyòl pou komès ak vwazen nou yo.",
                contentFr = """
                    1. Une singularité linguistique à haute valeur géopolitique :
                    Haïti est le seul État indépendant des Amériques doté du Français et du Kreyòl Ayisyen comme langues officielles. Cette situation unique confère à nos développeurs une double appartenance stratégique :
                    - L'accès naturel à l'espace de la Francophonie économique mondiale (plus de 300 millions de locuteurs en Europe, en Afrique et au Canada) ;
                    - Une fierté identitaire inaltérable à travers la promotion d'outils numériques souverains en Kreyòl.
                    
                    2. Passerelles régionales vers l'Anglais et l'Espagnol :
                    Implantée au cœur de la Caraïbe, Haïti côtoie des marchés majeurs anglophones et hispanophones. La plasticité linguistique de notre jeunesse lui permet d'assimiler l'Anglais technique indispensable à l'industrie logicielle mondiale et l'Espagnol indispensable aux échanges avec la République Dominicaine et l'Amérique latine.
                    
                    3. L'engagement systématique d'AJ-TECH :
                    Chaque publication, chaque documentation et chaque écran développé par AJ-TECH est pensé de manière bilingue intégrale (Français et Kreyòl), préfigurant l'intégration progressive de l'Anglais et de l'Espagnol au fur et à mesure de l'expansion régionale.
                """.trimIndent(),
                contentHt = """
                    1. Yon gwo richès lang ki gen anpil valè :
                    Ayiti se sèl peyi nan tout zòn lan ki gen ni Kreyòl ni Fransè kòm lang ofisyèl. Sa bay jèn nou yo yon gwo avantaj sou lòt moun :
                    - Fasilite pou fè komès ak tout peyi ki pale Fransè nan mond lan (Ewòp, Kanada ak anpil peyi nan Lafrik) ;
                    - Yon gwo fyète nasyonal paske n ap kreye lojisyèl modèn nan pwòp lang Kreyòl nou an.
                    
                    2. Pon sou Anglè ak Panyòl nan Karayib la :
                    Kòm nou chita nan mitan Karayib la, nou tou pre peyi ki pale Anglè ak Panyòl. Jèn nou yo gen yon fasilite natirèl pou aprann Anglè ki se lang kòd ak òdinatè, ansanm ak Panyòl pou nou fè komès ak vwazen nou yo.
                    
                    3. Angajman AJ-TECH pran :
                    Tout paj liv, tout dokiman ak tout aplikasyon AJ-TECH fèt an de lang (Fransè ak Kreyòl Ayisyen), epi n ap prepare pou n ajoute Anglè ak Panyòl lè n ap vanse sou lòt mache nan rejyon an.
                """.trimIndent(),
                plannedStartPage = 189,
                plannedEndPage = 189,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 144 : Coopération technologique et partenariats responsables ====================
            BookChapter(
                id = "ch_10_144",
                chapterNumber = 144,
                partId = "part_10",
                titleFr = "Chapitre 144 — Coopération technologique et partenariats responsables",
                titleHt = "Chapit 144 — Koperasyon teknolojik ak patenarya responsab",
                subtitleFr = "Égalité, réciprocité et transfert de connaissances : dépasser les modèles d'assistance unilatérale",
                subtitleHt = "Respè mityèl, egalite ak transfè konesans : kite lojik asistans dèyè pou bati vrè relasyon travay solid",
                summaryFr = "Principes directeurs d'une coopération technologique internationale équitable : respect de la souveraineté, transparence absolue sur le stade actuel d'AJ-TECH et refus de la dépendance.",
                summaryHt = "Règ ak prensip etik pou fè koperasyon ak lòt peyi : kolabore san pèdi libète nou, di verite sou sa k fèt deja, epi pa siyen okenn kontra ki mare pye nasyon an.",
                contentFr = """
                    1. Sortir définitivement du modèle d'assistanat :
                    Trop souvent, les relations entre entités des pays du Sud et organisations internationales ont été marquées par une posture d'assistance paternaliste ou de dons d'équipements rapidement obsolètes. AJ-TECH récuse fermement ce schéma : la coopération technologique doit être un échange équitable entre pairs, fondé sur la co-construction et le respect mutuel.
                    
                    2. Principes fondamentaux d'un partenariat responsable :
                    - Souveraineté de la donnée : toute solution co-développée doit garantir que les données restent sous la juridiction et le contrôle d'Haïti ;
                    - Transfert de compétences réciproque : chaque initiative doit comporter un volet de formation approfondie garantissant l'autonomie locale complète ;
                    - Propriété intellectuelle partagée et respectueuse des créateurs haïtiens.
                    
                    3. Transparence documentaire sur la situation actuelle :
                    Conformément à notre charte éthique, AJ-TECH ne revendique à ce jour aucun accord bilatéral officiel ni contrat commercial international signé. Les perspectives de partenariat évoquées constituent une vision stratégique et une doctrine d'action pour les années futures.
                """.trimIndent(),
                contentHt = """
                    1. Kite lojik mande charite dèyè :
                    Twò souvan, relasyon ant peyi nou ak gwo òganizasyon entènasyonal te chita sou bay ti èd oswa kado vye òdinatè ki kraze vit. AJ-TECH pa nan lojik sa a ditou : koperasyon nan teknoloji dwe fèt tankou de patnè egalego k ap travay ansanm ak respè.
                    
                    2. Gwo prensip pou yon bon koperasyon responsab :
                    - Pwoteje done nasyon an : tout enfòmasyon sitwayen yo dwe rete anba kontwòl ak lwa peyi Dayiti ;
                    - Fòme jèn yo pou yo ka konn tout bagay poukont yo san depann sou pèsonn ;
                    - Pwoteje kreyasyon ak dwa tout devlopè ayisyen ki patisipe nan pwojè yo.
                    
                    3. Verite klè sou sitiyasyon jodi a :
                    Jan nou toujou di sa ak tout franchiz : jodi a, AJ-TECH pa gen okenn gwo kontra siyen ak okenn gouvènman etranje oswa gwo konpayi deyò. Sa n ap eksplike la a, se fason n ap travay pou demen lè chans sa yo va prezante.
                """.trimIndent(),
                plannedStartPage = 190,
                plannedEndPage = 190,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 145 : Capital, financement et croissance internationale ====================
            BookChapter(
                id = "ch_10_145",
                chapterNumber = 145,
                partId = "part_10",
                titleFr = "Chapitre 145 — Capital, financement et croissance internationale",
                titleHt = "Chapit 145 — Kapital, finansman ak kwasans entènasyonal",
                subtitleFr = "Bootstrapping éthique, investissement d'impact et rôle moteur de la diaspora : croître sans compromission",
                subtitleHt = "Fè wout ak pwòp fòs ou, envestisman pozitif ak patisipasyon dyaspora : grandi san pèdi prensip ou",
                summaryFr = "Les modèles financiers pour soutenir l'expansion technologique : autofinancement rigoureux (bootstrapping), fonds d'impact et mise au point transparente sur l'absence de financements spéculatifs pour AJ-TECH.",
                summaryHt = "Fason pou jwenn lajan pou pwojè teknoloji : travay ak ti mwayen, envestisman dyaspora, ak verite klè sou lefètke AJ-TECH pa resevwa okenn kòb envante.",
                contentFr = """
                    1. Le choix délibéré du bootstrapping :
                    La Silicon Valley a popularisé le culte de la levée de fonds massive et du capital-risque prédateur, souvent au détriment de la pérennité et de l'éthique. AJ-TECH a fait le choix inverse et courageux du bootstrapping : financer son émergence par le travail acharné de son fondateur, la sobriété opérationnelle et la valeur concrète produite.
                    
                    2. Les voies de financement vertueuses pour demain :
                    - L'épargne productive et les véhicules d'investissement de la diaspora ;
                    - Les subventions internationales compétitives pour la recherche en informatique et l'innovation frugale ;
                    - Les fonds d'investissement à impact (Impact Investing) mesurant leur réussite à l'aune des emplois créés et de l'utilité sociale réelle ;
                    - Les revenus directs générés par des produits logiciels fonctionnels et commercialisés équitablement.
                    
                    3. Déclaration formelle d'intégrité financière :
                    AJ-TECH atteste publiquement n'avoir reçu à ce jour aucun financement extérieur public ou privé, aucun investissement en capital-risque, ni contracté aucune dette. Cette indépendance totale garantit la pureté de notre mission patriotique.
                """.trimIndent(),
                contentHt = """
                    1. Chwazi vanse ak pwòp kouraj nou (Bootstrapping) :
                    Anpil gwo konpayi etranje renmen kouri dèyè gwo kòb envestisè prete yo, sa ki konn fè yo pèdi kontwòl epi bliye prensip yo. AJ-TECH chwazi yon lòt wout ki gen plis kouraj : vanse ak pwòp ti mwayen pa nou, travay di chak jou, epi bati bagay solid san fè dèt.
                    
                    2. Bonjan fason pou jwenn lajan pi devan :
                    - Ede dyaspora a mete lajan yo nan pwojè ki kreye vrè richès pou peyi a ;
                    - Patisipe nan gwo konkou entènasyonal pou jwenn kado lajan pou rechèch syantifik ;
                    - Chèche envestisè ki vle ede sosyete a vanse tout bon vre, pa sèlman moun k ap chèche fè gwo lajan rapid ;
                    - Vann bon sèvis ak bon lojisyèl ki itil moun pou antrepriz la ka gen pwòp revni pa l.
                    
                    3. Pawòl klè sou kòb AJ-TECH :
                    AJ-TECH di sa byen fò pou tout moun konnen : jouk jounen jodi a, nou pa t janm pran okenn kòb nan men okenn envestisè etranje oswa leta, epi nou pa gen okenn dèt sou do nou. Se sa ki ban nou libète pou n travay pou peyi nou ak tout kè nou.
                """.trimIndent(),
                plannedStartPage = 191,
                plannedEndPage = 191,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 146 : Souveraineté et ouverture au monde ====================
            BookChapter(
                id = "ch_10_146",
                chapterNumber = 146,
                partId = "part_10",
                titleFr = "Chapitre 146 — Souveraineté et ouverture au monde",
                titleHt = "Chapit 146 — Souvènte ak ouvèti sou lemonn",
                subtitleFr = "Protéger l'autonomie stratégique tout en adoptant les standards ouverts et les protocoles mondiaux",
                subtitleHt = "Pwoteje libète nasyon an pandan n ap itilize bon estanda ak pwotokòl ki louvri nan lemonn",
                summaryFr = "Comment concilier souveraineté technologique et ouverture internationale : s'appuyer sur l'Open Source, refuser l'enfermement propriétaire et maîtriser les briques critiques du numérique.",
                summaryHt = "Kijan pou n kenbe souvènte nimerik san n pa fèmen pòt sou lemonn : sèvi ak kòd louvri (Open Source), pa kite yon sèl gwo konpayi kontwole tout bagay, epi metrize tout zouti n ap itilize.",
                contentFr = """
                    1. La souveraineté n'est pas l'autarcie :
                    Revendiquer la souveraineté numérique pour Haïti ne signifie nullement rejeter les innovations du reste du monde ni chercher à réinventer la roue de manière isolée. Il s'agit plutôt d'acquérir la capacité critique de choisir, d'auditer et d'adapter les technologies que notre société utilise sans dépendre aveuglément de plateformes hégémoniques.
                    
                    2. L'Open Source comme bouclier stratégique :
                    L'utilisation rigoureuse de logiciels libres et de standards ouverts (Linux, Kotlin, Android Open Source Project, protocoles décentralisés) protège notre pays contre les risques d'embargo technologique, d'augmentation unilatérale des prix et d'enfermement propriétaire (vendor lock-in).
                    
                    3. Les trois piliers de l'ouverture souveraine :
                    - Maîtrise des protocoles de communication et d'échange de données ;
                    - Hébergement et chiffrement local des informations citoyennes sensibles ;
                    - Contribution active aux projets open source mondiaux pour faire entendre la voix des développeurs haïtiens.
                """.trimIndent(),
                contentHt = """
                    1. Souvènte pa vle di fèmen pòt sou lòt moun :
                    Lè n ap pale de souvènte nimerik pou Ayiti, sa pa vle di nou refize sa lòt nasyon fè oswa nou vle viv izole. Sa vle di nou vle gen bon enjenyè ki konprann kijan zouti yo mache, ki ka chwazi sa ki bon pou nou, epi ki pa kite gwo konpayi etranje enpoze sa yo vle sou nou.
                    
                    2. Sèvi ak lojisyèl lib (Open Source) pou pwoteje tèt nou :
                    Lè nou sèvi ak teknoloji kòd louvri tankou Linux, Kotlin ak Android, pèsonn pa ka fèmen sistèm nou yo yon jou maten, ni monte pri yo san nou pa ka di anyen. Se pi bon fason pou yon peyi rete mèt tèt li.
                    
                    3. Twa gwo prensip pou rete lib epi louvri :
                    - Metrize tout fason òdinatè yo voye enfòmasyon youn bay lòt ;
                    - Sere enfòmasyon prive pèp la nan peyi a ak bonjan kòd sekirite ;
                    - Pataje solisyon nou jwenn yo ak tout lòt devlopè sou latè pou montre sa nou konn fè.
                """.trimIndent(),
                plannedStartPage = 192,
                plannedEndPage = 192,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 147 : Standards internationaux et identité haïtienne ====================
            BookChapter(
                id = "ch_10_147",
                chapterNumber = 147,
                partId = "part_10",
                titleFr = "Chapitre 147 — Standards internationaux et identité haïtienne",
                titleHt = "Chapit 147 — Nòm entènasyonal ak idantite ayisyen",
                subtitleFr = "Qualité logicielle, conformité aux normes mondiales et expression authentique de notre culture dans le code",
                subtitleHt = "Bon kalite kòd, respè nòm entènasyonal ak mete kilti ak lang Kreyòl la nan gwo valè",
                summaryFr = "Adoption scrupuleuse des normes internationales (W3C, IETF, ISO, Material 3) tout en insufflant l'âme, les couleurs et la vision haïtienne au cœur de chaque interface numérique.",
                summaryHt = "Respekte tout gwo nòm entènasyonal nan zafè kòd ak sekirite, pandan n ap mete koulè, lang ak idantite Ayiti nan tout sa n ap bati.",
                contentFr = """
                    1. L'exigence intransigeante des standards internationaux :
                    Pour rivaliser avec les leaders mondiaux de la tech, les solutions logicielles haïtiennes doivent obéir aux normes techniques les plus strictes :
                    - Respect des spécifications W3C et IETF pour les échanges réseau et le web ;
                    - Standards d'accessibilité WCAG garantissant l'accès aux personnes en situation de handicap ;
                    - Adhésion aux directives Material Design 3 de Google (grille de 8 dp, zones tactiles de 48 dp minimum, contraste colorimétrique élevé) ;
                    - Sécurité des données conforme aux recommandations internationales (OWASP, ISO/IEC 27001).
                    
                    2. L'affirmation fière de l'identité haïtienne :
                    Cette rigueur formelle ne dilue en rien notre singularité. Au contraire, elle offre un socle robuste pour valoriser notre patrimoine :
                    - Palette visuelle inspirée de notre histoire et de notre drapeau (Bleu Roi #0A192F, Or #FFD700, Rouge Haïtien #D21034) ;
                    - Typographie soignée célébrant la musicalité et la clarté du Kreyòl Ayisyen ;
                    - Métaphores ergonomiques intuitives reflétant nos modes de vie communautaires et solidaires.
                """.trimIndent(),
                contentHt = """
                    1. Respekte tout gwo estanda entènasyonal :
                    Si nou vle pou gwo konpayi nan lemonn respekte lojisyèl nou yo, fòk nou kode menm jan ak pi bon enjenyè yo :
                    - Swiv tout lwa sou entènèt (W3C ak IETF) pou zouti nou yo mache tout kote ;
                    - Fè aplikasyon yo fasil pou moun ki gen andikap ka sèvi avèk yo tou ;
                    - Swiv règleman Material Design 3 (bouton ki gen omwen 48 dp pou dwèt ka peze yo fasil, koulè ki klè pou je) ;
                    - Pwoteje sistèm yo kont pirat enfòmatik dapre estanda sekirite mondyal yo.
                    
                    2. Montre bèl idantite ayisyen nou an :
                    Respekte nòm sa yo pa anpeche nou montre kiyès nou ye. Okontrè, se li k ap pèmèt kilti nou briye pi fò :
                    - Bèl koulè drapo nou ak listwa nou (Ble Woyal, Koulè Lò, Wouj Ayisyen) ;
                    - Bèl lèt ak bèl ekriti ki fè lang Kreyòl la parèt byen klè ak tout diyite l ;
                    - Ekran ak desen ki senp epi ki sanble ak jan nou viv nan kominote nou an.
                """.trimIndent(),
                plannedStartPage = 193,
                plannedEndPage = 193,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 148 : La marque AJ-TECH au-delà d’Haïti ====================
            BookChapter(
                id = "ch_10_148",
                chapterNumber = 148,
                partId = "part_10",
                titleFr = "Chapitre 148 — La marque AJ-TECH au-delà d’Haïti",
                titleHt = "Chapit 148 — Mak AJ-TECH pi lwen pase Ayiti",
                subtitleFr = "Positionnement, réputation, rigueur documentaire et construction progressive d'une signature technologique",
                subtitleHt = "Pozisyonman, repitasyon, travay serye ak bon dokimantasyon pou bati yon gwo mak respekte",
                summaryFr = "La trajectoire de marque d'AJ-TECH sur la scène internationale : fonder notre notoriété sur des preuves techniques mesurables, une documentation irréprochable et la transparence.",
                summaryHt = "Kijan mak AJ-TECH ap bati non li lòtbò dlo : pa nan pale anpil, men montre bon kòd, bon dokiman, epi toujou di sa ki fèt tout bon san manti.",
                contentFr = """
                    1. La construction patiente d'une réputation technologique :
                    Une marque technologique ne se bâtit pas à coup de slogans publicitaires creux ou de promesses démesurées. À l'échelle internationale, la crédibilité s'acquiert par la consistance du travail livré, la stabilité du code source et l'honnêteté intellectuelle.
                    
                    2. Les piliers de la marque AJ-TECH au-delà de nos frontières :
                    - Slogan officiel : « Vision, Technologie et Avenir » ;
                    - Devise d'action : « L'innovation haïtienne au service du monde » ;
                    - Rigueur de la documentation : chaque projet est accompagné de spécifications détaillées et bilingues ;
                    - Éthique de transparence : reconnaître ouvertement le statut de chaque entité (prototype, concept, en développement) sans jamais tromper le public.
                    
                    3. Clarté sur la reconnaissance actuelle :
                    AJ-TECH ne prétend aucunement être déjà un géant mondial établi. Notre marque est en phase active d'émergence et de structuration, documentant pas à pas son ascension vers le sommet avec humilité et détermination.
                """.trimIndent(),
                contentHt = """
                    1. Bati yon bon repitasyon san prese :
                    Yon bon mak nan zafè teknoloji pa fèt sou bèl pawòl nan radyo oswa gwo pwomès anlè. Nan je tout espesyalis nan lemonn, se bon jan kalite travay ou montre, jan lojisyèl ou yo pa gen pann, ak verite w ap di ki fè moun respekte w.
                    
                    2. Gwo poto ki soutni mak AJ-TECH la lòtbò dlo :
                    - Eslogan ofisyèl nou : « Vizyon, Teknoloji ak Lavni » ;
                    - Deviz travay nou : « Inovasyon ayisyen an nan sèvis lemonn » ;
                    - Bonjan dokiman : chak pwojè gen liv ak eksplikasyon klè ni an Fransè ni an Kreyòl ;
                    - Prensip verite : di klèman sa k fonksyone, sa k nan faz tès ak sa k se lide pou demen san bay manti.
                    
                    3. Di verite sou nivo nou ye jodi a :
                    AJ-TECH pa janm pretann li deja yon gwo jeyan mondyal ki koni toupatou. Nou se yon antrepriz k ap bati fondasyon l jodi a avèk kouraj ak disiplin, epi k ap ekri tout verite sou wout li pou l rive nan somè a.
                """.trimIndent(),
                plannedStartPage = 194,
                plannedEndPage = 194,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 149 : Construire une communauté technologique haïtienne mondiale ====================
            BookChapter(
                id = "ch_10_149",
                chapterNumber = 149,
                partId = "part_10",
                titleFr = "Chapitre 149 — Construire une communauté technologique haïtienne mondiale",
                titleHt = "Chapit 149 — Konstwi yon kominote teknolojik ayisyen mondyal",
                subtitleFr = "Fédérer développeurs, chercheurs, étudiants et entrepreneurs dans un esprit d'entraide et d'ambition collective",
                subtitleHt = "Rasanble devlopè, chèchè, etidyan ak antreprenè nan yon sèl lespri koutmen ak gwo vizyon pou nasyon an",
                summaryFr = "L'émergence d'une communauté technologique mondiale unissant talents locaux et diaspora : hackathons, revues de code ouvertes, mentorat intergénérationnel et projets partagés.",
                summaryHt = "Mete kanpe yon gwo kominote teknolojik ayisyen toupatou sou latè : fè konkou inovasyon, revizyon kòd ansanm, bay jèn yo fòmasyon epi bati pwojè komin.",
                contentFr = """
                    1. La force du collectif face aux défis :
                    Aucune entreprise, aucun développeur isolé ne pourra porter à lui seul la transformation numérique d'un pays. C'est l'émulation collective, la mise en commun des ressources et la solidarité technique qui feront émerger une véritable filière technologique haïtienne d'envergure internationale.
                    
                    2. Les composantes de la communauté mondiale :
                    - Les étudiants et autodidactes issus du système éducatif national, d'EDH et de la plateforme EDUKA ;
                    - Les développeurs professionnels et ingénieurs juniors et séniors résidant en Haïti ;
                    - Les experts, professeurs d'université et chercheurs haïtiens exerçant dans les universités et laboratoires mondiaux ;
                    - Les entrepreneurs et investisseurs de la diaspora désireux de participer à la souveraineté technologique de la terre natale.
                    
                    3. Actions concrètes de rassemblement :
                    Organisation d'ateliers techniques virtuels réguliers, défis de programmation (hackathons) axés sur des problèmes sociétaux concrets, et constitution d'une base de connaissances partagée accessible à tous gratuitement.
                """.trimIndent(),
                contentHt = """
                    1. Fòs yon kominote k ap travay ansanm :
                    Pa gen yon sèl konpayi oswa yon sèl devlopè ki ka transfòme zafè teknoloji nan peyi a poukont li. Se lè tout moun mete men ansanm, pataje sa yo konnen epi soutni youn lòt n ap ka bati yon gwo fòs nasyonal ke tout mond lan ap respekte.
                    
                    2. Moun ki fè pati gwo kominote sa a :
                    - Etidyan ak jèn debouya k ap aprann nan inivèsite, nan EDH ak sou platfòm EDUKA ;
                    - Devlopè k ap travay ak kòd chak jou nan peyi Dayiti ;
                    - Pwofesè inivèsite, enjenyè ak gwo chèchè ayisyen ki nan gwo sant rechèch nan lemonn ;
                    - Antreprenè ak moun nan dyaspora a ki vle mete lajan ak konesans pou ede peyi zansèt yo a kanpe.
                    
                    3. Aksyon konkrè n ap fè :
                    Fè sesyon fòmasyon sou entènèt regilyèman, òganize konkou kòd pou jwenn solisyon sou pwoblèm reyèl peyi a, epi mete tout dokiman ak liv yo gratis pou tout jèn ka aprann san peye.
                """.trimIndent(),
                plannedStartPage = 195,
                plannedEndPage = 195,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 150 : Vers un écosystème numérique haïtien connecté au monde ====================
            BookChapter(
                id = "ch_10_150",
                chapterNumber = 150,
                partId = "part_10",
                titleFr = "Chapitre 150 — Vers un écosystème numérique haïtien connecté au monde",
                titleHt = "Chapit 150 — Vè yon ekosistèm nimerik ayisyen ki konekte ak lemonn",
                subtitleFr = "Un écosystème souverain, intégré et dynamique : faire d'Haïti un carrefour d'innovation technologique résiliente",
                subtitleHt = "Yon ekosistèm nimerik lib, solid e konekte : fè Ayiti tounen yon gwo kalfou kote inovasyon fèt pou tout moun",
                summaryFr = "Synthèse de la vision d'un écosystème technologique haïtien pleinement relié aux grands hubs régionaux et internationaux, alliant autonomie d'action et partenariats féconds.",
                summaryHt = "Gwo rezime sou vizyon yon ekosistèm nimerik ayisyen ki kanpe sou de pye l, ki konekte ak gwo sant teknoloji sou latè, ki kreye anpil opòtinite epi ki fè peyi a briye.",
                contentFr = """
                    1. La vision intégrée de l'écosystème :
                    Arrivé au terme de cette exploration internationale, l'écosystème numérique haïtien se dessine non comme une enclave isolée, mais comme un réseau vivant, vibrant et interconnecté aux grands courants technologiques mondiaux.
                    
                    2. L'équilibre entre indépendance et coopération :
                    - Être souverain dans la gouvernance de nos données et le choix de nos architectures logicielles ;
                    - Être ouvert et coopératif dans les échanges scientifiques, les protocoles réseau et le commerce électronique ;
                    - Faire rayonner les 22 entités de l'écosystème AJ-TECH comme un laboratoire d'innovations frugales applicables à l'ensemble des pays du Sud.
                    
                    3. Un espoir lucide et engagé pour l'avenir :
                    Le chemin vers cet écosystème connecté est exigeant et jalonné d'obstacles. Mais avec la force de notre jeunesse, l'expertise de notre diaspora et la persévérance au travail, Haïti peut et doit prendre sa place légitime sur la carte technologique planétaire.
                """.trimIndent(),
                contentHt = """
                    1. Vizyon konplè yon ekosistèm konekte :
                    Lè nou gade tout sa nou sot eksplike yo, nou wè klè ke ekosistèm nimerik ayisyen an pa dwe rete nan yon ti kwen izole. Li dwe tankou yon gwo rezo vivan ki makonnen ak tout gwo mouvman teknoloji k ap fèt sou tout latè.
                    
                    2. Balanse libète nou ak travay ak lòt moun :
                    - Rete mèt tèt nou nan fason nou gouvène done nou yo ak fason nou konstwi lojisyèl nou yo ;
                    - Rete ouvè pou n aprann, fè koperasyon syantifik epi fè komès nimerik ak tout lòt nasyon ;
                    - Fè tout 22 antite ki nan ekosistèm AJ-TECH la sèvi tankou yon bèl modèl teknoloji ki pa koute chè pou tout lòt peyi k ap goumen pou devlope.
                    
                    3. Yon gwo espwa ki chita sou travay :
                    Wout la long e li gen anpil difikilte devan l. Men ak kouraj jèn nou yo, konesans dyaspora a ak bonjan disiplin nan travay chak jou, Ayiti ap pran plas li merite a nan zafè teknoloji sou tout planèt la.
                """.trimIndent(),
                plannedStartPage = 196,
                plannedEndPage = 196,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 151 : Vision internationale AJ-TECH 2026–2035 ====================
            BookChapter(
                id = "ch_10_151",
                chapterNumber = 151,
                partId = "part_10",
                titleFr = "Chapitre 151 — Vision internationale AJ-TECH 2026–2035",
                titleHt = "Chapit 151 — Vizyon entènasyonal AJ-TECH 2026–2035",
                subtitleFr = "Une feuille de route décennale réaliste en 4 phases : de la consolidation locale au rayonnement planétaire",
                subtitleHt = "Yon plan 10 lane reyalis an 4 faz : soti nan fòtifye sa k lakay pou rive klere sou tout planèt la",
                summaryFr = "La feuille de route internationale décennale d'AJ-TECH (2026–2035) articulée en 4 phases stratégiques : consolidation, ouverture, coopération et rayonnement, guidée par la devise « L'innovation haïtienne au service du monde ».",
                summaryHt = "Plan estratejik entènasyonal sou 10 lane AJ-TECH (2026–2035) an 4 faz klè : fòtifye baz la, ouvèti, koperasyon ak klere sou lemonn, anba deviz « Inovasyon ayisyen an nan sèvis lemonn ».",
                contentFr = """
                    1. Une feuille de route décennale réaliste et méthodique :
                    Pour clore la Partie X, AJ-TECH propose une vision internationale prospective articulée autour de quatre périodes décennales bien définies, fondée sur une lucidité absolue et un engagement sans faille :
                    
                    - Phase 1 (2026–2027) — Consolidation et documentation :
                      - Finalisation de la base de code, des tests unitaires et de l'architecture bilingue intégrale ;
                      - Publication et diffusion des ouvrages de référence sur l'écosystème numérique haïtien ;
                      - Consolidation des prototypes des 22 entités officielles sans dispersion commerciale prématurée ;
                      - Structuration des liens de travail avec les viviers académiques (EDH, EDUKA) et les premiers mentors de la diaspora.
                    
                    - Phase 2 (2028–2030) — Ouverture et premières capacités d'expansion :
                      - Déploiement des premières applications opérationnelles adaptées aux conditions locales et régionales ;
                      - Mise en place de programmes réguliers de formation, de hackathons et d'ateliers techniques virtuels ;
                      - Premiers pilotes d'exportation de services d'ingénierie logicielle sobre et résiliente vers la Caraïbe ;
                      - Structuration d'une cellule de veille juridique et normative internationale.
                    
                    - Phase 3 (2031–2033) — Coopération et présence internationale progressive :
                      - Nouage de partenariats technologiques équitables avec des universités, centres de recherche et ONG responsables ;
                      - Participation active aux conférences technologiques panaméricaines et aux consortiums open source ;
                      - Début d'intégration de modules multilingues additionnels (Anglais, Espagnol) sur les produits matures ;
                      - Mise en œuvre de mécanismes d'investissement participatif éthique mobilisant la diaspora.
                    
                    - Phase 4 (2034–2035) — Rayonnement international et maturité de l'écosystème :
                      - Affirmation d'AJ-TECH comme une référence technologique reconnue dans la Caraïbe et les Amériques ;
                      - Autonomie opérationnelle, souveraineté algorithmique éprouvée et viabilité économique pérenne ;
                      - Démonstration éclatante qu'une nation réputée vulnérable peut forger une industrie logicielle d'excellence.
                    
                    2. Conclusion de la Partie X :
                    Cette trajectoire n'est pas une prédiction facile, mais un contrat moral avec notre jeunesse. Guidés par notre slogan « Vision, Technologie et Avenir » et notre devise « L’innovation haïtienne au service du monde », nous réaffirmons notre posture immuable : « Une entreprise ambitieuse en construction qui documente honnêtement son chemin vers le sommet. »
                """.trimIndent(),
                contentHt = """
                    1. Yon plan 10 lane reyalis ki chita sou disiplin :
                    Pou n fini Pati X la, AJ-TECH prezante plan estratejik entènasyonal li pou 10 lane k ap vini yo an kat gwo etap klè :
                    
                    - Faz 1 (2026–2027) — Fòtifye fondasyon ak ekri bon dokiman :
                      - Fini tout kòd lojisyèl yo, tout tès sekirite yo ak sistèm nan de lang (Fransè ak Kreyòl) ;
                      - Pibliye tout liv ak gid sou ekosistèm nimerik ayisyen an pou tout moun ka li yo ;
                      - Byen finalize tout prototip nan 22 antite ofisyèl yo san kouri fè bwi anvan lè ;
                      - Mete bonjan relasyon travay ak lekòl yo (EDH, EDUKA) ansanm ak premye espesyalis nan dyaspora a.
                    
                    - Faz 2 (2028–2030) — Ouvè pòt ak premye tès ekspansyon :
                      - Mete premye aplikasyon yo ap fonksyone nan men itilizatè reyèl ;
                      - Òganize fòmasyon regilye, konkou inovasyon ak atelye sou kòd sou entènèt ;
                      - Kòmanse vann premye ti sèvis lojisyèl solid bay moun nan peyi Karayib yo ;
                      - Mete yon ekip pou verifye tout lwa ak nòm entènasyonal sou zafè nimerik.
                    
                    - Faz 3 (2031–2033) — Koperasyon ak prezans entènasyonal regilye :
                      - Siyen bonjan patenarya responsab ak gwo inivèsite ak sant rechèch entènasyonal ;
                      - Patisipe nan gwo konferans teknoloji nan zòn Karayib la ak nan tout Amerik la ;
                      - Kòmanse ajoute Anglè ak Panyòl nan aplikasyon ki fin byen pare yo ;
                      - Kreye bon fason pou dyaspora a ka envesti kòb yo dirèkteman nan pwojè yo.
                    
                    - Faz 4 (2034–2035) — Gwo modèl respekte nan tout lemonn :
                      - AJ-TECH vin yon gwo modèl teknoloji respekte nan tout Karayib la ak nan lemonn antye ;
                      - Konpayi a kanpe sou de pye l, li pa depann sou pèsonn epi li gen bonjan kòb k ap rantre regilyèman ;
                      - Montre tout latè ke yon ti peyi ki te pase anpil tray ka bati pi bon lojisyèl ki egziste.
                    
                    2. Konklizyon Pati X la :
                    Plan sa a se pa yon rèv k ap fèt poukont li, se yon angajman nou pran ak tout jèn yo. Anba eslogan nou « Vizyon, Teknoloji ak Lavni » ak deviz nou « Inovasyon ayisyen an nan sèvis lemonn », n ap repete pawòl verite nou an : « Yon antrepriz ki gen gwo anbisyon k ap bati ti pa ti pa epi k ap ekri tout verite sou wout li pou rive nan somè a. »
                """.trimIndent(),
                plannedStartPage = 197,
                plannedEndPage = 198,
                estimatedReadMinutes = 6,
                status = BookContentStatus.IN_PROGRESS
            )
        )
    )
}

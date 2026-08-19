package com.aistudio.ajtech.ecosystem.data.repository

import com.aistudio.ajtech.ecosystem.data.model.BookChapter
import com.aistudio.ajtech.ecosystem.data.model.BookContentStatus
import com.aistudio.ajtech.ecosystem.data.model.BookPart
import com.aistudio.ajtech.ecosystem.data.model.PartType

/**
 * PARTIE V — ÉCONOMIE, ENTREPRENEURIAT ET MODÈLE D'AFFAIRES
 * Chapitres 61 à 75 (Exactement 15 chapitres d'analyse économique, modèles de revenus et stratégie).
 */
object Part5Data {

    val part5: BookPart = BookPart(
        id = "part_5",
        partNumber = 5,
        type = PartType.MAIN_PART,
        titleFr = "PARTIE V — ÉCONOMIE, ENTREPRENEURIAT ET MODÈLE D'AFFAIRES",
        titleHt = "PATI V — EKONOMI, ANTREPRENARYA AK MODÈL BIZNIS",
        subtitleFr = "Modèles de revenus potentiels, entrepreneuriat résilient, gouvernance et projections 2026–2035",
        subtitleHt = "Modèl lajan prevwa, antreprenarya solid, bon jesyon ak plan estratejik 2026–2035",
        plannedPages = "pp. 286–340",
        status = BookContentStatus.IN_PROGRESS,
        chapters = listOf(
            // ==================== CHAPITRE 61 : L'économie numérique et Haïti ====================
            BookChapter(
                id = "ch_5_61",
                chapterNumber = 61,
                partId = "part_5",
                titleFr = "Chapitre 61 — L'économie numérique et Haïti",
                titleHt = "Chapit 61 — Ekonomi dijital la ak Ayiti",
                subtitleFr = "Défis structurels, opportunités de saut technologique et transformation nationale",
                subtitleHt = "Gwo defi, chans pou fè gwo pwogrè rapid ak transfòmasyon peyi a",
                summaryFr = "Analyse de la situation économique haïtienne et du potentiel transformateur de l'économie numérique comme levier de productivité.",
                summaryHt = "Analiz sou ekonomi Ayiti ak jan teknoloji dijital ka ede peyi a kreye plis richès ak travay.",
                contentFr = """
                    1. État des lieux de l'économie haïtienne :
                    L'économie nationale fait face à des contraintes structurelles majeures : prédominance du secteur informel, faible bancarisation de la population, coût élevé des transactions d'argent traditionnelles, instabilité énergétique et pénurie d'infrastructures physiques.
                    
                    2. L'opportunité du saut technologique (Leapfrogging) :
                    Tout comme la téléphonie mobile a permis d'outrepasser l'absence de réseau filaire dans les années 2000, le numérique offre à Haïti l'opportunité de contourner les goulots d'étranglement administratifs et logistiques. Le numérique permet de dématérialiser les services, de réduire les coûts d'intermédiation et d'ouvrir l'accès aux marchés internationaux.
                    
                    3. La jeunesse comme dividende démographique :
                    Avec plus de 50 % de la population âgée de moins de 25 ans, Haïti dispose d'un potentiel humain considérable. Sans filières de formation et opportunités économiques concrètes dans les métiers du numérique, cette énergie risque la déperdition ou l'exil forcé.
                    
                    4. Le rôle catalyseur visé par l'écosystème :
                    AJ-TECH n'a pas la prétention de résoudre seul ces défis macroéconomiques, mais vise à concevoir des briques technologiques adaptées, capables d'équiper les entrepreneurs, artisans et étudiants pour bâtir une économie plus productive et souveraine.
                """.trimIndent(),
                contentHt = """
                    1. Sitiyasyon ekonomi peyi Ayiti jodi a :
                    Ekonomi peyi a gen gwo difikilte : pifò komès fèt nan enfòmèl san ankadreman, anpil moun pa gen kont labank, frè pou voye lajan souvan twò chè, pa gen kouran ki fyab epi wout yo pa fasil.
                    
                    2. Chans pou fè yon gwo so pi devan (Leapfrogging) :
                    Menm jan telefòn selilè te pèmèt peyi a kominike san l pa t bezwen fil telefòn nan tè, teknoloji dijital la ka pèmèt Ayiti depase anpil gwo baryè. Zouti dijital pèmèt moun travay pi vit, peye mwens frè epi vann sèvis yo bay moun nan tout mond lan.
                    
                    3. Jèn yo se pi gwo richès peyi a :
                    Plis pase mwatye popilasyon an gen mwens pase 25 lane. Sa se yon gwo fòs si nou fòme yo nan metye teknoloji pou yo ka kreye travay olye yo oblije pati kite peyi a.
                    
                    4. Wòl AJ-TECH vle jwe nan chanjman sa a :
                    AJ-TECH pa pretann li ka rezoud tout pwoblèm peyi a poukont li, men li vle bati bon zouti lojisyèl solid pou ede antreprenè, pwofesè ak jèn ayisyen kreye richès nan pwòp peyi yo.
                """.trimIndent(),
                plannedStartPage = 286,
                plannedEndPage = 289,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 62 : Pourquoi créer des entreprises technologiques en Haïti ====================
            BookChapter(
                id = "ch_5_62",
                chapterNumber = 62,
                partId = "part_5",
                titleFr = "Chapitre 62 — Pourquoi créer des entreprises technologiques en Haïti",
                titleHt = "Chapit 62 — Poukisa kreye antrepriz teknoloji an Ayiti",
                subtitleFr = "Création de valeur locale, souveraineté industrielle et réduction de la dépendance externe",
                subtitleHt = "Kreye richès nan peyi a, pwoteje endepandans nou epi sispann depann de lòt",
                summaryFr = "Justification stratégique et patriotique de la création d'entreprises technologiques natives en Haïti.",
                summaryHt = "Eksplikasyon sou rezon ki fè li enpòtan pou nou kreye pwòp konpayi teknoloji pa nou an Ayiti.",
                contentFr = """
                    1. Refus de la simple posture de consommateur passif :
                    Pendant des décennies, les pays émergents ont été cantonnés au rôle de consommateurs passifs de technologies conçues en Californie, en Europe ou en Asie. Ces outils externes ignorent souvent les réalités de terrain haïtiennes (coupures de réseau, langue créole, faible pouvoir d'achat).
                    
                    2. Création de richesses et rétention de capital :
                    Chaque fois qu'une entreprise ou une institution locale paie un abonnement logiciel étranger, des devises précieuses quittent le pays. Créer des éditeurs de logiciels nationaux permet de conserver cette valeur ajoutée sur le territoire et de réinvestir dans les talents locaux.
                    
                    3. Conception adaptée aux contraintes locales :
                    Une entreprise technologique enracinée en Haïti conçoit nativement pour la résilience : fonctionnement hors-ligne (Offline-First), interfaces bilingues français/créole, frugalité en bande passante et compatibilité avec des téléphones modestes.
                    
                    4. Impact psychologique et symbole d'émancipation :
                    Démontrer qu'il est possible de concevoir une architecture logicielle rigoureuse depuis Haïti restaure la confiance collective et inspire la jeunesse à devenir des bâtisseurs plutôt que des spectateurs.
                """.trimIndent(),
                contentHt = """
                    1. Refize rete sèlman kòm moun k ap konsome :
                    Pandan twòp tan, nou te sèlman moun k ap achte lojisyèl lòt nasyon fè. Zouti etranje sa yo souvan pa konprann reyalite Ayiti tankou entènèt ki koupe, lang kreyòl la oswa ti telefòn senp yo.
                    
                    2. Kreye richès epi kenbe lajan nan peyi a :
                    Chak fwa yon biznis peye yon abònman lojisyèl etranje, se gwo lajan etranje ki soti kite peyi a. Lè nou kreye pwòp lojisyèl pa nou, lajan an rete nan peyi a pou peye jèn enjenyè ak devlopè nou yo.
                    
                    3. Zouti ki adapte ak reyalite nou :
                    Yon konpayi teknoloji ki fèt an Ayiti bati zouti ki mache san entènèt (Offline-First), ki pale kreyòl ak fransè, ki pa konsome twòp megabay epi ki mache sou nenpòt ti telefòn.
                    
                    4. Bay jèn yo konfyans pou yo bati :
                    Lè nou montre nou ka ekri bon kòd solid nan peyi a, sa bay tout jèn yo lespwa ak fòs pou yo konnen yo kapab bati gwo bagay ak pwòp men yo.
                """.trimIndent(),
                plannedStartPage = 290,
                plannedEndPage = 293,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 63 : Le modèle économique d'AJ-TECH ====================
            BookChapter(
                id = "ch_5_63",
                chapterNumber = 63,
                partId = "part_5",
                titleFr = "Chapitre 63 — Le modèle économique d'AJ-TECH",
                titleHt = "Chapit 63 — Modèl ekonomik AJ-TECH",
                subtitleFr = "Principes directeurs, frugalité, autofinancement initial et transparence absolue",
                subtitleHt = "Prensip debaz, pa fè gaspiyaj, kòmanse ak sa w genyen ak verite total",
                summaryFr = "Présentation de la philosophie économique d'AJ-TECH, fondée sur la frugalité, le bootstrapping et l'absence de monétisation artificielle.",
                summaryHt = "Prezantasyon fason AJ-TECH wè zafè lajan : fè ekonomi, travay ak sa ki la epi di verite sou sa k poko la.",
                contentFr = """
                    1. Transparence économique absolue :
                    À ce jour, AJ-TECH est un projet d'ingénierie et d'écosystème en phase de structuration et de développement. L'entreprise ne dispose actuellement d'aucun produit commercialisé à grande échelle, ne réalise aucun chiffre d'affaires, ne génère aucun bénéfice et n'a conclu aucune levée de fonds auprès d'investisseurs institutionnels.
                    
                    2. Philosophie du Bootstrapping :
                    AJ-TECH adopte la stratégie du « bootstrapping » (autofinancement et frugalité stricte) :
                    - Refus de l'illusion des valorisations artificielles sans produit réel ;
                    - Priorité absolue donnée à la solidité du code, à la documentation et à la valeur d'usage avant toute démarche commerciale ;
                    - Maîtrise des coûts de fonctionnement grâce à des technologies open source et des architectures sans serveur lourds.
                    
                    3. Modèles économiques envisagés pour l'avenir :
                    À terme, et sous réserve du développement complet des solutions, l'écosystème pourrait reposer sur des modèles économiques sains et diversifiés : abonnements professionnels pour les outils avancés, micro-frais de transaction sur les services marchands, et prestations d'ingénierie logicielle sur mesure.
                    
                    4. Séparation stricte entre vision et réalité :
                    Tout modèle de revenu décrit dans cet ouvrage représente un schéma théorique et prospectif à valider sur le terrain, et non une réalité financière existante.
                """.trimIndent(),
                contentHt = """
                    1. Verite total sou nivo ekonomik nou jodi a :
                    Jodi a, AJ-TECH se yon pwojè enjenyri k ap bati kòd ak estrikti li. Konpayi an pa gen okenn pwodui ki deja sou mache a pou vann, li pa fè okenn kòb oswa benefis kounye a, epi li pa t pran okenn gwo lajan prete nan men envestisè.
                    
                    2. Travay ak sa w genyen san fè dèt (Bootstrapping) :
                    AJ-TECH chwazi avanse etap pa etap ak ti mwayen li genyen :
                    - Pa chache fè gwo bri sou fo lajan san pwodui a poko pare nèt ;
                    - Mete tout fòs nou sou bon kòd solid, bon dokiman ak zouti ki itil anvan nou pale de vann ;
                    - Fè ekonomi sou tout depans gras ak bon zouti lojisyèl gratis ak sistèm ki pa koute chè.
                    
                    3. Modèl revni nou prevwa pou pi devan :
                    Lè zouti yo fin pare nèt, konpayi an ta ka fè lajan nan plizyè fason : ti abònman pou pwofesyonèl, ti pousantaj piti anpil sou zouti komès, ak travay devlopman espesyal pou gwo antrepriz.
                    
                    4. Pa janm konfonn rèv ak reyalite :
                    Tout fason pou fè lajan nou eksplike nan liv sa a se lide ak plan pou pita, se pa kòb k ap rantre jodi a.
                """.trimIndent(),
                plannedStartPage = 294,
                plannedEndPage = 297,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 64 : Produits, services et modèles de revenus ====================
            BookChapter(
                id = "ch_5_64",
                chapterNumber = 64,
                partId = "part_5",
                titleFr = "Chapitre 64 — Produits, services et modèles de revenus",
                titleHt = "Chapit 64 — Pwodui, sèvis ak fason pou rantre lajan",
                subtitleFr = "Typologie des modèles envisagés : Freemium, abonnements SaaS, commissions et licences",
                subtitleHt = "Kalite modèl biznis prevwa : Gratis ak opsyon peye, abònman, komisyon ak lisans",
                summaryFr = "Détail analytique des modèles de monétisation envisagés à terme pour les différentes entités de l'écosystème.",
                summaryHt = "Detay sou diferan fason entite yo ta ka rantre lajan pou peye depans yo lè yo fin pare.",
                contentFr = """
                    1. Typologie générale des modèles de revenus envisagés :
                    Pour assurer sa pérennité sans compromettre l'accessibilité publique, l'écosystème pourrait s'appuyer sur quatre piliers économiques complémentaires :
                    
                    2. Modèle Freemium (ex. AJ-Task, AJ-Learn) :
                    - Accès de base 100 % gratuit pour les particuliers, étudiants et petites structures (gestion de tâches de base, cours fondamentaux) ;
                    - Options payantes « Pro » pour les équipes avancées : collaboration multi-utilisateurs illimitée, intégrations sur mesure, tableaux de bord analytiques avancés.
                    
                    3. Modèle SaaS / Abonnement récurrent (ex. AJ-Dev, AJ-Cloud, AJ-Mail) :
                    - Forfaits mensuels ou annuels transparents et adaptés aux budgets locaux pour les professionnels du numérique et entreprises clientes.
                    
                    4. Modèle transactionnel / Commission (ex. AJ-Pay, AJ-Commerce) :
                    - Frais minimes par transaction réussie, strictement plafonnés pour rester inférieurs aux tarifs des monopoles traditionnels d'intermédiation financière.
                    
                    5. Licences d'ingénierie et intégration (ex. AJ-Bioklin, AJ-Maps, EDUKA) :
                    - Déploiements spécifiques, maintenance institutionnelle et adaptation pour les écoles, cliniques et collectivités territoriales.
                    
                    6. Clause de prudence :
                    Tous ces modèles sont soumis au développement effectif des produits et à des études approfondies d'élasticité-prix sur le marché national.
                """.trimIndent(),
                contentHt = """
                    1. Kalite fason pou rantre lajan nou prevwa :
                    Pou pwojè a ka kenbe sou de pye l san l pa bare moun ki pa gen gwo mwayen, nou planifye 4 gwo fason :
                    
                    2. Modèl Freemium (gratis ak opsyon peye, pa egzanp AJ-Task, AJ-Learn) :
                    - Zouti debaz la gratis pou tout moun, elèv ak ti komèsan ;
                    - Opsyon pwofesyonèl pou gwo ekip ki bezwen travay a plizyè, koneksyon espesyal ak gwo rapò detaye.
                    
                    3. Modèl Abònman pa mwa (pa egzanp AJ-Dev, AJ-Cloud, AJ-Mail) :
                    - Ti pri pa mwa ki pa chè pou pwofesyonèl ak biznis k ap itilize sèvè ak zouti devlopman.
                    
                    4. Ti komisyon sou tranzaksyon (pa egzanp AJ-Pay, AJ-Commerce) :
                    - Yon ti frè tou piti lè yon vant oswa yon transfè fèt, ki dwe pi ba lontan pase sa gwo konpayi yo pran kounye a.
                    
                    5. Kontra pou lekòl ak lopital (pa egzanp AJ-Bioklin, AJ-Maps, EDUKA) :
                    - Enstale ak kenbe sistèm yo pou lekòl, klinik ak meri ki bezwen zouti espesyal.
                    
                    6. Avètisman :
                    Tout plan sa yo ap fèt sèlman lè pwodui yo fin devlope epi teste ak moun nan peyi a.
                """.trimIndent(),
                plannedStartPage = 298,
                plannedEndPage = 301,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 65 : AJ-Commerce et le commerce numérique ====================
            BookChapter(
                id = "ch_5_65",
                chapterNumber = 65,
                partId = "part_5",
                titleFr = "Chapitre 65 — AJ-Commerce et le commerce numérique",
                titleHt = "Chapit 65 — AJ-Commerce ak komès sou entènèt",
                subtitleFr = "Opportunités du commerce électronique local, rôle envisagé et défis logistiques",
                subtitleHt = "Chans pou komès sou entènèt, wòl nou prevwa pou li ak defi livrezon",
                summaryFr = "Vision prospective de l'entité AJ-Commerce pour stimuler le commerce de proximité sans prétendre à une exploitation commerciale actuelle.",
                summaryHt = "Vizyon pou pwojè AJ-Commerce la pou ede ti machann vann sou entènèt lè l va pare.",
                contentFr = """
                    1. Rôle envisagé pour AJ-Commerce :
                    AJ-Commerce est conçu conceptuellement comme une plateforme de mise en relation et de vitrine numérique pour les producteurs, artisans, boutiques et prestataires de services haïtiens. L'objectif est de permettre à chaque commerçant de créer facilement son catalogue numérique accessible sur mobile.
                    
                    2. Statut actuel : Non commercialisé :
                    La plateforme AJ-Commerce n'est actuellement pas commercialisée ni ouverte au grand public. Elle constitue une entité en phase de recherche conceptuelle et d'analyse des flux logistiques.
                    
                    3. Modèle de monétisation potentiel :
                    - Gratuité totale pour la création des petits catalogues de quartier ;
                    - Commission légère (par exemple 1 à 2 %) uniquement sur les ventes intermédiées en ligne ;
                    - Services optionnels de mise en avant visuelle et d'outils de gestion de stocks simplifiés.
                    
                    4. Les défis structurels du e-commerce en Haïti :
                    Le développement d'AJ-Commerce devra surmonter des obstacles réels : absence d'adressage postal précis dans de nombreux quartiers, insécurité sur les axes de transport, et habitude culturelle tenace du paiement physique en espèces à la livraison.
                """.trimIndent(),
                contentHt = """
                    1. Kisa nou prevwa pou AJ-Commerce fè :
                    AJ-Commerce fèt nan lide pou pèmèt atizan, ti boutik, plantè ak machann ayisyen gen yon bèl vitrin sou telefòn pou montre sa yo gen pou vann bay tout moun fasil.
                    
                    2. Kote pwojè a ye kounye a : Li poko sou mache a :
                    AJ-Commerce poko ouvri pou moun achte sou li jodi a. Li se yon lide ak yon pwojè k ap prepare pou n konprann kijan livrezon ak komès ka fèt pi byen.
                    
                    3. Kijan li ta ka fè ti lajan pou kenbe tèt li :
                    - Gratis pou ti machann mete kèk ti pwodui sou li ;
                    - Yon ti pousantaj tou piti (tankou 1 oswa 2 %) lè yon vant fèt sou entènèt la ;
                    - Ti opsyon peye pou moun ki vle mete boutik yo pi devan oswa jere depo machandiz yo.
                    
                    4. Gwo defi komès sou entènèt genyen an Ayiti :
                    Pou AJ-Commerce ka mache byen pita, l ap gen pou rezoud gwo pwoblèm : anpil zòn pa gen nimewo kay ak bon non lari, gen pwoblèm sekirite sou wout yo, epi moun yo abitye peye ak lajan kach nan men lè machandiz la rive.
                """.trimIndent(),
                plannedStartPage = 302,
                plannedEndPage = 305,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 66 : AJ-Pay et les paiements numériques ====================
            BookChapter(
                id = "ch_5_66",
                chapterNumber = 66,
                partId = "part_5",
                titleFr = "Chapitre 66 — AJ-Pay et les paiements numériques",
                titleHt = "Chapit 66 — AJ-Pay ak peman dijital",
                subtitleFr = "Ambitions pour les micropaiements, cadre réglementaire BRH et transparence technique",
                subtitleHt = "Pwojè pou ti peman rapid, lwa labank santral (BRH) ak laverite sou kote nou ye",
                summaryFr = "Présentation honnête des perspectives d'AJ-Pay, de la conformité réglementaire requise et de l'état réel des intégrations.",
                summaryHt = "Eksplikasyon nan laverite sou sa nou vle fè ak AJ-Pay, papye labank mande ak nivo kòd la ye kounye a.",
                contentFr = """
                    1. Ambition stratégique d'AJ-Pay :
                    AJ-Pay représente la vision d'une passerelle unifiée de paiement numérique capable de fluidifier les micro-transactions quotidiennes en Haïti : règlement de factures, achats de proximité, transferts entre pairs et paiement de services éducatifs ou médicaux.
                    
                    2. Transparence sur l'état opérationnel actuel :
                    Il est impératif de souligner qu'AJ-Pay n'est pas opérationnel sur le marché et ne dispose actuellement d'aucune intégration active ou connectée en production avec les services de paiement mobile existants (tels que MonCash ou NatCash) ni avec le système bancaire national (SPIH / PRONAP).
                    
                    3. Exigences réglementaires et conformité :
                    L'exploitation de services de paiement en Haïti est strictement encadrée par la Banque de la République d'Haïti (BRH). Toute mise en service future nécessitera :
                    - L'obtention formelle des licences d'opérateur de services de paiement ou un partenariat d'intermédiation agréé ;
                    - La conformité stricte aux directives de lutte contre le blanchiment d'argent et le financement du terrorisme (LCB-FT / AML-CFT) ;
                    - Des protocoles d'identification client vérifiés (KYC - Know Your Customer).
                    
                    4. Modèle économique potentiel :
                    Sous réserve d'autorisation et de déploiement, AJ-Pay pourrait générer des micro-commissions par transaction, avec une tarification transparente sans frais cachés.
                """.trimIndent(),
                contentHt = """
                    1. Gwo rèv nou gen pou AJ-Pay :
                    AJ-Pay se yon vizyon pou kreye yon pon senp pou moun fè ti peman rapid sou telefòn : peye ti kòb lekòl, peye nan ti boutik, voye lajan bay fanmi san traka.
                    
                    2. Verite klè sou kote nou ye jodi a :
                    Nou dwe di sa byen klè : AJ-Pay poko ap mache sou mache a, epi li poko konekte sou okenn sèvis lajan sou telefòn tankou MonCash oswa NatCash, ni sou okenn labank an Ayiti kounye a.
                    
                    3. Lwa ak otorizasyon Labank Santral (BRH) :
                    Pou yon moun fè sèvis lajan an Ayiti, fòk li gen bonjan papye ak otorizasyon nan men BRH. Pou sa ka fèt pi devan, fòk :
                    - Jwenn bonjan lisans ofisyèl oswa fè patenarya ak yon bank ki deja gen dwa ;
                    - Respekte tout lwa kont blanchiman lajan sal ;
                    - Verifye idantite moun k ap itilize l yo (KYC) pou sekirite tout moun.
                    
                    4. Kijan li ta ka fè yon ti kòb :
                    Si li jwenn tout otorizasyon epi li lanse pi devan, AJ-Pay ta ka pran yon ti frè tou piti sou chak peman, ak pri ki klè san kache anyen.
                """.trimIndent(),
                plannedStartPage = 306,
                plannedEndPage = 309,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 67 : AJ-Wallet et les services financiers numériques ====================
            BookChapter(
                id = "ch_5_67",
                chapterNumber = 67,
                partId = "part_5",
                titleFr = "Chapitre 67 — AJ-Wallet et les services financiers numériques",
                titleHt = "Chapit 67 — AJ-Wallet ak bous dijital pou lajan",
                subtitleFr = "Portefeuille numérique sécurisé, gestion budgétaire et prudence financière",
                subtitleHt = "Bous dijital an sekirite, jere bidjè fanmi ak anpil pridans sou lajan",
                summaryFr = "Analyse prospective d'AJ-Wallet comme outil de gestion financière personnelle et familiale, sans prétention bancaire non autorisée.",
                summaryHt = "Analiz sou sa AJ-Wallet ta ka pote pou ede moun jere lajan yo san pretann li se yon bank.",
                contentFr = """
                    1. Positionnement conceptuel d'AJ-Wallet :
                    AJ-Wallet est envisagé comme un portefeuille numérique personnel destiné à l'éducation financière, au suivi des dépenses quotidiennes, à la gestion de budgets familiaux et au stockage sécurisé de justificatifs de paiement dématérialisés.
                    
                    2. Précision légale et prudentielle :
                    AJ-Wallet n'est pas une banque, ne collecte aucun dépôt public d'épargne et ne constitue pas un établissement financier agréé à ce jour. Le projet est à l'état de conception logicielle et de recherche ergonomique.
                    
                    3. Fonctionnalités de gestion budgétaire visées :
                    - Catégorisation automatique des dépenses (alimentation, santé, scolarité, transport) ;
                    - Calcul d'objectifs d'épargne prévisionnels hors-ligne ;
                    - Archivage chiffré des reçus numériques pour faciliter la comptabilité des micro-entrepreneurs.
                    
                    4. Modèle de viabilité envisagé :
                    L'application de base pour la gestion personnelle est pensée pour être entièrement gratuite. Des modules avancés d'analyse financière et de reporting multi-devises (Gourde / Dollar US) pourraient faire l'objet de micro-options payantes optionnelles à long terme.
                """.trimIndent(),
                contentHt = """
                    1. Kisa AJ-Wallet vle ye :
                    AJ-Wallet fèt nan lide pou sèvi kòm yon bous sou telefòn pou ede moun konprann kòman yo depanse kòb yo, kontwole bidjè kay la epi sere resi peman yo an sekirite.
                    
                    2. Sa lalwa di ak prekosyon :
                    AJ-Wallet se pa yon bank, li pa pran kòb moun pou sere pou fè enterè kounye a, epi li pa gen okenn otorizasyon labank jodi a. Se yon pwojè k ap etidye kijan pou ede moun pi byen jere lajan yo.
                    
                    3. Kisa l ta ka fè pou ede moun :
                    - Klase depans yo (manje, sante, lekòl, machin) pou w wè kote kòb la pase ;
                    - Ede moun kalkile kijan pou yo fè ti ekonomi san yo pa bezwen entènèt ;
                    - Kenbe tout resi peman sou telefòn lan pou ti machann ka konnen sa yo vann.
                    
                    4. Kijan zouti sa a ka kenbe tèt li :
                    Zouti senp pou moun jere ti kòb yo dwe rete gratis pou tout moun. Si pi devan gen gwo rapò konplike pou gwo biznis ak plizyè lajan (Goud ak Dola), opsyon sa yo ta ka gen yon ti pri piti anpil.
                """.trimIndent(),
                plannedStartPage = 310,
                plannedEndPage = 313,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 68 : L'entrepreneuriat technologique haïtien ====================
            BookChapter(
                id = "ch_5_68",
                chapterNumber = 68,
                partId = "part_5",
                titleFr = "Chapitre 68 — L'entrepreneuriat technologique haïtien",
                titleHt = "Chapit 68 — Antreprenarya teknolojik an Ayiti",
                subtitleFr = "Résilience, innovation frugale, freelancing et exportation de services à haute valeur",
                subtitleHt = "Kouraj, fè bèl bagay ak ti mwayen, travay sou entènèt ak vann sèvis lòt bò dlo",
                summaryFr = "Réflexion stratégique sur l'essor de l'entrepreneuriat numérique en Haïti et le potentiel du travail indépendant à l'international.",
                summaryHt = "Refleksyon sou kijan jèn ayisyen ka kreye biznis teknoloji, travay sou entènèt epi vann sèvis yo nan tout mond lan.",
                contentFr = """
                    1. L'entrepreneuriat sous contrainte extrême :
                    Entreprendre dans la tech en Haïti exige un niveau exceptionnel de résilience. Les entrepreneurs locaux doivent surmonter l'instabilité politique, les ruptures de courant, le coût des télécommunications et la rareté des capitaux d'amorçage. Cette adversité forge des solutions d'une grande frugalité et robustesse.
                    
                    2. Le potentiel du freelancing et du travail à distance :
                    Grâce à Internet, un développeur ou designer haïtien basé aux Cayes, à Jacmel ou à Port-au-Prince peut théoriquement offrir ses compétences à des entreprises du monde entier. Cela permet d'injecter directement des devises dans l'économie locale sans passer par l'émigration physique.
                    
                    3. Propriété intellectuelle et création de valeur pérenne :
                    Au-delà de la sous-traitance ponctuelle, l'enjeu crucial réside dans la création et la protection de la propriété intellectuelle haïtienne : concevoir des marques, des architectures logicielles et des brevets locaux capables de générer des revenus récurrents.
                    
                    4. Le rôle d'AJ-Dev et d'AJ-Fondation Biz :
                    L'écosystème ambitionne d'offrir des outils de développement (AJ-Dev) et un accompagnement méthodologique (AJ-Fondation Biz) pour outiller cette nouvelle génération de bâtisseurs d'entreprises.
                """.trimIndent(),
                contentHt = """
                    1. Kreye biznis nan mitan gwo difikilte :
                    Fè biznis teknoloji an Ayiti mande anpil kouraj ak pasyans. Antreprenè nou yo oblije goumen ak kouran ki pa genyen, entènèt ki chè epi lajan ki difisil pou jwenn. Men difikilte sa yo fè yo kreye zouti ki pi solid pase lòt moun.
                    
                    2. Travay a distans sou entènèt (Freelancing) :
                    Gras ak entènèt, yon jèn ki konn pwograme oswa fè bèl desen nan Okay, Jakmèl oswa Pòtoprens ka travay pou konpayi nan tout mond lan. Sa fè lajan etranje rantre nan peyi a san jèn nan pa oblije pati kite tè l.
                    
                    3. Pwoteje sa nou kreye (Propriété intellectuelle) :
                    Nou pa dwe sèlman travay pou lòt moun, nou dwe kreye pwòp zouti pa nou, pwoteje non biznis nou ak lojisyèl nou yo pou yo ka rapòte lajan pou peyi a sou anpil lane.
                    
                    4. Kijan AJ-Dev ak AJ-Fondation Biz ka ede :
                    Nou vle mete bon zouti pou devlopè (AJ-Dev) ak bon fòmasyon sou biznis (AJ-Fondation Biz) pou gide jèn yo nan kreye bonjan konpayi solid.
                """.trimIndent(),
                plannedStartPage = 314,
                plannedEndPage = 317,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 69 : La diaspora comme force économique ====================
            BookChapter(
                id = "ch_5_69",
                chapterNumber = 69,
                partId = "part_5",
                titleFr = "Chapitre 69 — La diaspora comme force économique",
                titleHt = "Chapit 69 — Dyaspora a kòm gwo fòs ekonomik",
                subtitleFr = "Du transfert d'urgence à l'investissement productif et au transfert de compétences",
                subtitleHt = "Soti nan voye ti kòb pou manje rive nan envesti nan biznis ak pataje konesans",
                summaryFr = "Analyse du rôle stratégique de la diaspora haïtienne pour transformer les transferts financiers en investissements productifs.",
                summaryHt = "Analiz sou jan dyaspora ayisyen an ka ede peyi a devlope lè l envesti nan teknoloji olye l sèlman voye ti kòb sekou.",
                contentFr = """
                    1. Poids macroéconomique de la diaspora :
                    Les transferts de fonds de la diaspora représentent plus de 30 % du Produit Intérieur Brut (PIB) d'Haïti. Cependant, l'immense majorité de ces flux est actuellement absorbée par la consommation immédiate de subsistance (nourriture, urgences médicales, loyers).
                    
                    2. Transition vers l'investissement productif :
                    L'ambition est de créer des canaux fiables permettant à la diaspora d'investir directement dans des entreprises technologiques et des projets éducatifs locaux créateurs d'emplois durables, plutôt que de financer uniquement l'importation de biens de consommation.
                    
                    3. Transfert de savoir-faire et mentorat :
                    La diaspora regorge d'ingénieurs en chef, de chercheurs, d'architectes logiciels et de dirigeants d'entreprises dans les pôles technologiques mondiaux (Amérique du Nord, Europe, Caraïbes). Leur contribution la plus précieuse réside dans le mentorat technique, la gouvernance et l'ouverture de marchés internationaux.
                    
                    4. Partenariats diasporiques visés par AJ-TECH :
                    L'écosystème recherche des collaborations académiques et professionnelles avec des associations de professionnels haïtiens à l'étranger pour enrichir les programmes d'EDUKA et les revues de code d'AJ-Dev.
                """.trimIndent(),
                contentHt = """
                    1. Gwo fòs lajan dyaspora a :
                    Lajan moun nan dyaspora a voye reprezante plis pase 30 % nan tout richès peyi Ayiti. Men prèske tout lajan sa a sèvi sèlman pou achte manje, peye lopital oswa peye kay.
                    
                    2. Chanje fason nou itilize lajan sa a :
                    Nou dwe kreye bon mwayen pou moun lòt bò dlo ka envesti lajan yo nan biznis teknoloji ak lekòl ki kreye bon travay nan peyi a, olye se sèlman manje nou achte deyò.
                    
                    3. Pataje konesans ak eksperyans :
                    Nan dyaspora a, gen anpil gwo enjenyè, doktè ak chèf konpayi k ap travay nan pi gwo zòn teknoloji sou latè. Pi gwo kado yo ka bay peyi a se vin moutre jèn yo sa yo konnen epi ouvri pòt pou nou lòt bò dlo.
                    
                    4. Kolaborasyon AJ-TECH ap chache :
                    Nou vle fè bon patenarya ak asosyasyon pwofesyonèl ayisyen lòt bò dlo pou yo ede nou verifye kòd nan AJ-Dev epi prepare bon leson nan EDUKA.
                """.trimIndent(),
                plannedStartPage = 318,
                plannedEndPage = 321,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 70 : Emploi, compétences et création de valeur ====================
            BookChapter(
                id = "ch_5_70",
                chapterNumber = 70,
                partId = "part_5",
                titleFr = "Chapitre 70 — Emploi, compétences et création de valeur",
                titleHt = "Chapit 70 — Travay, konpetans ak kreyasyon valè",
                subtitleFr = "Formation technique exigeante, montée en gamme des talents et création d'emplois locaux",
                subtitleHt = "Fòmasyon solid, ogmante nivo jèn yo ak kreye bonjan travay nan peyi a",
                summaryFr = "Étude des mécanismes par lesquels la montée en compétences numériques stimule l'emploi qualifié et la rémunération équitable.",
                summaryHt = "Etid sou kijan bon fòmasyon nan teknoloji pèmèt jèn yo jwenn bon travay ki peye byen san kite peyi a.",
                contentFr = """
                    1. Le déficit de formation pratique :
                    Bien que de nombreux jeunes haïtiens soient diplômés en informatique, il existe un fossé important entre l'enseignement théorique académique et les standards réels de l'industrie logicielle moderne (Git, CI/CD, tests automatisés, architectures découplées, sécurité).
                    
                    2. La chaîne de valeur des compétences numériques :
                    L'élévation du niveau technique transforme l'économie :
                    - Métiers d'exécution de base (saisie de données, maintenance basique) : faible valeur ajoutée ;
                    - Métiers intermédiaires (développement web, intégration, support) : valeur ajoutée moyenne ;
                    - Métiers de pointe (architecture logicielle, sécurité des systèmes, ingénierie de données, cryptographie) : très haute valeur ajoutée et forte capacité d'exportation.
                    
                    3. Création d'emplois décents et rémunération équitable :
                    L'objectif est d'endiguer la précarité en favorisant des emplois stables, bien rémunérés et respectueux des droits des travailleurs au sein des entreprises partenaires de l'écosystème.
                    
                    4. Synergie entre EDUKA, AJ-Learn et AJ-Dev :
                    La combinaison d'EDUKA (pédagogie), d'AJ-Learn (apprentissage continu) et d'AJ-Dev (pratique du code) forme une passerelle directe vers l'employabilité et l'entrepreneuriat autonome.
                """.trimIndent(),
                contentHt = """
                    1. Mank pratik nan fòmasyon yo :
                    Gen anpil jèn ki gen diplòm enfòmatik, men souvan gen yon gwo diferans ant sa yo aprann nan lekòl ak sa gwo konpayi mande jodi a (itilize Git, fè tès otomatik, sekirite kòd).
                    
                    2. Nivo konpetans yo ak lajan yo rapòte :
                    Plis yon moun konn fè bagay konplike, se plis li ka touche byen :
                    - Ti travay senp (tape tèks, ranje ti bagay) : pa peye anpil ;
                    - Travay mwayen (kreye sitwèb, sipò teknik) : peye pi byen ;
                    - Gwo metye difisil (bati gwo sistèm, sekirite enfòmatik, jere gwo baz done) : peye anpil lajan epi ka vann bay nenpòt konpayi sou latè.
                    
                    3. Kreye bon travay ki peye moun kòrèkteman :
                    Objektif la se ede jèn yo jwenn bon travay ki estab, ki respekte dwa yo epi ki pèmèt yo viv byen ak fanmi yo.
                    
                    4. Jan EDUKA, AJ-Learn ak AJ-Dev mache ansanm :
                    Lè nou mete EDUKA (fòmasyon lekòl), AJ-Learn (aprann tout tan) ak AJ-Dev (ekri kòd) ansanm, sa kreye yon bon pon pou jèn yo jwenn travay oswa kreye pwòp biznis pa yo.
                """.trimIndent(),
                plannedStartPage = 322,
                plannedEndPage = 325,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 71 : Financement et croissance ====================
            BookChapter(
                id = "ch_5_71",
                chapterNumber = 71,
                partId = "part_5",
                titleFr = "Chapitre 71 — Financement et croissance",
                titleHt = "Chapit 71 — Finansman ak fason pou grandi",
                subtitleFr = "Options de capitalisation : autofinancement, subventions, investisseurs et éthique",
                subtitleHt = "Chwa pou jwenn lajan : pwòp kòb pa w, èd pou pwojè, envestisè ak respè prensip",
                summaryFr = "Revue analytique des modes de financement potentiels pour des startups technologiques en contexte haïtien, avec transparence sur la situation d'AJ-TECH.",
                summaryHt = "Analiz sou tout fason yon konpayi teknoloji ka jwenn lajan an Ayiti, ak verite sou kote AJ-TECH ye.",
                contentFr = """
                    1. Analyse des différentes voies de financement :
                    Pour croître sans perdre son indépendance, une entreprise technologique dispose de plusieurs leviers théoriques :
                    - Autofinancement (Bootstrapping) : Réinvestissement direct des revenus générés ; assure une souveraineté totale mais limite la vitesse d'expansion initiale ;
                    - Subventions d'innovation et concours internationaux : Fonds non remboursables pour la recherche, l'éducation ou l'inclusion numérique ;
                    - Financement participatif (Crowdfunding) : Mobilisation de micro-contributions citoyennes et de la diaspora ;
                    - Capital-risque éthique (Impact Investing) : Entrée d'investisseurs partageant la vision de développement durable sans exiger une rentabilité prédatrice à court terme.
                    
                    2. Situation actuelle d'AJ-TECH :
                    AJ-TECH ne bénéficie actuellement d'aucune subvention publique, d'aucun fonds de capital-risque, ni d'aucun programme de financement externe. Le développement est entièrement réalisé sur fonds propres et par le travail bénévole des fondateurs.
                    
                    3. Principes non négociables pour les financements futurs :
                    Tout partenariat financier futur devra obligatoirement respecter l'alignement avec les valeurs d'indépendance nationale, d'éthique des données et de service aux populations haïtiennes.
                """.trimIndent(),
                contentHt = """
                    1. Diferan fason pou jwenn lajan pou grandi :
                    Pou yon konpayi grandi san l pa vann libète l, gen plizyè chwa posib :
                    - Travay ak sa w rantre (Bootstrapping) : Re-envesti ti kòb ou fè ; sa fè w rete mèt tèt ou men sa pran plis tan ;
                    - Èd ak kado pou pwojè inovasyon : Lajan òganizasyon entènasyonal bay pou lekòl oswa pwojè ki itil sosyete a san w pa bezwen remèt li ;
                    - Tontin ak kontribisyon tout moun (Crowdfunding) : Moun nan pèp la ak nan dyaspora a ki mete ti kòb ansanm pou pouse yon pwojè ;
                    - Envestisè ki gen konsyans (Impact Investing) : Moun ki mete lajan paske yo vle ede peyi a devlope tout bon, pa sèlman pou fè gwo lajan rapid.
                    
                    2. Kote AJ-TECH ye kounye a :
                    AJ-TECH pa gen okenn èd lajan leta, okenn gwo envestisè etranje, ni okenn kòb li resevwa nan men okenn òganizasyon kounye a. Se ak pwòp fòs ponyèt ak lajan fondatè yo tout travay sa a ap fèt.
                    
                    3. Règ nou pap janm kraze pou lajan :
                    Si pi devan nou ta dwe pran lajan nan men yon patnè, fòk moun sa a respekte libète peyi a, sekirite done moun yo epi misyon nou pou sèvi pèp ayisyen an.
                """.trimIndent(),
                plannedStartPage = 326,
                plannedEndPage = 329,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 72 : Partenariats et écosystème d'affaires ====================
            BookChapter(
                id = "ch_5_72",
                chapterNumber = 72,
                partId = "part_5",
                titleFr = "Chapitre 72 — Partenariats et écosystème d'affaires",
                titleHt = "Chapit 72 — Patenarya ak relasyon biznis",
                subtitleFr = "Construire des alliances stratégiques avec universités, entreprises et institutions",
                subtitleHt = "Bati bon relasyon solid ak inivèsite, lòt biznis ak enstitisyon nan peyi a",
                summaryFr = "Rôle des alliances stratégiques et de la coopération inter-entreprises pour bâtir un tissu économique numérique solide en Haïti.",
                summaryHt = "Enpòtans pou travay ansanm ak inivèsite ak lòt konpayi pou kreye yon gwo fòs teknolojik nan peyi a.",
                contentFr = """
                    1. La nécessité des coopérations stratégiques :
                    Aucune entreprise technologique ne peut prospérer en autarcie complète. En Haïti, la rareté des ressources rend la collaboration et la mutualisation indispensables entre acteurs de l'écosystème.
                    
                    2. Typologie des partenariats recherchés à terme :
                    - Partenariats académiques : Coopération avec les universités et centres de formation haïtiens pour aligner les cursus sur les besoins réels du marché ;
                    - Partenariats industriels et commerciaux : Intégration de solutions logicielles auprès de distributeurs, coopératives agricoles et prestataires de santé ;
                    - Partenariats institutionnels : Collaboration technique avec les ministères et régulateurs pour la modernisation des services publics.
                    
                    3. Transparence contractuelle :
                    AJ-TECH n'a conclu à ce jour aucun contrat commercial exclusif ni accord de distribution officiel. Les partenariats décrits relèvent d'objectifs de développement institutionnel à concrétiser au fur et à mesure de la maturité des entités.
                    
                    4. Philosophie « Open Ecosystem » :
                    L'écosystème privilégie les standards ouverts et les formats interopérables afin de faciliter l'intégration future avec d'autres startups et entreprises haïtiennes.
                """.trimIndent(),
                contentHt = """
                    1. Poukisa nou bezwen travay ak lòt moun :
                    Yon sèl konpayi pa ka fè tout bagay poukont li. Paske mwayen yo pa anpil an Ayiti, li enpòtan anpil pou tout moun ki vle bati mete men ansanm.
                    
                    2. Kalite patenarya nou ta renmen fè pi devan :
                    - Patenarya ak inivèsite : Travay ak fakilte ak lekòl pwofesyonèl pou prepare elèv yo sou sa mache a mande ;
                    - Patenarya ak biznis : Ede ti machann, kowoperativ plantè ak klinik itilize bon zouti lojisyèl ;
                    - Patenarya ak leta : Ede enstitisyon Leta yo modènize sèvis yo pou pèp la jwenn bon sèvis pi vit.
                    
                    3. Onètete sou sa ki siyen jodi a :
                    AJ-TECH pa gen okenn gwo kontra komèsyal ki siyen ak okenn patnè jodi a. Tout sa nou mansyone la a se plan ak relasyon nou vle bati lè pwodui yo va pare.
                    
                    4. Zouti ki ouvri pou tout moun :
                    Nou chwazi bati sistèm ki ka fasil konekte ak lòt aplikasyon jèn devlopè ayisyen ap fè pou tout moun ka vanse ansanm.
                """.trimIndent(),
                plannedStartPage = 330,
                plannedEndPage = 333,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 73 : Confiance, transparence et gouvernance ====================
            BookChapter(
                id = "ch_5_73",
                chapterNumber = 73,
                partId = "part_5",
                titleFr = "Chapitre 73 — Confiance, transparence et gouvernance",
                titleHt = "Chapit 73 — Konfyans, transparans ak bon jan jesyon (Gouvernance)",
                subtitleFr = "Rigueur morale, documentation publique, auditabilité et gestion méthodique des risques",
                subtitleHt = "Disiplin moral, ekri tout bagay aklè pou tout moun wè epi jere danje yo byen",
                summaryFr = "Principes de gouvernance d'AJ-TECH : vérité documentaire, reddition de comptes et gestion rigoureuse des risques opérationnels.",
                summaryHt = "Prensip jesyon AJ-TECH : toujou di laverite, montre sa k ap fèt aklè epi veye sou tout danje ki ka parèt.",
                contentFr = """
                    1. La confiance comme actif le plus précieux :
                    Dans un contexte où les déceptions et les promesses non tenues ont souvent érodé la confiance du public, la transparence absolue constitue le principe fondateur non négociable d'AJ-TECH.
                    
                    2. Règles de gouvernance interne :
                    - Séparation stricte entre ce qui existe (code compilé, tests réussis), ce qui est en prototype et ce qui relève de la vision prospective ;
                    - Documentation ouverte et vérifiable : refus catégorique des déclarations marketing trompeuses ou des chiffres d'utilisateurs gonflés ;
                    - Responsabilité des dirigeants et reddition de comptes périodique.
                    
                    3. Gestion méthodique des risques :
                    L'entreprise cartographie rigoureusement ses risques opérationnels :
                    - Risques techniques : Défaillances matérielles, pertes de données, vulnérabilités logicielles (mitigés par les sauvegardes locales, le chiffrement et les tests automatisés) ;
                    - Risques contextuels : Coupures prolongées d'électricité et d'accès Internet (mitigés par le paradigme Offline-First) ;
                    - Risques financiers : Dépendance au manque de liquidités (mitigés par la frugalité stricte du bootstrapping).
                """.trimIndent(),
                contentHt = """
                    1. Konfyans se pi gwo richès yon antrepriz :
                    Nan yon peyi kote moun souvan desevwa ak bèl pawòl san anyen pa fèt, di laverite nan tout bagay se premye prensip AJ-TECH pap janm negosye.
                    
                    2. Règleman sou jan n ap dirije :
                    - Toujou separe sa ki fèt deja (kòd ki ekri ak tès ki pase), sa k nan tès ak sa ki nan rèv pou pi devan ;
                    - Dokimante tout bagay aklè : refize fè vye piblisite manti oswa bay fo chif sou kantite moun k ap itilize l ;
                    - Lidè yo dwe toujou responsab epi rann kont sou tout sa k ap fèt.
                    
                    3. Veye sou tout danje ki ka parèt (Gestion des risques) :
                    Nou gade aklè tout pwoblèm ki ka rive pou n pare pou yo :
                    - Danje teknik : Aparèy ki kraze, kòd ki gen erè (nou pare pou sa ak bon tès sou machin ak sovgad) ;
                    - Danje peyi a : Pa gen kouran ak entènèt (nou pare pou sa paske aplikasyon nou yo mache san entènèt) ;
                    - Danje lajan : Pa gen kòb (nou pare pou sa paske nou pa fè gaspiyaj epi nou pa fè dèt).
                """.trimIndent(),
                plannedStartPage = 334,
                plannedEndPage = 336,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 74 : Expansion régionale et internationale ====================
            BookChapter(
                id = "ch_5_74",
                chapterNumber = 74,
                partId = "part_5",
                titleFr = "Chapitre 74 — Expansion régionale et internationale",
                titleHt = "Chapit 74 — Elaji prezans nan Karayib la ak nan mond lan",
                subtitleFr = "Une ambition stratégique par cercles concentriques : Haïti, Caraïbes, diaspora et monde",
                subtitleHt = "Yon plan etap pa etap : Ayiti an premye, Karayib la, dyaspora a epi tout mond lan",
                summaryFr = "Stratégie d'internationalisation progressive d'AJ-TECH, conçue comme un objectif d'exportation de compétences haïtiennes.",
                summaryHt = "Plan pou fè teknoloji nou an soti an Ayiti pou al sèvi lòt peyi nan Karayib la ak nan mond lan pita.",
                contentFr = """
                    1. Une ambition stratégique, non une présence actuelle :
                    Il convient de préciser avec clarté qu'AJ-TECH n'a aucune filiale, aucun bureau ni aucune opération commerciale active à l'étranger à l'heure actuelle. L'expansion internationale représente un cap stratégique à long terme.
                    
                    2. Stratégie d'expansion par cercles concentriques :
                    - Cercle 1 — Haïti : Consolidation du socle technologique, validation de l'utilité terrain et résilience sous contraintes maximales ;
                    - Cercle 2 — La Caraïbe : Adaptation des solutions aux pays voisins partageant des défis insulaires similaires (connectivité limitée, climat tropical, vulnérabilité énergétique) ;
                    - Cercle 3 — Les communautés diasporiques : Déploiement des outils de productivité et de communication auprès de la diaspora en Amérique du Nord et en Europe ;
                    - Cercle 4 — Marchés internationaux : Exportation de briques logicielles, de compétences d'ingénierie et de services à haute valeur ajoutée.
                    
                    3. Facteurs de compétitivité :
                    Des solutions logicielles éprouvées dans l'environnement le plus exigeant d'Haïti possèdent un avantage compétitif naturel de robustesse et d'économie de ressources pour conquérir d'autres marchés émergents.
                """.trimIndent(),
                contentHt = """
                    1. Yon vizyon pou pi devan, pa yon bagay ki la jodi a :
                    Nou dwe di sa aklè : AJ-TECH pa gen okenn biwo ni okenn magazen deyò peyi a kounye a. Elaji deyò se yon gwo objektif nou vle reyalize pi devan.
                    
                    2. Etap kòman n ap vanse ti pa ti pa :
                    - Premye etap — Ayiti : Fini byen bati zouti yo nan peyi a, verifye si yo sèvi moun vre nan mitan gwo difikilte yo ;
                    - Dezyèm etap — Karayib la : Pote solisyon nou yo bay lòt peyi vwazen ki gen menm pwoblèm kouran ak entènèt tankou nou ;
                    - Twazyèm etap — Dyaspora a : Pèmèt ayisyen k ap viv nan peyi Etazini, Kanada ak Lafrans itilize zouti nou yo pou travay ak kominike ;
                    - Katriyèm etap — Tout mond lan : Vann bon lojisyèl ak sèvis devlopman bay gwo konpayi etranje.
                    
                    3. Poukisa zouti nou yo ka gen anpil valè deyò :
                    Lè yon lojisyèl fèt pou mache byen nan kondisyon difisil an Ayiti, li tèlman solid epi li pa gaspiye memwa, sa fè l ka mache pi byen toujou nan nenpòt lòt peyi sou latè.
                """.trimIndent(),
                plannedStartPage = 337,
                plannedEndPage = 338,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 75 : La stratégie économique 2026–2035 ====================
            BookChapter(
                id = "ch_5_75",
                chapterNumber = 75,
                partId = "part_5",
                titleFr = "Chapitre 75 — La stratégie économique 2026–2035",
                titleHt = "Chapit 75 — Plan estrateji ekonomik 2026–2035",
                subtitleFr = "Jalons décennaux prudents : amorçage, validation commerciale, passage à l'échelle et maturité",
                subtitleHt = "Gwo etap sou 10 lane : kòmanse san bri, teste sou mache a, grandi epi vin solid nèt",
                summaryFr = "Feuille de route économique décennale d'AJ-TECH, structurée en quatre phases progressives non contractuelles.",
                summaryHt = "Plan travay ekonomik sou 10 lane pou gide devlopman konpayi an an kat gwo faz.",
                contentFr = """
                    1. Nature des projections économiques :
                    Les phases ci-dessous constituent un cadre d'orientation stratégique et des repères méthodologiques. Elles ne constituent en aucun cas des garanties de résultats financiers.
                    
                    2. Les quatre phases de la feuille de route 2026–2035 :
                    
                    - Phase 1 (2026–2027) — Amorçage & Frugalité :
                      - Finalisation du socle logiciel documentaire et de l'architecture de référence ;
                      - Test pilote approfondi de la PWA AJ-Task auprès d'utilisateurs tests sans monétisation agressive ;
                      - Maintien du modèle 100 % autofinancé (Bootstrapping) avec zéro dette.
                    
                    - Phase 2 (2028–2030) — Premières validations commerciales & Modèles pilotes :
                      - Expérimentation des premiers modèles Freemium sur les outils de productivité ;
                      - Études de conformité réglementaire pour les services financiers futurs (AJ-Pay / AJ-Wallet) ;
                      - Premiers recrutements rémunérés de développeurs et formateurs locaux sur fonds propres.
                    
                    - Phase 3 (2031–2033) — Passage à l'échelle & Diversification :
                      - Lancement d'AJ-Commerce et d'EDUKA auprès des institutions partenaires ;
                      - Structuration des offres d'abonnements professionnels (AJ-Dev, AJ-Cloud) ;
                      - Atteinte visée de l'équilibre financier opérationnel global.
                    
                    - Phase 4 (2034–2035) — Maturité & Rayonnement régional :
                      - Consolidation des revenus récurrents et réinvestissement majeur dans la recherche et développement ;
                      - Premiers déploiements commerciaux dans la région caribéenne ;
                      - Établissement d'AJ-TECH comme référence de l'entrepreneuriat technologique souverain haïtien.
                    
                    3. Conclusion de la Partie V :
                    La grandeur d'une entreprise ne se mesure pas aux promesses de lendemains enchanteurs, mais à la constance de son travail, à la vérité de ses comptes et à l'impact réel et mesurable qu'elle apporte à son peuple.
                """.trimIndent(),
                contentHt = """
                    1. Kisa plan ekonomik sa a vle di :
                    Dat ak etap sa yo se yon gid travay ak yon vizyon estratejik, se pa yon pwomès lajan ki garanti san travay.
                    
                    2. Kat gwo faz nan plan 2026–2035 lan :
                    
                    - Faz 1 (2026–2027) — Kòmanse ak sa k genyen san bri :
                      - Fini byen ekri liv la ak tout kòd debaz yo ;
                      - Fè tès sou PWA AJ-Task la ak moun k ap ede nou teste san chache vann li chè ;
                      - Kontinye travay ak pwòp fòs ponyèt nou san fè okenn dèt.
                    
                    - Faz 2 (2028–2030) — Premye tès sou mache a :
                      - Kòmanse teste ti abònman pou pwofesyonèl sou zouti ki pare yo ;
                      - Fè tout demach legal ak labank pou prepare sèvis lajan (AJ-Pay / AJ-Wallet) ;
                      - Kòmanse peye premye jèn devlopè ak pwofesè k ap travay avèk nou.
                    
                    - Faz 3 (2031–2033) — Grandi epi elaji sèvis yo :
                      - Louvri AJ-Commerce ak EDUKA pou lekòl ak biznis patnè yo ;
                      - Mete bonjan abònman pou sèvè ak zouti devlopman (AJ-Dev, AJ-Cloud) ;
                      - Rive nan pwen kote kòb k ap rantre a ka peye tout depans konpayi an.
                    
                    - Faz 4 (2034–2035) — Vin yon gwo fòs nan peyi a ak nan Karayib la :
                      - Fè gwo re-envestisman nan kreye nouvo teknoloji ;
                      - Kòmanse vann sèvis nou yo bay lòt peyi nan Karayib la ;
                      - Fè AJ-TECH vin yon gwo modèl siksè antrepriz teknolojik ki fèt an Ayiti.
                    
                    3. Konklizyon Pati V la :
                    Valè yon antrepriz pa chita sou gwo pawòl van, men li chita sou travay di chak jou, sou di laverite sou zafè lajan epi sou bonjan sèvis li rann pèp la nan lavi reyèl.
                """.trimIndent(),
                plannedStartPage = 339,
                plannedEndPage = 340,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            )
        )
    )
}

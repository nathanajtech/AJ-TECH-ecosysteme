package com.aistudio.ajtech.ecosystem.data.repository

import com.aistudio.ajtech.ecosystem.data.model.BookChapter
import com.aistudio.ajtech.ecosystem.data.model.BookContentStatus
import com.aistudio.ajtech.ecosystem.data.model.BookPart
import com.aistudio.ajtech.ecosystem.data.model.PartType

/**
 * PARTIE VII — SÉCURITÉ, SOUVERAINETÉ NUMÉRIQUE ET CONFIANCE
 * Chapitres 91 à 105 (Exactement 15 chapitres de sécurité défensive, protection des données et souveraineté).
 */
object Part7Data {

    val part7: BookPart = BookPart(
        id = "part_7",
        partNumber = 7,
        type = PartType.MAIN_PART,
        titleFr = "PARTIE VII — SÉCURITÉ, SOUVERAINETÉ NUMÉRIQUE ET CONFIANCE",
        titleHt = "PATI VII — SEKIRITE, SOUVRENETE NIMERIK AK KONFYANS",
        subtitleFr = "Protection des données, défense en profondeur, résilience locale et feuille de route 2026–2035",
        subtitleHt = "Pwoteksyon done pèsonèl, defans solid, kapasite pou reziste ak plan 2026–2035",
        plannedPages = "pp. 396–450",
        status = BookContentStatus.IN_PROGRESS,
        chapters = listOf(
            // ==================== CHAPITRE 91 : Pourquoi la sécurité numérique est essentielle ====================
            BookChapter(
                id = "ch_7_91",
                chapterNumber = 91,
                partId = "part_7",
                titleFr = "Chapitre 91 — Pourquoi la sécurité numérique est essentielle",
                titleHt = "Chapit 91 — Poukisa sekirite nimerik enpòtan anpil",
                subtitleFr = "Menaces contemporaines, vulnérabilités systémiques et confiance citoyenne",
                subtitleHt = "Gwo danje sou entènèt, feblès nan sistèm yo ak konfyans pèp la",
                summaryFr = "Fondements de la sécurité informatique : pourquoi la protection des systèmes et des données est le prérequis indispensable à toute société numérique.",
                summaryHt = "Prensip debaz sou sekirite enfòmatik : poukisa pwoteje sistèm yo se premye kondisyon pou moun ka fè teknoloji konfyans.",
                contentFr = """
                    1. La sécurité comme fondation, non comme option :
                    Dans un monde interconnecté, aucun système d'information ne peut prétendre être utile s'il est incapable de protéger l'intégrité de ses traitements et la confidentialité des données qui lui sont confiées. La sécurité n'est pas un vernis ajouté a posteriori, mais une exigence d'ingénierie dès la conception (Security by Design).
                    
                    2. Les conséquences destructrices des failles :
                    Pour les citoyens comme pour les institutions, une brèche de sécurité entraîne des préjudices directs : usurpation d'identité, extorsion de fonds, interruption de services hospitaliers vitaux, fuite de dossiers scolaires ou discrédit irrémédiable de l'institution visée.
                    
                    3. La vulnérabilité accrue des pays émergents :
                    En Haïti, la faiblesse des cadres légaux de protection et le manque de sensibilisation rendent les usagers particulièrement vulnérables aux arnaques par ingénierie sociale (phishing), aux logiciels malveillants et au piratage de comptes de messagerie.
                    
                    4. La confiance comme impératif démocratique :
                    La transition vers les services numériques publics ou privés ne pourra réussir que si la population a la certitude absolue que ses données ne seront ni volées, ni altérées, ni exploitées à son insu.
                """.trimIndent(),
                contentHt = """
                    1. Sekirite se fondasyon tout bagay, se pa yon opsyon :
                    Nan yon mond kote tout bagay konekte sou entènèt, yon lojisyèl pa ka itil si li pa ka pwoteje enfòmasyon moun mete ladan l. Sekirite se pa yon bagay yo ajoute apre, li dwe fèt depi premye jou y ap ekri kòd la.
                    
                    2. Gwo dega lè yon sistèm gen twou :
                    Lè kòd la pa gen bon sekirite, sa ka lakòz gwo malè : moun vòlè idantite w, vòlè kòb ou, bloke sèvis nan lopital, gaye enfòmasyon sou elèv lekòl epi kraze konfyans tout yon peyi.
                    
                    3. Poukisa nou pi an danje an Ayiti :
                    Paske pa gen ase lwa solid epi anpil moun poko byen konnen danje entènèt, gen anpil move moun ki pwofite pou twonpe moun (phishing), voye vye viris sou telefòn epi vòlè kont WhatsApp oswa imèl moun.
                    
                    4. San konfyans pa gen teknoloji :
                    Moun yo ap aksepte itilize zouti nimerik sèlman si yo sèten tout bon vre enfòmasyon yo pap ni pèdi, ni vann, ni vòlè pou fè move zafè sou do yo.
                """.trimIndent(),
                plannedStartPage = 396,
                plannedEndPage = 399,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 92 : La souveraineté numérique d'Haïti ====================
            BookChapter(
                id = "ch_7_92",
                chapterNumber = 92,
                partId = "part_7",
                titleFr = "Chapitre 92 — La souveraineté numérique d'Haïti",
                titleHt = "Chapit 92 — Souvrenete nimerik peyi Ayiti",
                subtitleFr = "Contrôle des données nationales, infrastructures critiques et indépendance technologique",
                subtitleHt = "Kontwole done peyi a, pwoteje gwo sistèm nasyonal yo epi sispann depann de lòt",
                summaryFr = "Analyse stratégique de la souveraineté numérique : pourquoi Haïti doit développer ses propres infrastructures, hébergements et compétences clés.",
                summaryHt = "Analiz sou enpòtans pou Ayiti gen kontwòl sou pwòp done pa l, sou sèvè l ak sou enjenyè ki pou kenbe sistèm yo.",
                contentFr = """
                    1. Définition et enjeux de la souveraineté numérique :
                    La souveraineté numérique désigne la capacité d'un État et de sa société civile à maîtriser leurs technologies, à héberger leurs données sensibles sur leur territoire ou sous leur juridiction, et à maintenir leurs infrastructures sans dépendre du bon vouloir d'acteurs étrangers.
                    
                    2. L'état actuel de dépendance :
                    À ce jour, la quasi-totalité des données gouvernementales, universitaires et commerciales d'Haïti est hébergée sur des serveurs situés en Amérique du Nord ou en Europe. Cette situation expose le pays à des risques de coupure de service, de surveillance extraterritoriale et d'impuissance juridique en cas de litige.
                    
                    3. Transparence absolue sur AJ-TECH :
                    AJ-TECH ne possède actuellement aucune infrastructure de cloud souverain déployée physiquement sur le sol national. Le projet AJ-Cloud constitue une vision architecturale et un objectif stratégique à long terme.
                    
                    4. Les piliers de l'autonomie future :
                    - Maîtrise des compétences locales : Former des ingénieurs capables de configurer, auditer et réparer les serveurs sans assistance extérieure ;
                    - Protocoles ouverts et interopérables : Éviter l'enfermement propriétaire (Vendor Lock-in) ;
                    - Développement d'infrastructures d'hébergement résilientes et écologiquement autonomes en énergie.
                """.trimIndent(),
                contentHt = """
                    1. Kisa souvrenete nimerik vle di :
                    Souvrenete nimerik vle di kapasite yon peyi genyen pou l mèt pwòp teknoloji l, pou l sere done enpòtan li yo anba pwòp lwa pa l, epi pou l ka repare sistèm li yo san l pa oblije mande etranje fè sa pou li.
                    
                    2. Jan nou depann de lòt nasyon jodi a :
                    Jodi a, prèske tout enfòmasyon Leta, inivèsite ak biznis an Ayiti sere sou sèvè ki nan peyi Etazini oswa an Ewòp. Sa mete peyi a an danje si gen gwo kriz entènasyonal oswa si sèvis sa yo ta koupe.
                    
                    3. Verite klè sou AJ-TECH jodi a :
                    AJ-TECH pa gen okenn gwo sant sèvè (Cloud souverain) ki deja enstale sou tè Ayiti a kounye a. Pwojè AJ-Cloud la se yon vizyon ak yon gwo plan n ap prepare pou pi devan.
                    
                    4. Sa nou bezwen pou nou vin lib tout bon :
                    - Fòme bon enjenyè lakay nou ki konn jan sèvè mache pou yo ka repare yo san asistans deyò ;
                    - Itilize zouti lojisyèl gratis ak estanda ouvè pou okenn konpayi etranje pa ka bare nou ;
                    - Prepare sant sèvè ki gen kouran solèy solid pou yo ka toujou mache san pran souf.
                """.trimIndent(),
                plannedStartPage = 400,
                plannedEndPage = 403,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 93 : Protection des données personnelles ====================
            BookChapter(
                id = "ch_7_93",
                chapterNumber = 93,
                partId = "part_7",
                titleFr = "Chapitre 93 — Protection des données personnelles",
                titleHt = "Chapit 93 — Pwoteksyon done pèsonèl ak vi prive",
                subtitleFr = "Minimisation de la collecte, consentement éclairé, chiffrement et droit à l'oubli",
                subtitleHt = "Pran sèlman sa ki nesesè, mande pèmisyon klè, kache done yo epi dwa pou efase",
                summaryFr = "Principes stricts de gouvernance des données : minimisation, stockage sécurisé, chiffrement au repos et en transit, et suppression garantie.",
                summaryHt = "Règ sevè sou jesyon done moun : pa pran twòp enfòmasyon, kache yo ak bon kle chifreman epi efase yo lè moun nan mande sa.",
                contentFr = """
                    1. Le principe cardinal de minimisation des données :
                    Chaque entité de l'écosystème AJ-TECH applique le principe de minimisation : ne collecter et ne stocker que les données strictement indispensables au fonctionnement du service. Si une information n'est pas nécessaire à l'exécution de la tâche, elle ne doit jamais être demandée.
                    
                    2. Consentement transparent et éclairé :
                    Les utilisateurs doivent être informés dans un langage limpide (en Kreyòl Ayisyen et en Français) de la nature exacte des données enregistrées, de leur finalité et de leur durée de conservation. Aucune case pré-cochée ni formulaire obscur n'est toléré.
                    
                    3. Chiffrement de bout en bout et au repos :
                    - Données en transit : Utilisation exclusive de protocoles de communication chiffrés (TLS 1.3 avec suites cryptographiques modernes) ;
                    - Données au repos : Stockage local chiffré sur l'appareil (Android EncryptedSharedPreferences / SQLCipher) ;
                    - Refus de la revente de données : Aucune donnée d'utilisateur ne sera jamais vendue, louée ou cédée à des courtiers de données (Data Brokers) ou à des régies publicitaires.
                    
                    4. Droit d'accès, de rectification et de suppression :
                    Tout utilisateur dispose de la possibilité d'exporter l'intégralité de ses données dans un format standardisé et de procéder à leur suppression définitive et irréversible de nos bases.
                """.trimIndent(),
                contentHt = """
                    1. Prensip pou pran sèlman sa ki nesesè (Minimisation) :
                    Tout aplikasyon AJ-TECH dwe respekte prensip sa a : mande sèlman ti enfòmasyon ki vrèman nesesè pou zouti a fonksyone. Si yon enfòmasyon pa itil pou travay la, nou pa dwe janm mande l.
                    
                    2. Mande pèmisyon aklè an Kreyòl ak Fransè :
                    Moun k ap itilize aplikasyon an dwe konnen egzakteman ki enfòmasyon ki sere, poukisa yo sere l epi konbyen tan l ap rete. Nou pa dwe janm sèvi ak vye pawòl kache pou twonpe moun.
                    
                    3. Fèmen enfòmasyon yo ak gwo kle sekirite (Chiffrement) :
                    - Lè done yo ap vwayaje sou rezo a : Tout bagay dwe pase nan kanal ki fèmen ak bon kle sekirite (TLS 1.3) ;
                    - Lè done yo sere sou telefòn lan : Yo dwe kache ak kle espesyal pou menm si yon moun vòlè telefòn lan li pa ka li sa k ladan l ;
                    - Pa janm vann enfòmasyon moun : AJ-TECH pran angajman pou l pa janm vann oswa bay okenn lòt moun done itilizatè yo pou fè piblisite.
                    
                    4. Dwa pou wè epi efase tout sa ki pou ou :
                    Nenpòt moun gen dwa telechaje tout enfòmasyon li te mete nan sistèm nan oswa mande pou efase yo nèt ale san kite okenn tras.
                """.trimIndent(),
                plannedStartPage = 404,
                plannedEndPage = 407,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 94 : Identité numérique et authentification ====================
            BookChapter(
                id = "ch_7_94",
                chapterNumber = 94,
                partId = "part_7",
                titleFr = "Chapitre 94 — Identité numérique et authentification",
                titleHt = "Chapit 94 — Idantite nimerik ak verifye kiyès ou ye (Otantifikasyon)",
                subtitleFr = "Gestion moderne des accès, Credential Manager, authentification multifacteur (MFA) et sessions",
                subtitleHt = "Jesyon aksè modèn, sekirite modpas, verifye ak plizyè etap (MFA) ak kontwòl sesyon",
                summaryFr = "Revue des mécanismes modernes d'authentification robuste, de la gestion des sessions et du contrôle strict des autorisations d'accès.",
                summaryHt = "Eksplikasyon sou pi bon fason pou verifye idantite moun san danje : bon modpas solid, verifye an de etap ak jesyon sesyon.",
                contentFr = """
                    1. La gestion sécurisée des identités :
                    L'authentification constitue le verrou d'accès aux services numériques. Les approches obsolètes (mots de passe faibles stockés en texte clair) sont formellement bannies au profit de protocoles cryptographiques éprouvés.
                    
                    2. Les bonnes pratiques d'authentification intégrées :
                    - Hachage cryptographique robuste : Mots de passe obligatoirement salés et hachés avec des algorithmes lents et résistants aux attaques par force brute (Argon2id ou BCrypt) ;
                    - Authentification multifacteur (MFA / 2FA) : Exigence d'un second facteur de validation (clé FIDO2 / WebAuthn, application d'authentification TOTP) pour toute opération critique ;
                    - Utilisation de Jetpack Credential Manager : Intégration moderne sous Android des Passkeys et de Google Sign-In sécurisé sans manipulation de mots de passe bruts.
                    
                    3. Contrôle des sessions et principe du moindre privilège (RBAC) :
                    Les jetons de session (Tokens JWT) doivent avoir une durée de vie courte, être révocables instantanément et être cloisonnés selon les rôles (Role-Based Access Control) pour empêcher toute élévation illégitime de privilèges.
                """.trimIndent(),
                contentHt = """
                    1. Verifye idantite moun ak bon zouti solid :
                    Otantifikasyon se kle ki louvri pòt aplikasyon an. Nou refize nèt tout vye metòd kote modpas rete ekri an klè nan baz done san pwoteksyon.
                    
                    2. Bon règleman nou itilize pou sekirite kont yo :
                    - Kache modpas yo ak gwo kalkil konplike (Argon2id oswa BCrypt) pou pèsonn pa ka devine yo ;
                    - Verifye an de etap (MFA / 2FA) : Mande yon dezyèm prèv (tankou yon kòd sou telefòn oswa anprent dwèt) lè yon moun ap fè yon bagay enpòtan ;
                    - Sèvi ak Credential Manager sou Android : Zouti modèn ki pèmèt moun konekte san yo pa bezwen tape modpas ki ka vòlè.
                    
                    3. Kontwole konbyen tan moun nan rete konekte (Sessions) :
                    Kle koneksyon yo (Tokens) dwe dire yon ti tan tou kout, yo dwe ka koupe rapid si gen pwoblèm, epi chak moun dwe gen dwa sèlman sou sa ki gade l.
                """.trimIndent(),
                plannedStartPage = 408,
                plannedEndPage = 411,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 95 : Cybersécurité des applications ====================
            BookChapter(
                id = "ch_7_95",
                chapterNumber = 95,
                partId = "part_7",
                titleFr = "Chapitre 95 — Cybersécurité des applications",
                titleHt = "Chapit 95 — Sekirite lojisyèl ak aplikasyon yo (AppSec)",
                subtitleFr = "Défense en profondeur, gestion des secrets, contrôle des dépendances et assainissement des entrées",
                subtitleHt = "Defann kòd la nan tout nivo, sere kle sekrè yo byen, verifye bibliyotèk ak netwaye done k ap antre",
                summaryFr = "Méthodologie de développement sécurisé d'applications (AppSec) : élimination des failles OWASP Top 10, gestion des secrets et validation des entrées.",
                summaryHt = "Fason pou ekri lojisyèl san kite twou sekirite : elimine gwo danje OWASP yo, sere kle sekrè yo epi verifye tout sa k ap antre nan kòd la.",
                contentFr = """
                    1. Le paradigme de la défense en profondeur :
                    La sécurité d'une application ne doit jamais reposer sur une seule barrière défensive. L'architecture doit prévoir des contrôles successifs et redondants à chaque niveau : interface utilisateur, couche métier, accès base de données et communications réseau.
                    
                    2. Règle absolue : Gestion stricte des secrets et clés d'API :
                    - Interdiction formelle de coder en dur des clés d'API, tokens ou identifiants dans le code source ou dans les dépôts Git ;
                    - Injection dynamique des secrets via les variables d'environnement (`.env`) et le plugin Secrets Gradle (`BuildConfig`) ;
                    - Rotation périodique des clés de chiffrement et des certificats de signature.
                    
                    3. Validation rigoureuse des entrées et assainissement (Sanitization) :
                    Toutes les données saisies par un utilisateur ou provenant d'une source externe sont considérées par défaut comme non fiables. Elles doivent être systématiquement validées, typées strictement et échappées pour prévenir les attaques par injection (SQL Injection, XSS, injection de commandes).
                    
                    4. Audit continu de la chaîne logistique logicielle (Supply Chain Security) :
                    Surveillance automatisée des dépendances open source tierces pour détecter et corriger immédiatement toute vulnérabilité connue (CVE) avant la mise en production.
                """.trimIndent(),
                contentHt = """
                    1. Pwoteje kòd la nan tout nivo (Défense en profondeur) :
                    Sekirite yon lojisyèl pa dwe konte sou yon sèl baryè. Fòk gen kontwòl nan ekran an, nan kòd k ap fè kalkil yo, nan baz done a ak nan rezo a pou si yon baryè ta cede, lòt yo ka bare vòlè a.
                    
                    2. Règ an fè : Pa janm ekri kle sekrè nan kòd la :
                    - Li entèdi nèt pou ekri modpas oswa kle API anndan kòd la oswa voye yo sou Git ;
                    - Pase tout kle sekrè yo nan fichye espesyal (`.env`) ak zouti Secrets Gradle pou yo rete kache ;
                    - Chanje kle sekrè yo detanzantan pou plis sekirite.
                    
                    3. Netwaye tout sa moun tape nan aplikasyon an :
                    Tout enfòmasyon ki soti deyò dwe pase nan paswa : verifye si yo pa gen move kòd ki ka kraze baz done a (SQL Injection) oswa vòlè enfòmasyon lòt moun.
                    
                    4. Veye sou tout lòt ti moso kòd nou itilize (Dépendances) :
                    Toujou verifye si bibliyotèk gratis nou pran sou entènèt yo pa gen vye twou sekirite ki ka mete aplikasyon an an danje.
                """.trimIndent(),
                plannedStartPage = 412,
                plannedEndPage = 415,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 96 : Sécurité des infrastructures et du cloud ====================
            BookChapter(
                id = "ch_7_96",
                chapterNumber = 96,
                partId = "part_7",
                titleFr = "Chapitre 96 — Sécurité des infrastructures et du cloud",
                titleHt = "Chapit 96 — Sekirite sèvè ak sistèm nan nwaj (Cloud)",
                subtitleFr = "Cloisonnement réseau, pare-feux, journalisation inviolable et reprise d'activité",
                subtitleHt = "Separe rezo yo, baryè sekirite (Firewalls), ekri tout sa k pase nan liv jounal epi plan pou relanse sèvè",
                summaryFr = "Principes d'architecture d'infrastructure résiliente : segmentation réseau, principe Zero Trust, monitoring des accès et plans de secours.",
                summaryHt = "Prensip pou bati sèvè ki solid : separe rezo yo, pa fè okenn machin konfyans san verifye (Zero Trust) ak plan pou relanse sèvis si gen pann.",
                contentFr = """
                    1. Le modèle architectural Zero Trust :
                    L'architecture d'infrastructure d'AJ-TECH repose sur le principe « Ne jamais faire confiance, toujours vérifier » (Zero Trust). Aucune requête, qu'elle provienne de l'intérieur ou de l'extérieur du réseau, n'est présumée légitime sans authentification cryptographique et autorisation explicite.
                    
                    2. Segmentation et pare-feux réseau :
                    - Cloisonnement strict entre les serveurs frontaux publics (DMZ) et les bases de données internes isolées ;
                    - Fermeture systématique de tous les ports réseau non indispensables ;
                    - Utilisation de réseaux privés virtuels (VPN) et de tunnels chiffrés pour toute administration à distance.
                    
                    3. Journalisation de sécurité et auditabilité (Logging) :
                    Tous les événements d'accès, d'authentification et de modification critique sont consignés dans des journaux d'audit immuables, chiffrés et horodatés, permettant l'analyse médico-légale en cas de comportement suspect.
                    
                    4. Plan de continuité et de reprise d'activité (PCA / PRA) :
                    Stratégie de sauvegardes régulières, automatisées, chiffrées et stockées sur des supports géographiquement distincts pour garantir la restauration rapide des services en cas de sinistre physique ou cybernétique.
                """.trimIndent(),
                contentHt = """
                    1. Prensip pa fè pèsonn konfyans san verifye (Zero Trust) :
                    Tout sèvè nou yo dwe mache ak lide sa a : nenpòt kòmand oswa demann k ap rantre dwe montre bonjan prèv ak kle sekirite anvan yo kite l pase, menm si li soti anndan menm biwo a.
                    
                    2. Separe rezo yo ak bon baryè (Firewalls) :
                    - Mete gwo distans ant sitwèb tout moun wè sou entènèt ak kote baz done ki gen enfòmasyon sekrè yo ye ;
                    - Fèmen tout pòt nan rezo a ki pa sèvi anyen ;
                    - Travay sou sèvè yo a distans sèlman nan kanal sekirite espesyal (VPN).
                    
                    3. Ekri tout sa k ap pase nan yon liv jounal sekirite :
                    Tout moun ki konekte, tout modpas ki tape ak tout chanjman enpòtan dwe ekri nan yon jounal espesyal ki pa ka chanje, pou si gen yon bagay sispèk nou ka wè sa k te pase a touswit.
                    
                    4. Plan pou relanse sèvis rapid si gen gwo pann (PCA / PRA) :
                    Fè sovgad tout done yo otomatikman chak jou, kache yo ak bon kle, epi mete kopi yo nan plizyè kote diferan pou si yon machin ta pran dife oswa kraze, nou ka remete tout sèvis yo sou pye rapid.
                """.trimIndent(),
                plannedStartPage = 416,
                plannedEndPage = 419,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 97 : Sécurité des paiements numériques ====================
            BookChapter(
                id = "ch_7_97",
                chapterNumber = 97,
                partId = "part_7",
                titleFr = "Chapitre 97 — Sécurité des paiements numériques",
                titleHt = "Chapit 97 — Sekirite nan peman ak zafè lajan sou entènèt",
                subtitleFr = "Enjeux futurs d'AJ-Pay et AJ-Wallet : lutte anti-fraude, conformité BRH et intégrité transactionnelle",
                subtitleHt = "Gwo defi pou pi devan pou AJ-Pay ak AJ-Wallet : anpeche vòlè, respekte lwa BRH ak pwoteje tranzaksyon",
                summaryFr = "Analyse prospective des exigences de sécurité et de conformité applicables aux futurs modules de paiement et de portefeuille numérique.",
                summaryHt = "Analiz sou gwo kondisyon sekirite ak lwa labank ki dwe respekte pou zouti peman ak bous lajan lè yo va pare pi devan.",
                contentFr = """
                    1. Transparence absolue et rappel du statut :
                    Ni AJ-Pay ni AJ-Wallet ne sont des services financiers opérationnels à ce jour. AJ-TECH n'est pas une institution bancaire, ne gère aucun fonds monétaire et ne traite aucune transaction réelle actuellement. Les principes exposés ici constituent le cahier des charges technique et sécuritaire requis pour tout développement futur.
                    
                    2. Intégrité absolue et non-répudiation des transactions :
                    Toute transaction financière future devra être atomique (propriétés ACID), signée cryptographiquement et validée par des protocoles garantissant qu'aucune somme ne puisse être dupliquée, altérée ou contestée sans preuve mathématique.
                    
                    3. Prévention active de la fraude et détection d'anomalies :
                    - Limitation stricte des plafonds de transfert pour les nouveaux comptes ;
                    - Détection comportementale des tentatives de piratage (changements soudains de localisation, échecs répétés de codes secrets) ;
                    - Authentification forte systématique (3D Secure / biométrie locale) avant validation finale du débit.
                    
                    4. Conformité réglementaire et lutte contre la criminalité financière :
                    Respect absolu des directives de la Banque de la République d'Haïti (BRH) et des normes internationales relatives à l'identification des clients (KYC) et à la prévention du blanchiment de capitaux (LCB-FT).
                """.trimIndent(),
                contentHt = """
                    1. Verite total sou nivo nou ye jodi a :
                    AJ-Pay ak AJ-Wallet se pa sèvis lajan k ap mache sou mache a kounye a. AJ-TECH se pa yon bank, li pa pran lajan moun sere epi li pa fè okenn tranzaksyon kòb reyèl jodi a. Tout sa n ap eksplike la a se règ sekirite n ap prepare pou lè zouti sa yo va pare pi devan.
                    
                    2. Pwoteje chak santim ak gwo kalkil sekirite :
                    Chak transfè kòb dwe gen bonjan siyati elektwonik, li dwe fèt nèt oswa pa fèt ditou, pou yon moun pa janm ka voye menm lajan an de fwa oswa modifye chif yo.
                    
                    3. Veye sou vòlè ak moun k ap fè magouy :
                    - Mete limit sou kantite kòb yon nouvo moun ka voye ;
                    - Veye si gen yon moun ki soti nan yon lòt peyi ki vle pran kont lan sibit ;
                    - Mande anprent dwèt oswa kòd sekrè espesyal anvan kòb la soti sou kont lan.
                    
                    4. Respekte tout lwa Labank Santral (BRH) :
                    Respekte tout règ BRH mande sou konnen kiyès k ap itilize sistèm nan (KYC) epi veye pou pèsonn pa sèvi ak sistèm nan pou lave move lajan sal.
                """.trimIndent(),
                plannedStartPage = 420,
                plannedEndPage = 423,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 98 : Protection des utilisateurs ====================
            BookChapter(
                id = "ch_7_98",
                chapterNumber = 98,
                partId = "part_7",
                titleFr = "Chapitre 98 — Protection des utilisateurs",
                titleHt = "Chapit 98 — Pwoteje tout moun k ap itilize aplikasyon yo",
                subtitleFr = "Ergonomie sécurisante, remparts contre l'hameçonnage et protection des populations vulnérables",
                subtitleHt = "Ekran ki klè pou pa twonpe moun, baryè kont piyajè sou entènèt ak pwoteje moun ki fèb",
                summaryFr = "Conception d'interfaces protectrices : comment le design et l'ergonomie logicielle empêchent les erreurs humaines et déjouent l'ingénierie sociale.",
                summaryHt = "Fason pou desine aplikasyon an pou l ede moun pa fè erè epi pou l anpeche move moun nan lari twonpe yo.",
                contentFr = """
                    1. L'ergonomie au service de la sécurité (Security UX) :
                    La sécurité ne doit pas être complexe ou incompréhensible pour l'usager ordinaire. Une interface mal conçue pousse l'utilisateur à contourner les mesures de sécurité ou à valider des actions dangereuses sans les comprendre.
                    
                    2. Prévention de l'ingénierie sociale et du phishing :
                    - Messages d'avertissement explicites et rédigés en Kreyòl Ayisyen avant toute action sensible (partage de document, changement de mot de passe, suppression de données) ;
                    - Rappel constant dans les interfaces : « Aucun agent d'AJ-TECH ne vous demandera jamais votre mot de passe ou votre code secret » ;
                    - Signalement facile et en un clic des comportements suspects ou des messages frauduleux.
                    
                    3. Protection renforcée des mineurs et des débutants :
                    Paramètres de confidentialité configurés par défaut sur le niveau de protection maximal (Privacy by Default), sans partage public non intentionnel.
                """.trimIndent(),
                contentHt = """
                    1. Desine ekran yo pou ede moun rete an sekirite (Security UX) :
                    Sekirite pa dwe yon bagay ki twò konplike pou moun senp konprann. Si yon bouton pa klè, moun nan ka klike sou yon move bagay san l pa rann li kont.
                    
                    2. Pwoteje moun kont moun k ap vin twonpe yo (Phishing) :
                    - Mete bèl ti mesaj avètisman an Kreyòl Ayisyen anvan yon moun efase yon bagay oswa chanje modpas li ;
                    - Toujou ekri klè nan aplikasyon an : « Okenn moun nan AJ-TECH pap janm mande w modpas ou oswa kòd sekrè w » ;
                    - Mete yon ti bouton senp pou moun ka rapòte si gen yon moun k ap eseye twonpe yo.
                    
                    3. Pwoteje timoun ak moun ki fenk kòmanse :
                    Lè yon moun fenk kreye yon kont, tout paramèt sekirite yo dwe deja fèmen nan nivo ki pi wo a pou enfòmasyon l yo pa parèt deyò san l pa vle.
                """.trimIndent(),
                plannedStartPage = 424,
                plannedEndPage = 427,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 99 : Vie privée et responsabilité technologique ====================
            BookChapter(
                id = "ch_7_99",
                chapterNumber = 99,
                partId = "part_7",
                titleFr = "Chapitre 99 — Vie privée et responsabilité technologique",
                titleHt = "Chapit 99 — Lavi prive ak responsablite moun k ap kreye teknoloji",
                subtitleFr = "Éthique de l'ingénieur, refus du capitalisme de surveillance et primauté du citoyen",
                subtitleHt = "Konsyans moun k ap ekri kòd, refize espyone moun pou fè lajan epi mete sitwayen an an premye",
                summaryFr = "Réflexion éthique sur la responsabilité des développeurs et le choix fondamental d'une technologie respectueuse de la dignité humaine.",
                summaryHt = "Refleksyon moral sou responsablite moun k ap bati lojisyèl pou yo pa janm sèvi ak teknoloji pou fè abi sou moun.",
                contentFr = """
                    1. La responsabilité éthique de l'ingénieur logiciel :
                    Les lignes de code écrites par les développeurs façonnent la vie quotidienne de millions d'individus. Cette puissance technique confère une responsabilité morale immense : refuser de créer des fonctionnalités addictives, trompeuses (Dark Patterns) ou attentatoires aux libertés fondamentales.
                    
                    2. Rejet du modèle économique de la surveillance :
                    Les monopoles mondiaux du numérique ont bâti leur fortune sur le pistage systématique des comportements, l'analyse des émotions et la monétisation de la vie privée. AJ-TECH rejette catégoriquement ce modèle d'affaires prédateur.
                    
                    3. Le logiciel libre et ouvert comme garantie de transparence :
                    La publication de spécifications ouvertes et la vérifiabilité du code constituent la seule garantie authentique qu'un système ne contient aucune porte dérobée (Backdoor) ni mécanisme d'espionnage clandestin.
                """.trimIndent(),
                contentHt = """
                    1. Responsablite moral moun k ap ekri kòd :
                    Liy kòd enjenyè yo ekri deside sou fason moun viv chak jou. Gwo fòs sa a mande anpil konsyans : refize kreye zouti pou fè moun vin esklav ekran oswa pou vòlè libète yo.
                    
                    2. Refize modèl biznis k ap espyone moun :
                    Gwo konpayi etranje yo vin rich paske y ap swiv tout sa moun ap fè, gade sa yo renmen epi vann lavi prive yo bay lòt moun. AJ-TECH refize tout kalite modèl biznis konsa nèt.
                    
                    3. Montre kòd la aklè pou tout moun wè :
                    Lè kòd la ak dokiman yo ouvè pou tout moun ka egzamine yo, se sèl garanti ki bay lasirans pa gen okenn ti pòt kache pou espyone moun pa dèyè.
                """.trimIndent(),
                plannedStartPage = 428,
                plannedEndPage = 431,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 100 : Intelligence artificielle et sécurité ====================
            BookChapter(
                id = "ch_7_100",
                chapterNumber = 100,
                partId = "part_7",
                titleFr = "Chapitre 100 — Intelligence artificielle et sécurité",
                titleHt = "Chapit 100 — Entèlijans atifisyèl ak sekirite",
                subtitleFr = "Protection des données sensibles, injection de prompts, hallucinations et supervision humaine",
                subtitleHt = "Pwoteje enfòmasyon sekrè, danje nan bay move lòd (Prompt Injection), manti IA ak kontwòl moun",
                summaryFr = "Analyse des risques de sécurité spécifiques aux modèles d'IA générative : fuite de données, attaques par injection et impératif de validation humaine.",
                summaryHt = "Analiz sou danje espesyal Entèlijans Atifisyèl pote : pa voye done sekrè ba li, veye sou moun k ap twonpe l ak enpòtans pou moun toujou verifye sa l fè.",
                contentFr = """
                    1. Les nouveaux vecteurs de risques liés à l'IA :
                    L'intégration de l'Intelligence Artificielle générative introduit des défis de sécurité inédits qui exigent des protocoles de défense adaptés :
                    - Fuite de données confidentielles : Risque d'envoyer des informations sensibles ou des données médicales d'utilisateurs vers des serveurs d'entraînement distants ;
                    - Attaques par injection de requêtes (Prompt Injection) : Tentatives de manipuler le modèle pour lui faire exécuter des instructions malveillantes ou contourner ses garde-fous ;
                    - Hallucinations non détectées : Production de réponses inexactes présentées avec une certitude trompeuse.
                    
                    2. Principes de sécurité appliqués chez AJ-TECH :
                    - Filtrage strict et anonymisation préalable : Aucune donnée nominative ou sensible n'est transmise aux modèles d'IA sans anonymisation irréversible ;
                    - Principe de l'humain dans la boucle (Human-in-the-Loop) : Aucune décision critique (médicale, financière ou juridique) ne peut être automatisée sans validation explicite d'un être humain qualifié.
                """.trimIndent(),
                contentHt = """
                    1. Nouvo danje ki vini ak Entèlijans Atifisyèl (IA) :
                    Lè n ap sèvi ak IA, gen nouvo kalite pwoblèm sekirite ki parèt :
                    - Done sekrè ki ka chape : Danje pou voye enfòmasyon prive oswa dosye lasante moun bay sèvè etranje san konnen ;
                    - Moun k ap twonpe sistèm nan (Prompt Injection) : Moun k ap bay IA a vye kòmand espesyal pou fè l kraze règleman sekirite l yo ;
                    - Manti ak erè IA fè (Hallucinations) : IA a ka di bagay ki pa vre ditou men ki sanble vre anpil.
                    
                    2. Règleman sekirite AJ-TECH pran pou IA :
                    - Retire tout non ak enfòmasyon sekrè anvan nou voye yon kesyon bay IA ;
                    - Se moun ki pou toujou pran desizyon final la (Human-in-the-Loop) : Okenn gwo desizyon sou lasante, sou lajan oswa sou lwa pa dwe janm fèt pa IA sèlman san yon moun responsab pa verifye l.
                """.trimIndent(),
                plannedStartPage = 432,
                plannedEndPage = 435,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 101 : Résilience numérique ====================
            BookChapter(
                id = "ch_7_101",
                chapterNumber = 101,
                partId = "part_7",
                titleFr = "Chapitre 101 — Résilience numérique",
                titleHt = "Chapit 101 — Kapasite pou reziste anba tout difikilte (Résilience)",
                subtitleFr = "Conception pour la panne, tolérance aux coupures électriques et réseau, et reprise locale",
                subtitleHt = "Bati kòd pou lè gen pann, mache menm lè pa gen kouran ak entènèt epi relanse sèvis lokalman",
                summaryFr = "Stratégie d'ingénierie pour la résilience extrême : fonctionnement hors-ligne, tolérance aux pannes d'infrastructure et intégrité des données.",
                summaryHt = "Fason pou bati aplikasyon ki ka kenbe tèt anba tout gwo difikilte : mache san entènèt, pa pèdi done lè kouran koupe epi relanse fasil.",
                contentFr = """
                    1. L'ingénierie de la résilience en milieu hostile :
                    En Haïti, la panne d'électricité ou l'interruption soudaine d'Internet ne sont pas des événements exceptionnels, mais des conditions opérationnelles normales. Un système qui s'arrête ou perd ses données dès que la connexion flanche est inadapté à notre réalité.
                    
                    2. Principes architecturaux de résilience :
                    - Paradigme Offline-First intégral : Les applications continuent de fonctionner localement sur la base de données de l'appareil (Room / SQLite) et synchronisent de manière asynchrone dès que la connectivité est rétablie ;
                    - Persistance transactionnelle immédiate : Tout changement d'état est écrit sur disque avant acquittement pour prévenir la corruption lors d'un arrêt brutal ;
                    - Frugalité en bande passante : Compression maximale des flux et utilisation de caches différentiels intelligents.
                """.trimIndent(),
                contentHt = """
                    1. Bati lojisyèl ki pare pou tout difikilte :
                    An Ayiti, kouran ki koupe ak entènèt ki disparèt se pa bagay ki rive yon fwa konsa, se lavi chak jou. Yon aplikasyon ki pèdi done moun lè entènèt koupe se yon zouti ki pa bon pou peyi nou.
                    
                    2. Prensip solid nou itilize pou sistèm yo pa janm bloke :
                    - Mache san entènèt an premye (Offline-First) : Aplikasyon an ap fonksyone nòmalman sou telefòn lan menm lè pa gen rezo, epi l ap voye enfòmasyon yo pita lè entènèt tounen ;
                    - Sere tout bagay touswit sou aparèy la pou si telefòn lan etenn sibit, okenn ti lèt pa janm pèdi ;
                    - Pa gaspiye megabay : Diminye gwosè tout fichye yo pou yo pase byen vit sou ti rezo ki fèb.
                """.trimIndent(),
                plannedStartPage = 436,
                plannedEndPage = 439,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 102 : Sensibilisation et culture de cybersécurité ====================
            BookChapter(
                id = "ch_7_102",
                chapterNumber = 102,
                partId = "part_7",
                titleFr = "Chapitre 102 — Sensibilisation et culture de cybersécurité",
                titleHt = "Chapit 102 — Fòmasyon ak kilti sekirite pou tout moun",
                subtitleFr = "Une chaîne collective de responsabilité : du développeur au citoyen utilisateur",
                subtitleHt = "Yon responsablite pou tout moun : soti nan enjenyè ki ekri kòd rive nan chak moun ki kenbe yon telefòn",
                summaryFr = "Promotion d'une culture nationale de la sécurité numérique à travers l'éducation, la formation continue et l'hygiène informatique.",
                summaryHt = "Pouse pou tout moun nan peyi a konprann sekirite nimerik gras ak bon fòmasyon ak bon abitid sou telefòn ak òdinatè.",
                contentFr = """
                    1. L'humain : premier maillon et rempart essentiel :
                    Les pare-feux et les algorithmes de chiffrement les plus sophistiqués restent impuissants si les utilisateurs partagent imprudemment leurs identifiants ou cliquent sur des liens malveillants. La cybersécurité est avant tout une culture partagée.
                    
                    2. Les règles d'hygiène numérique fondamentales pour tous :
                    - Utilisation de mots de passe longs, complexes et uniques pour chaque service ;
                    - Activation systématique de la double authentification (2FA) sur tous les comptes personnels ;
                    - Méfiance réflexe face aux messages urgents promettant des gains financiers ou exigeant des actions immédiates ;
                    - Mise à jour régulière des systèmes d'exploitation et des applications.
                    
                    3. Le rôle éducatif d'EDUKA et d'AJ-Learn :
                    Intégrer des modules interactifs de sensibilisation à la cybersécurité dès le niveau fondamental pour préparer les jeunes citoyens aux réalités du monde numérique.
                """.trimIndent(),
                contentHt = """
                    1. Se moun ki pi gwo pwoteksyon yon sistèm :
                    Menm si w gen pi gwo lojisyèl sekirite sou latè, si yon moun bay modpas li oswa li klike sou yon vye lyen piyajè voye ba li, tout bagay ka kraze. Sekirite se yon bon abitid tout moun dwe genyen.
                    
                    2. Bon ti règleman senp tout moun dwe swiv chak jou :
                    - Mete modpas ki long, ki gen lèt, chif ak senbòl, epi pa janm mete menm modpas sou de kont diferan ;
                    - Toujou aktive sekirite an de etap (2FA) sou WhatsApp, imèl ak tout kont ou genyen ;
                    - Pa janm klike sou vye mesaj ki di w genyen gwo kòb oswa ki mande w kouri voye kòd sekrè w ;
                    - Toujou mete telefòn ou ak aplikasyon w yo a jou lè gen nouvo vèsyon.
                    
                    3. Sa EDUKA ak AJ-Learn pral fè pou anseye moun :
                    Mete bèl ti leson senp sou sekirite depi nan lekòl primè pou tout timoun grandi ak bonjan konesans sou fason pou yo pwoteje tèt yo sou entènèt.
                """.trimIndent(),
                plannedStartPage = 440,
                plannedEndPage = 443,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 103 : Gouvernance et politiques numériques ====================
            BookChapter(
                id = "ch_7_103",
                chapterNumber = 103,
                partId = "part_7",
                titleFr = "Chapitre 103 — Gouvernance et politiques numériques",
                titleHt = "Chapit 103 — Règleman, lwa ak bon jan gouvènans nimerik",
                subtitleFr = "Cadres internes, conformité, gestion méthodique des risques et reddition de comptes",
                subtitleHt = "Règ anndan antrepriz la, respekte lalwa, kontwole danje yo epi rann kont sou tout sa k ap fèt",
                summaryFr = "Mise en place de structures de gouvernance interne rigoureuses : politiques de sécurité, gestion des risques et audits documentaires.",
                summaryHt = "Mete bonjan estrikti jesyon solid : règleman sekirite klè, siveye tout danje ki ka parèt epi verifye tout kòd aklè.",
                contentFr = """
                    1. La gouvernance comme garantie de pérennité :
                    La sécurité technique ne produit des résultats durables que si elle est encadrée par des politiques organisationnelles strictes, documentées et régulièrement révisées.
                    
                    2. Politiques internes d'AJ-TECH :
                    - Politique de contrôle d'accès : Attribution des droits d'accès sur la base du strict besoin d'en connaître (Need-to-Know) ;
                    - Politique de gestion des incidents : Protocole d'escalade, de confinement et de notification transparente aux utilisateurs dans les meilleurs délais en cas de brèche avérée ;
                    - Politique de révision de code : Aucune ligne de code n'est déployée sans validation formelle par un second développeur (Peer Review) et réussite des tests automatisés.
                    
                    3. Transparence sur les audits :
                    AJ-TECH n'a fait l'objet d'aucun audit de sécurité externe payant ni d'aucune certification ISO à ce jour. Les contrôles sont actuellement assurés par des revues internes rigoureuses et des suites de tests unitaires/Robolectric automatisées.
                """.trimIndent(),
                contentHt = """
                    1. Bon jesyon fè sekirite a dire lontan :
                    Bèl kòd sèlman pa sifi si pa gen bon règleman fiks nan konpayi an pou tout moun swiv chak jou.
                    
                    2. Règ nou mete anndan AJ-TECH :
                    - Pèsonn pa gen dwa sou dosye li pa bezwen pou travay li ;
                    - Plan klè pou lè gen pwoblèm : konnen kisa pou fè rapid epi avèti moun yo nan laverite si gen yon pwoblèm ki rive ;
                    - Okenn kòd pa ka monte sou aplikasyon an si yon lòt enjenyè pa t verifye l epi si tout tès otomatik yo pa t pase ak siksè.
                    
                    3. Verite sou zafè sètifika ak kontwòl deyò :
                    AJ-TECH pa t peye okenn gwo konpayi etranje pou fè gwo kontwòl (Audit ISO) kounye a. Se nou menm k ap fè bonjan verifikasyon sevè nan kòd la ak bon tès otomatik sou machin chak jou.
                """.trimIndent(),
                plannedStartPage = 444,
                plannedEndPage = 446,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 104 : Coopération internationale en cybersécurité ====================
            BookChapter(
                id = "ch_7_104",
                chapterNumber = 104,
                partId = "part_7",
                titleFr = "Chapitre 104 — Coopération internationale en cybersécurité",
                titleHt = "Chapit 104 — Kolaborasyon entènasyonal sou zafè sekirite",
                subtitleFr = "Perspectives d'échanges d'informations, veille sur les menaces et solidarité technologique",
                subtitleHt = "Plan pou pataje enfòmasyon sou danje yo ak travay ansanm ak lòt peyi pou pwoteje rezo a",
                summaryFr = "Importance de la coopération régionale et internationale pour faire face aux cybermenaces transfrontalières, sans partenariats fictifs.",
                summaryHt = "Enpòtans pou travay ansanm ak lòt peyi nan Karayib la ak nan mond lan pou bare vòlè sou entènèt, san bay manti sou patenarya ki poko siyen.",
                contentFr = """
                    1. La cybercriminalité ne connaît pas de frontières :
                    Les attaques informatiques, les réseaux de logiciels malveillants (Botnets) et les campagnes d'hameçonnage opèrent à l'échelle planétaire. Aucun pays ne peut se protéger efficacement dans un isolement total.
                    
                    2. Perspectives futures de coopération recherchées :
                    - Échange de renseignements sur les menaces (Threat Intelligence) avec les équipes de réponse aux incidents de sécurité (CSIRT / CERT) de la région caraïbéenne ;
                    - Participation aux communautés open source mondiales dédiées à la cybersécurité défensive ;
                    - Contribution aux bases de données publiques de vulnérabilités pour signaler les failles corrigées.
                    
                    3. Transparence sur les alliances :
                    Ces coopérations constituent des objectifs stratégiques à bâtir au fil de la montée en maturité de l'écosystème. Aucun accord de coopération bilatérale n'est formalisé à ce jour.
                """.trimIndent(),
                contentHt = """
                    1. Move moun sou entènèt pa gen baryè peyi :
                    Gwo atak enfòmatik ak vòlè sou entènèt ap travay nan tout mond lan an menm tan. Okenn peyi pa ka pwoteje tèt li si l rete poukont li nan kwen l.
                    
                    2. Kalite travay ansanm nou ta renmen fè pi devan :
                    - Pataje enfòmasyon sou nouvo move viris ak lòt ekip sekirite nan Karayib la ;
                    - Patisipe nan gwo kominote entènasyonal k ap travay sou lojisyèl gratis pou defann sistèm yo ;
                    - Ede rapòte epi korije twou sekirite pou tout moun sou latè ka rete an sekirite.
                    
                    3. Verite sou patenarya sa yo :
                    Tout bèl plan sa yo se relasyon nou vle bati ti pa ti pa lè nou va pare. Nou pa gen okenn gwo kontra entènasyonal ki siyen jodi a (Sa se : Pou defini / An kou konsepsyon).
                """.trimIndent(),
                plannedStartPage = 447,
                plannedEndPage = 448,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            ),

            // ==================== CHAPITRE 105 : La stratégie de sécurité numérique 2026–2035 ====================
            BookChapter(
                id = "ch_7_105",
                chapterNumber = 105,
                partId = "part_7",
                titleFr = "Chapitre 105 — La stratégie de sécurité numérique 2026–2035",
                titleHt = "Chapit 105 — Plan estrateji sekirite nimerik 2026–2035",
                subtitleFr = "Jalons décennaux : socle défensif, auditabilité structurée, résilience souveraine et autonomie nationale",
                subtitleHt = "Gwo etap sou 10 lane : fondasyon sekirite, bon kontwòl, kapasite pou reziste ak libète teknolojik",
                summaryFr = "Feuille de route stratégique décennale de la sécurité et de la souveraineté numérique d'AJ-TECH en quatre phases progressives.",
                summaryHt = "Plan travay sou 10 lane pou devlope sekirite ak souvrenete nimerik peyi a an kat gwo faz.",
                contentFr = """
                    1. Nature prospective de la feuille de route :
                    Les jalons ci-dessous représentent les orientations directrices de notre effort d'ingénierie pour la prochaine décennie.
                    
                    2. Les quatre phases de la stratégie 2026–2035 :
                    
                    - Phase 1 (2026–2027) — Fondamentaux & Hygiène de sécurité :
                      - Intégration stricte des pratiques de développement sécurisé sur l'ensemble du code existant ;
                      - Chiffrement systématique au repos et en transit pour la PWA AJ-Task et l'application centrale ;
                      - Élimination totale des secrets codés en dur et mise en place de politiques de gestion des clés.
                    
                    - Phase 2 (2028–2030) — Systèmes de sécurité structurés & Surveillance :
                      - Implémentation de modules de journalisation de sécurité et d'auditabilité interne ;
                      - Formalisation des protocoles d'authentification robuste (Passkeys / MFA) pour les services connectés ;
                      - Début des études d'ingénierie pour des infrastructures d'hébergement locales résilientes.
                    
                    - Phase 3 (2031–2033) — Maturité, Résilience & Prévention avancée :
                      - Déploiement de protocoles de détection d'anomalies et d'intégrité transactionnelle pour AJ-Pay ;
                      - Mise en place de plans de continuité d'activité multi-sites avec réplication chiffrée ;
                      - Premières collaborations techniques d'échange de renseignements sur les menaces régionales.
                    
                    - Phase 4 (2034–2035) — Souveraineté technologique nationale & Rayonnement :
                      - Établissement d'une infrastructure cloud souveraine haïtienne opérationnelle et écologiquement autonome ;
                      - Autonomie complète dans la maintenance, l'audit et la sécurisation des systèmes critiques nationaux ;
                      - Contribution majeure à la position d'Haïti comme acteur respecté de la cybersécurité défensive dans la Caraïbe.
                    
                    3. Conclusion de la Partie VII :
                    La souveraineté numérique ne se décrète pas : elle se forge jour après jour par la rigueur du code, la protection scrupuleuse des citoyens et le refus inébranlable de toute compromission sur la vérité et la sécurité.
                """.trimIndent(),
                contentHt = """
                    1. Kisa plan estratejik sa a vle di :
                    Etap ak dat sa yo se yon gid pou oryante travay enjenyri nou pou 10 lane k ap vini yo, se pa yon bagay ki fini deja.
                    
                    2. Kat gwo faz nan plan sekirite 2026–2035 lan :
                    
                    - Faz 1 (2026–2027) — Bati bon baz sekirite debaz :
                      - Aplike bon règleman sekirite nan tout kòd nou deja ekri yo ;
                      - Fèmen tout done ak bon kle chifreman sou PWA AJ-Task ak nan aplikasyon an ;
                      - Retire tout kle sekrè nan kòd la epi mete bon zouti pou kache yo.
                    
                    - Faz 2 (2028–2030) — Mete bon sistèm kontwòl ak siveyans :
                      - Mete bon jounal sekirite pou wè tout sa k ap pase sou sèvè yo ;
                      - Mete bon sistèm pou verifye idantite moun an de etap (Passkeys / MFA) ;
                      - Kòmanse etidye kijan pou n bati premye ti sèvè ki gen kouran solèy nan peyi a.
                    
                    - Faz 3 (2031–2033) — Vin pi solid ak pi fò kont tout danje :
                      - Mete gwo zouti sekirite pou pwoteje tranzaksyon lè AJ-Pay va pare ;
                      - Mete sistèm sovgad nan plizyè zòn diferan pou sèvis pa janm koupe ;
                      - Kòmanse travay ak lòt ekip nan Karayib la pou veye sou move viris.
                    
                    - Faz 4 (2034–2035) — Vin mèt tèt nou tout bon nan teknoloji :
                      - Genyen bonjan sant sèvè nasyonal (Cloud) k ap mache ak kouran pwòp sou tè Ayiti a ;
                      - Genyen tout enjenyè lakay nou pou verifye ak repare tout gwo sistèm peyi a san èd deyò ;
                      - Fè Ayiti vin yon gwo modèl respekte nan zafè sekirite enfòmatik nan tout Karayib la.
                    
                    3. Konklizyon Pati VII la :
                    Souvrenete nimerik se pa yon senp diskou : se yon bagay ki bati chak jou ak bon kòd solid, ak bon pwoteksyon pou chak sitwayen epi ak refize fè bak sou laverite ak sekirite peyi nou.
                """.trimIndent(),
                plannedStartPage = 449,
                plannedEndPage = 450,
                estimatedReadMinutes = 5,
                status = BookContentStatus.IN_PROGRESS
            )
        )
    )
}

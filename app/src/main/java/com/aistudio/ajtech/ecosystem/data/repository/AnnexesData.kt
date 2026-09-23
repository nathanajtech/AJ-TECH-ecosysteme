package com.aistudio.ajtech.ecosystem.data.repository

import com.aistudio.ajtech.ecosystem.data.model.BookChapter
import com.aistudio.ajtech.ecosystem.data.model.BookContentStatus
import com.aistudio.ajtech.ecosystem.data.model.BookPart
import com.aistudio.ajtech.ecosystem.data.model.PartType

object AnnexesData {
    val partAnnexes: BookPart = BookPart(
        id = "part_annexes",
        partNumber = null,
        type = PartType.BACK_MATTER,
        titleFr = "ANNEXES",
        titleHt = "ANÈKS",
        subtitleFr = "Fiche technique de l'application et glossaire technologique bilingue",
        subtitleHt = "Fich teknik aplikasyon an ak glosè teknolojik bileng",
        plannedPages = "pp. 215–218",
        status = BookContentStatus.AVAILABLE,
        chapters = listOf(
            BookChapter(
                id = "annex_1_fiche_technique",
                chapterNumber = 1,
                partId = "part_annexes",
                titleFr = "Annexe 1 — Fiche Technique de l'Écosystème et de l'Application",
                titleHt = "Anèks 1 — Fich Teknik Ekosistèm ak Aplikasyon an",
                subtitleFr = "Architecture logicielle, pile technologique, structure éditoriale et état de maturité",
                subtitleHt = "Achitekti lojisyèl, teknoloji yo itilize, estrikti edisyon an ak eta reyèl devlopman an",
                summaryFr = "Fiche d'ingénierie détaillant l'architecture MVVM/Clean Architecture de l'application Android, les technologies Jetpack Compose et Kotlin, l'organisation des 175 sections, le moteur de recherche et de partage, ainsi que les engagements de transparence et les limites actuelles.",
                summaryHt = "Fich teknik konplè ki eksplike achitekti MVVM aplikasyon Android la, teknoloji Jetpack Compose ak Kotlin, òganizasyon 175 seksyon yo, zouti rechèch ak pataj, ansanm ak prensip transparans ak limit aktyèl yo.",
                contentFr = """
                    1. Architecture globale de l'application
                    L'application AJ-TECH Écosystème est conçue selon les principes stricts de la Clean Architecture et du patron Model-View-ViewModel (MVVM) moderne, avec un flux unidirectionnel de données (Unidirectional Data Flow - UDF).
                    - Couche Présentation : Réalisée intégralement en Jetpack Compose, découplée de toute logique métier grâce à des ViewModels réactifs exposant des flux d'état (StateFlow).
                    - Couche Domaine & Données : Structurée autour de dépôts immuables (Repository Pattern) encapsulant les 22 entités d'ingénierie et les 175 sections du livre officiel, garantissant une intégrité des données sans effets de bord.
                    - Persistance & État local : Gestion transparente du cache et des signets (Bookmarks) via SQLite / Room Database et sérialisation typée, garantissant un fonctionnement 100% hors-ligne (Offline-First).

                    2. Technologies et composants utilisés
                    - Langage de programmation : Kotlin 100% (syntaxe moderne, Coroutines, StateFlow, Flow).
                    - Framework UI : Jetpack Compose avec le système de design Material Design 3 (M3).
                    - Palette visuelle officielle : Bleu Roi Haïtien (#0A192F), Or Solaire (#FFD700), Rouge National (#D21034), Bleu Électrique (#00D2FF) et Blanc Pur (#FFFFFF).
                    - Navigation : Architecture de navigation déclarative avec gestion d'état centralisée et préservation du cycle de vie.
                    - Accessibilité & Ergonomie : Respect rigoureux des cibles tactiles de 48dp minimum, prise en charge adaptative du multi-fenêtrage et des écrans larges (BoxWithConstraints).

                    3. Structure du livre officiel
                    L'ouvrage s'étend sur 218 pages réparties en 175 sections au total :
                    - Documents liminaires (Devant-livre) : 7 sections (pp. 1–14) comprenant la Dédicace, les Remerciements, la Préface, le Manifeste AJ-TECH, la Biographie de Jonathan Germain, l'Avant-propos méthodologique et l'Introduction générale.
                    - Corps principal de l'ouvrage : 166 chapitres numérotés séquentiellement répartis dans les Parties I à XI (pp. 15–214). Le chapitre 166 (« L’avenir reste à construire ») constitue le terminus officiel des chapitres principaux.
                    - Annexes (Arrière-livre) : 2 annexes de référence (pp. 215–218), comprenant l'Annexe 1 — Fiche technique (pp. 215–216) et l'Annexe 2 — Glossaire technologique bilingue (pp. 217–218).

                    4. Organisation et modélisation des données
                    - Entités de l'écosystème (22 entités officielles) : Modélisées par la classe de données `EcosystemEntity` regroupées en 8 pôles (Logiciels utilitaires, Éducation et savoir, Infrastructures et énergie, Santé et bien-être, Économie et finance, Communication et médias, Cartographie et IA, Philanthropie et gouvernance).
                    - Chapitres et parties : Modélisés par `BookPart` (FRONT_MATTER, MAIN_PART, BACK_MATTER) et `BookChapter` comportant titre, sous-titre, résumé, contenu bilingue intégral, pagination prévisionnelle, temps de lecture estimé et statut éditorial.

                    5. Fonctionnalités principales du lecteur
                    - Bilinguisme instantané : Bascule en temps réel entre le Français et le Kreyòl Ayisyen sans perte de contexte ni de position de lecture.
                    - Table des matières interactive : Vue hiérarchique avec filtrage visuel par partie, indicateurs d'état et navigation directe.
                    - Mode lecture épuré : Typographie calibrée pour la lisibilité sur appareil mobile avec contrôle d'affichage des sous-sections.

                    6. Recherche, signets, progression et partage
                    - Moteur de recherche plein texte : Recherche instantanée et multi-champs (titre, sous-titre, résumé, contenu intégral) fonctionnant de façon bilingue indépendante.
                    - Système de signets (Bookmarks) : Marquage et mémorisation instantanés des chapitres favoris avec horodatage et accès direct en un clic.
                    - Partage natif Android : Utilisation de l'API standard `Intent.ACTION_SEND` pour exporter un extrait formaté bilingue avec titre, résumé, contenu officiel et devise de l'écosystème.

                    7. Environnement de développement et validation
                    - SDK cible : Android SDK 34, Android Gradle Plugin 8.x, Java 17.
                    - Assurance qualité : Suite complète de tests unitaires JVM et tests d'intégration Robolectric/Roborazzi validant la navigation bidirectionnelle, l'intégrité des 22 entités et la cohérence bilingue.

                    8. État réel des fonctionnalités et transparence
                    - L'application Android de l'écosystème : 100% opérationnelle et autonome hors-ligne.
                    - PWA AJ-Task : Opérationnelle et déployée avec persistance locale IndexedDB.
                    - 21 autres entités de l'écosystème : Réparties avec rigueur entre prototypes fonctionnels, concepts d'ingénierie et visions stratégiques planifiées.

                    9. Limites actuelles et développements futurs
                    - L'édition imprimée papier (format 6x9 pouces relié en quadrichromie CMYK) est en phase de mise en page pré-presse finale.
                    - La synchronisation infonuagique distribuée via AJ-Cloud et l'intégration de la synthèse vocale en Kreyòl Ayisyen sont inscrites dans la feuille de route 2028–2030.
                """.trimIndent(),
                contentHt = """
                    1. Achitekti jeneral aplikasyon an
                    Aplikasyon AJ-TECH Ekosistèm nan fèt selon prensip Clean Architecture ak modèl MVVM modèn (Model-View-ViewModel), avèk yon sikilasyon done nan yon sèl sans (Unidirectional Data Flow - UDF).
                    - Kouch Prezantasyon : Bati 100% avèk Jetpack Compose, separe nèt ak lojik kalkil yo gras ak ViewModel ki itilize StateFlow.
                    - Kouch Done : Bati sou prensip Repository Pattern ki gen ladan l 22 antite jeni yo ak 175 seksyon liv ofisyèl la, sa ki garanti done yo rete sen epi san erè.
                    - Estokaj ak eta lokal : Jesyon kach ak makè (Bookmarks) gras ak SQLite / Room Database, ki pèmèt aplikasyon an mache 100% menm san koneksyon entènèt (Offline-First).

                    2. Teknoloji ak zouti yo itilize
                    - Langaj pwogramasyon : Kotlin 100% (Coroutines, StateFlow, Flow).
                    - Zouti pou koòdone itilizatè : Jetpack Compose avèk sistèm konsepsyon Material Design 3 (M3).
                    - Koulè ofisyèl yo : Ble Woyal Ayisyen (#0A192F), Lò Solèy (#FFD700), Wouj Nasyonal (#D21034), Ble Elektrik (#00D2FF) ak Blan Pi (#FFFFFF).
                    - Navigasyon : Achitekti navigasyon deklaratif ki kenbe tout eta san pèdi paj kote itilizatè a te ye a.
                    - Aksesibilite : Respekte gwosè minimòm 48dp pou bouton yo, adaptasyon otomatik pou tout kalite gwosè ekran (BoxWithConstraints).

                    3. Estrikti liv ofisyèl la
                    Liv la genyen yon total 218 paj ki divize an 175 seksyon ofisyèl :
                    - Dokiman preliminè (Devan-livre) : 7 seksyon (pp. 1–14) ki genyen Dedikas, Remèsiman, Prefas, Manifès AJ-TECH, Byografi Jonathan Germain, Avan-pwopo ak Entwodiksyon jeneral la.
                    - Kò prensipal liv la : 166 chapit nimewote nan lòd depi Pati I rive nan Pati XI (pp. 15–214). Chapit 166 (« Lavni an toujou rete pou konstwi ») se dènye chapit prensipal la.
                    - Anèks (Dèyè-livre) : 2 anèks referans (pp. 215–218) ki gen ladan l Anèks 1 — Fich teknik (pp. 215–216) ak Anèks 2 — Glosè teknolojik bileng (pp. 217–218).

                    4. Òganizasyon ak estrikti done yo
                    - 22 antite ekosistèm nan : Reprezante nan klas done `EcosystemEntity` ki divize an 8 poto (Lojisyèl pratik, Edikasyon ak konesans, Enfrastrikti ak enèji, Sante ak byennèt, Ekonomi ak finans, Kominikasyon ak medya, Katografi ak IA, Filantwopi ak gouvènans).
                    - Chapit ak pati yo : Reprezante nan `BookPart` (FRONT_MATTER, MAIN_PART, BACK_MATTER) ak `BookChapter` ki gen tit, sou-tit, rezime, kontni bileng konplè, paj prevwa, tan lekti ak eta redaksyon an.

                    5. Fonksyonalite prensipal lektè a
                    - Chanjman langaj rapid : Chanje ant Fransè ak Kreyòl Ayisyen an yon klik san pèdi paj kote w ap li a.
                    - Tab matyè entèaktif : Lis klè ak tout nimewo chapit, paj ak koulè estati chak seksyon.
                    - Mòd lekti senp : Tipografi ki byen kalibre pou fasilite lekti sou telefòn mobil.

                    6. Rechèch, makè, pwogresyon ak pataj
                    - Motè rechèch konplè : Rechèch rapid nan tit, sou-tit, rezime ak tout tèks la nan tou de lang yo.
                    - Sistèm makè (Bookmarks) : Posiblite pou sove nenpòt chapit pou jwenn li byen fasil apre sa.
                    - Pataj natif Android : Itilizasyon `Intent.ACTION_SEND` pou voye ekstrè ofisyèl bileng ak tout deviz ekosistèm nan.

                    7. Anviwònman devlopman ak kontwòl kalite
                    - Sistèm : Android SDK 34, Android Gradle Plugin 8.x, Java 17.
                    - Tès ak verifikasyon : Tès unitè JVM ak tès Robolectric pou verifye si tout 22 antite yo ak tout 175 seksyon yo mache san pwoblèm.

                    8. Eta reyèl ak transparans
                    - Aplikasyon Android ekosistèm nan : 100% pare epi li mache san entènèt.
                    - PWA AJ-Task : Fonksyonèl epi li sove done yo nan aparèy la (IndexedDB).
                    - Lòt 21 antite yo : Klase avèk transparans ant prototip, plan teknik ak vizyon pou lavni.

                    9. Limit aktyèl ak travay k ap vini
                    - Vèsyon enprime sou papye (fòma 6x9 pous reliye) ap prepare pou enpresyon.
                    - Senkronizasyon sou nwaj (AJ-Cloud) ak lekti vokal an Kreyòl Ayisyen planifye pou ane 2028–2030 yo.
                """.trimIndent(),
                plannedStartPage = 215,
                plannedEndPage = 216,
                estimatedReadMinutes = 4,
                status = BookContentStatus.AVAILABLE
            ),
            BookChapter(
                id = "annex_2_glossaire",
                chapterNumber = 2,
                partId = "part_annexes",
                titleFr = "Annexe 2 — Glossaire Technologique Bilingue",
                titleHt = "Anèks 2 — Glosè Teknololojik Bileng",
                subtitleFr = "Définition des concepts informatiques, d'architecture logicielle et de souveraineté numérique",
                subtitleHt = "Eksplikasyon tèm enfòmatik, achitekti lojisyèl ak souverènte nimerik",
                summaryFr = "Lexique bilingue Français / Kreyòl Ayisyen des termes fondamentaux utilisés à travers les 166 chapitres : Application, API, IA, Offline-First, PWA, Sécurité, Chiffrement, Cloud souverain, Données, Architecture logicielle, Interopérabilité et Résilience.",
                summaryHt = "Diksyonè bileng Fransè / Kreyòl Ayisyen pou mo kle yo itilize nan tout 166 chapit yo : Aplikasyon, API, IA, Offline-First, PWA, Sekirite, Chifreman, Cloud nasyonal, Done, Achitekti lojisyèl, Entè-operabilite ak Rezilyans.",
                contentFr = """
                    - Application (App) : Programme informatique conçu pour exécuter des tâches spécifiques au service direct de l'utilisateur sur mobile, ordinateur ou navigateur web.
                    
                    - API (Application Programming Interface / Interface de Programmation d'Application) : Ensemble normalisé de règles et de protocoles permettant à différents logiciels ou services d'échanger des données et de communiquer entre eux de manière sécurisée et modulaire.
                    
                    - Architecture logicielle : Structure organisationnelle fondamentale d'un système informatique, définissant ses composants, leurs relations mutuelles et les principes directeurs de sa conception (ex. MVVM, Clean Architecture, UDF).
                    
                    - Cache : Espace de mémoire tampon ultra-rapide temporairement réservé pour stocker des données fréquemment consultées afin de réduire les temps de chargement et d'économiser la bande passante.
                    
                    - Chiffrement (Chiffrage / Cryptographie) : Processus mathématique de transformation de données lisibles en texte chiffré incompréhensible pour quiconque ne possède pas la clé secrète de déchiffrement, garantissant la confidentialité et l'intégrité des informations.
                    
                    - Cloud Computing (Infonuagique) : Modèle d'accès à la demande, via un réseau de télécommunication, à des ressources informatiques partagées et configurables (serveurs, stockage, bases de données, puissance de calcul).
                    
                    - Cloud Souverain : Infrastructure d'hébergement infonuagique placée sous la juridiction, le contrôle légal et la gouvernance technique directe du pays d'exploitation, garantissant que les données nationales ne dépendent pas d'acteurs étrangers.
                    
                    - Données (Data) : Représentation numérique d'informations (textes, nombres, images, transactions) traitées, stockées ou transmises par un système informatique.
                    
                    - Développement logiciel : Ensemble des processus méthodologiques d'ingénierie (conception, écriture de code, test, débogage et maintenance) aboutissant à la création et à l'évolution de programmes informatiques.
                    
                    - IA (Intelligence Artificielle) : Champ de l'informatique dédié à la conception de modèles algorithmiques capables de simuler des aptitudes cognitives humaines (apprentissage, raisonnement, traitement du langage naturel, prise de décision contextuelle).
                    
                    - IndexedDB : Base de données NoSQL intégrée directement dans les navigateurs web modernes, permettant aux Progressive Web Apps de stocker des volumes importants de données structurées côté client.
                    
                    - Interopérabilité : Capacité éprouvée de systèmes, logiciels ou organisations hétérogènes à fonctionner ensemble et à partager des informations sans friction ni perte de précision sémantique.
                    
                    - Offline-First (Priorité au hors-ligne) : Philosophie de conception logicielle considérant le fonctionnement sans connexion Internet comme le mode nominal par défaut. L'application stocke les données localement sur l'appareil et effectue la synchronisation en tâche de fond dès qu'un réseau devient accessible.
                    
                    - PWA (Progressive Web App) : Application web moderne utilisant des technologies d'avant-garde (Service Workers, Web App Manifest) lui permettant de s'installer sur l'écran d'accueil d'un appareil, d'envoyer des notifications et de fonctionner hors-ligne à la manière d'une application native.
                    
                    - Résilience technologique : Capacité d'un système ou d'une infrastructure informatique à absorber des chocs (coupures électriques, pannes réseau, instabilité matérielle), à maintenir ses fonctions essentielles et à récupérer rapidement un état nominal.
                    
                    - Sécurité informatique (Cybersécurité) : Ensemble des pratiques, technologies et règles visant à protéger les systèmes, réseaux, programmes et données contre les accès non autorisés, les altérations malveillantes ou la destruction.
                    
                    - Souveraineté numérique : Droit, capacité et autonomie d'une nation ou d'une communauté à maîtriser ses propres infrastructures technologiques, ses logiciels, ses réseaux et les données de ses citoyens sans sujétion externe.
                """.trimIndent(),
                contentHt = """
                    - Aplikasyon (App) : Yon pwogram enfòmatik ki fèt pou ede yon itilizatè fè travay espesifik sou telefòn li, sou òdinatè oswa sou entènèt.
                    
                    - API (Interface de Programmation d'Application) : Yon ansanm règ ak estanda ki pèmèt de oswa plizyè lojisyèl kominike epi pataje enfòmasyon ant yo nan yon fason ki senp epi an sekirite.
                    
                    - Achitekti lojisyèl : Fason yon sistèm enfòmatik òganize, ki jan pati li yo konekte ansanm ak prensip gid ki te sèvi pou bati l (tankou MVVM, Clean Architecture).
                    
                    - Kach (Cache) : Yon espas memwa espesyal kote aparèy la mete done li itilize souvan pou l ka ouvri yo pi vit san li pa bezwen telechaje yo ankò.
                    
                    - Chifreman (Chiffrement) : Yon teknik matematik ki transfòme yon tèks klè an yon kòd sekrè pou okenn moun pa ka li sa k ladan l si li pa gen kle espesyal la, sa ki pwoteje done yo.
                    
                    - Cloud (Nwaj enfòmatik) : Yon rezo sèvè distan ki pèmèt estoke done, kouri pwogram ak fè kalkil sou entènèt san ou pa bezwen gen tout ekipman sa yo lakay ou.
                    
                    - Cloud Nasyonal (Cloud Souverain) : Yon sèvis nwaj enfòmatik ki kontwole anndan peyi a sou pwòp lwa nasyonal nou, pou done sitwayen yo pa rete nan men konpayi etranje sèlman.
                    
                    - Done (Data) : Tout enfòmasyon nimerik (tèks, chif, foto, tranzaksyon) ke yon òdinatè oswa yon telefòn ka trete, estoke oswa voye.
                    
                    - Devlopman lojisyèl : Tout travay ak metòd jeni ki pèmèt imajine, ekri kòd, teste epi amelyore pwogram enfòmatik yo.
                    
                    - IA (Entèlijans Atifisyèl) : Branch nan enfòmatik k ap kreye modèl ak pwogram ki kapab rezoud pwoblèm konplèks, aprann nan done, epi trete lang moun pale (tankou Kreyòl Ayisyen).
                    
                    - IndexedDB : Yon baz de done modèn ki anndan navigatè web la, ki pèmèt yon PWA sove gwo kantite done sou telefòn lan menm san entènèt.
                    
                    - Entè-operabilite : Kapasite divès lojisyèl genyen pou yo travay ansanm san pwoblèm epi pataje enfòmasyon kòrèkteman.
                    
                    - Offline-First (Priyorite pou san entènèt) : Yon metòd kreyasyon lojisyèl kote aplikasyon an fèt pou fonksyone dabò san entènèt. Li sove tout done sou aparèy la an premye, epi l ap senkronize yo pita lè entènèt disponib.
                    
                    - PWA (Progressive Web App) : Yon aplikasyon web modèn ki ka enstale sou ekran telefòn lan, ki ka voye notifikasyon epi ki mache san entènèt tankou yon vrè aplikasyon natif.
                    
                    - Rezilyans teknolojik : Kapasite yon sistèm genyen pou l kontinye mache menm lè gen pann kouran, koupe entènèt oswa lòt gwo difikilte.
                    
                    - Sekirite enfòmatik (Cybersécurité) : Tout mwayen ak pratik ki la pou pwoteje aparèy, rezo ak done kont vòl, pirataj ak move zak.
                    
                    - Souverènte nimerik : Dwa ak kapasite yon pèp genyen pou l metrize pwòp zouti teknolojik li, done li, lojisyèl li ak rezo li san li pa depann sèlman sou lòt nasyon.
                """.trimIndent(),
                plannedStartPage = 217,
                plannedEndPage = 218,
                estimatedReadMinutes = 4,
                status = BookContentStatus.AVAILABLE
            )
        )
    )
}

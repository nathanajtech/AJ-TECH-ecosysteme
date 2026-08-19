# AJ-TECH — L'Écosystème Numérique Haïtien
### *« Vision, Technologie et Avenir » — L’innovation haïtienne au service du monde*

---

## 🏛️ À Propos d'AJ-TECH

Fondée en 2025 à Port-au-Prince (Haïti) par **Jonathan GERMAIN**, **AJ-TECH** est une entreprise technologique dédiée à l'édification d'un écosystème numérique souverain, résilient et adapté aux réalités d'Haïti et de sa diaspora.

Cette application Android officielle sert de **hub interactif, d'encyclopédie technique et d'ouvrage compagnon** pour explorer les piliers, les technologies et la vision stratégique d'AJ-TECH à l'horizon 2035.

---

## 🚀 Fonctionnalités Clés de l'Application

### 1. Hub Central & Couverture Dynamique
- **Interface M3 immersive** : Palette chromatique identitaire (Bleu Nuit `#0B1220`, Bleu Électrique `#0066FF`, Rouge Haïtien `#D32F2F`, Or `#D4AF37`).
- **Canvas Écosystème Réactif** : Visualisation nodale interactive (`TechEcosystemCanvas`) avec rendu direct zéro allocation à 60/120 FPS.

### 2. Répertoire Exhaustif des 21 Entités Technologiques
Chaque entité de l'écosystème fait l'objet d'une fiche technique normalisée selon **18 rubriques éditoriales et architecturales** :
1. **Nom Officiel**
2. **Statut de Réalisation** (🟢 Opérationnel, 🟡 En Développement, 🔵 Concept, ⚪ Planifié)
3. **Origine du Projet**
4. **Mission Fondamentale**
5. **Vision Stratégique**
6. **Problème Résolu dans le Contexte Haïtien**
7. **Solution Technologique Proposée**
8. **Public Cible & Utilisateurs**
9. **Fonctionnalités Clés (PWA / Offline-First / Cloud)**
10. **Architecture Système & Stack Logiciel**
11. **Technologies Utilisées** (Kotlin, Jetpack Compose, Moshi, Node, Web APIs)
12. **Rôle de l'Intelligence Artificielle** (Modèles Gemini, NLP Kreyòl, Vision)
13. **Sécurité & Protection des Données**
14. **Modèle Économique & Viabilité**
15. **Intégration au Hub Central AJ-TECH**
16. **Interconnexion avec les Autres Entités**
17. **Feuille de Route & Jalons de Déploiement**
18. **Perspectives Internationales & Diaspora**

### 3. Livre Compagnon Officiel Bilingue (FR / HT)
- **Table des matières structurée** en 4 grandes sections et chapitres complets.
- **Bilinguisme intégral instantané** : Français et Kreyòl Ayisyen.
- **Moteur de recherche plein texte** temps réel dans l'ouvrage.
- **Gestion des signets (Bookmarks)** et progression de lecture.
- **Partage natif d'extraits** via le système Android (`Intent.ACTION_SEND`).
- **Personnalisation ergonomique** : Taille de police dynamique et mode sombre calibré.

### 4. Vision 2035 & Manifeste
- **7 Piliers Stratégiques 2035** : Infrastructure, Énergie, Identité, IA Kreyòl, Inclusion Financière, Gouvernance, Rayonnement.
- **Manifeste pour la Souveraineté Numérique** : 8 articles fondateurs pour l'émancipation technologique d'Haïti.

---

## 🛠️ Architecture & Stack Technique

- **Langage** : Kotlin 100%
- **Interface Utilisateur** : Jetpack Compose + Material Design 3 (Edge-to-Edge natif)
- **Architecture** : Clean Architecture & MVVM (Model-View-ViewModel)
- **Namespace & Application ID** : `com.aistudio.ajtech.ecosystem`
- **Persistance Locale** : Room Database + Kotlin Coroutines & Flow
- **Tests Automatisés** : Robolectric (tests JVM des Critical User Journeys) & Roborazzi (tests de régression visuelle)

---

## 🧪 Parcours Critiques Validés par Tests Automatisés

La suite de tests automatisés (`CriticalJourneysRobolectricTest.kt`) valide de bout en bout les deux flux d'utilisation majeurs :

1. **Parcours 1 — Écosystème & Fiches Normalisées** :
   ```
   Accueil → Navigation Écosystème → Recherche dynamique → Fiche 18 Rubriques → Bascule Bilingue FR / HT → Retour
   ```
2. **Parcours 2 — Livre Compagnon & Outils de Lecture** :
   ```
   Accueil → Navigation Livre → Sélection Sommaire → Bascule Bilingue FR / HT → Recherche Plein Texte → Signet → Navigation Suivant/Précédent → Partage Natif
   ```

---

## 📋 Commandes de Compilation et de Test

```bash
# Compilation complète de l'application
gradle assembleDebug

# Exécution des tests unitaires et tests de parcours UI Robolectric
gradle :app:testDebugUnitTest

# Enregistrement des captures de référence Roborazzi
gradle :app:recordRoborazziDebug

# Vérification des captures d'écran visuelles
gradle :app:verifyRoborazziDebug
```

---

## 📄 Licence et Droits

© 2025–2026 **AJ-TECH** • Jonathan GERMAIN. Tous droits réservés.
*Pour la souveraineté numérique et le progrès technologique d'Haïti.*

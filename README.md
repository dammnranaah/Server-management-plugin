---

# 🛡️ Server Management Plugin

[![Minecraft Version](https://img.shields.io/badge/Minecraft-1.8.8%2B-blue)](https://www.minecraft.net/)
[![Spigot](https://img.shields.io/badge/Spigot-Compatible-green)](https://www.spigotmc.org/)

A lightweight Minecraft plugin that provides **essential server administration tools** without heavy dependencies or GUI clutter. Perfect for admins and moderators who need **quick control over the server** and players.

---

## ✨ Features

### **Player/Admin Tools**

* **Vanish Mode** → `/vanish` lets admins become invisible to players.
* **Freeze Players** → `/freeze <player>` stops movement temporarily.
* **Kick/Ban** → Lightweight commands to remove disruptive players.
* **Broadcast Messages** → Send server-wide announcements easily.
* **MOTD** → Display a custom message when players join.

### **Admin Commands**

| Command                   | Description                 | Permission               |
| ------------------------- | --------------------------- | ------------------------ |
| `/vanish`                 | Toggle invisible mode       | `server.admin.vanish`    |
| `/freeze <player>`        | Freeze or unfreeze a player | `server.admin.freeze`    |
| `/kick <player> [reason]` | Kick a player               | `server.admin.kick`      |
| `/ban <player> [reason]`  | Ban a player                | `server.admin.ban`       |
| `/broadcast <message>`    | Send a global message       | `server.admin.broadcast` |
| `/motd`                   | Show custom join message    | `server.admin.motd`      |

---

## ⚙️ Configuration

Example `config.yml`:

```yaml
motd: "&6Welcome to &bMyServer&6! Enjoy your stay."
vanish:
  hidden_from: ["all"] # or specify groups
freeze:
  duration: 0 # default is unlimited until /unfreeze
broadcast:
  prefix: "&e[Server]"
```

---

## 🛠️ Project Structure

```
ServerManagement/
 ├── build.gradle
 ├── settings.gradle
 ├── src/main/java/com/dammnranaah/servermanagement/
 │   ├── ServerManagementPlugin.java
 │   ├── commands/
 │   │   ├── VanishCommand.java
 │   │   ├── FreezeCommand.java
 │   │   ├── KickCommand.java
 │   │   ├── BanCommand.java
 │   │   ├── BroadcastCommand.java
 │   │   └── MotdCommand.java
 │   └── managers/
 │       ├── PlayerManager.java
 │       └── MessageManager.java
 └── src/main/resources/
     ├── plugin.yml
     └── config.yml
```

---

## 📌 Why Use This Plugin?

* Gives admins **full control** without relying on heavy suites like EssentialsX.
* Lightweight → minimal CPU & memory usage.
* Fully configurable → adapt to your server style.
* Perfect for **moderation, events, and player management**.

---

## 📄 License

MIT License © dammnranaah

---

If you want, I can also make a **ready-to-use AI prompt** to generate this **Server Management Plugin skeleton** with all commands, permission nodes, and config system so you can start coding instantly.

Do you want me to do that?

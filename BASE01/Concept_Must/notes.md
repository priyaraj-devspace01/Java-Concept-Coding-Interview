# Notes to Mark
## to hide the byte code (.class files)

```java
mkdir -p .vscode && cat > .vscode/settings.json <<'EOF'
{
    "files.exclude": {
        "**/*.class": true
    }
}
EOF
```
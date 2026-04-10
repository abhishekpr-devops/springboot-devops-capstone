# Spring Boot DevOps Capstone

A portfolio-grade end-to-end DevOps project built around a containerized Spring Boot REST API with PostgreSQL, Nginx, GitHub Actions CI/CD, SonarQube scan, Terraform on AWS, HTTPS, monitoring, logging, and production-style operational practices.

## Planned Architecture

- Spring Boot REST API
- PostgreSQL database
- Nginx reverse proxy
- Docker and Docker Compose
- GitHub Actions CI/CD
- SonarQube code quality scan
- Terraform for AWS infrastructure
- EC2 deployment
- Domain/subdomain with SSL
- Monitoring with Prometheus + Grafana
- Logging with Loki + Promtail
- Backup, rollback, troubleshooting, and documentation

## Repository Structure

app/            # application-related code and db assets
docker/         # compose and container-related files
nginx/          # reverse proxy config
terraform/      # infrastructure as code
monitoring/     # prometheus, grafana, loki configs
scripts/        # helper scripts for build/deploy/backup/rollback
docs/           # architecture, runbooks, troubleshooting docs
.github/        # CI/CD workflows

## Branch Strategy

- main -> production-ready code
- develop -> integration branch
- feature/* -> feature work
- hotfix/* -> production fixes

## Status

Step 1 complete: repository foundation and architecture setup in progress.

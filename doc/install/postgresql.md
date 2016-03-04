# Create Postgres user and databases

Setup
-----

```sh
sudo su - postgres
createuser -d -P -U postgres chouette
Enter password for new role: chouette
Enter it again: chouette
psql -c "ALTER USER chouette SUPERUSER" 
createdb -O chouette cvdtc_iev
```

For installation from sources :

Create test and development databases
```sh
createdb -E UTF-8 -T template1 chouette_test
```


// PostgreSQL Database Connection

const { Pool } = require('pg'); // destructuring 
const pool = new Pool({
    user: 'postgres',
    host: 'localhost',
    database: 'db',
    password: '2002',
    port: 5432
});
module.exports=pool;


const express = require('express');

const cors = require('cors');  

const pool = require("./db")

const port = 3000
const app = express();

app.use(express.json());
app.use(cors());



// Get all tasks

app.get("/getalltask", async (req, res) => {     
    try{
        const result = await pool.query('SELECT * FROM todo');
    res.json(result.rows);
    }
    catch{
        res.json({status:"error", error: err.message})
    }
});
// Add a new taskd

app.post("/addtask", async (req, res) => {
    try{
        const addtask = req.body.task;
    const result = await pool.query('INSERT INTO todo (task) VALUES ($1) RETURNING *', [addtask]);
    res.json({ message: 'Task added'});
    }
    catch{
        res.json({status:"error", error: err.message})
    }
});

// Markasread 

app.put('/markasread', async (req,res) => 
{
    
    try{
        const id = req.body.id;
        
        let qry = 'UPDATE todo SET status = true WHERE id = $1';

        await pool.query(qry,[id]);

        res.json({Message:'task updtated'});

    }
    catch
    {
        res.json({status:"error", error: err.message})

    }

});

// Delete a task

app.delete("/Delete", async (req, res) => {
    try{
        const taskId = req.body.id;
    await pool.query('DELETE FROM todo WHERE id = $1', [taskId]);
    res.json({ message: 'Task deleted' });
    }
    catch{
        res.json({status:"error", error: err.message})
    }
});

app.listen(3000, () => {
    console.log('Server running on the port 3000');
});

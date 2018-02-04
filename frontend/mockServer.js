const express=require("express");
const app=express();
const jsonServer = require('json-server');

const PORT = process.argv[2]||8082;
const DIST_DIR = "target/dist/";
const INDEX_LOCATION = DIST_DIR.concat("index.html");

const JSON_DB="db.json";

/*serving static files*/
app.use(express.static(DIST_DIR));

/*api mocking section*/
app.get("/api/profile",(req,res)=>{
  res.json({
    title:"example of mock"
  });
});

/*serving index html page*/
app.get("/",(req,res)=>{
  res.sendFile(__dirname.concat("/",INDEX_LOCATION));
});

/*mocking api for DB*/
app.use("/api",jsonServer.router(JSON_DB));

/*starting server*/
app.listen(PORT,(err)=>{
  if(err)
    console.error(err);
  else
    console.log(`Server running at ${PORT}`)
});

$x=Get-Content C:\users\wrl123u\Documents\list.txt
foreach($i in $x){
$qoute='"'
$comma=','
Write-host "$($i.Substring(0,1))$qoute$($i.substring(1,10))$qoute$comma$qoute$($i.substring(13,03))$qoute$comma$($i.Substring(16,$i.Substring(16).indexOf(',')))"



}

$y=Import-Csv 'C:\users\wrl123u\Downloads\CarsFinal.csv'

foreach($i in $y){
$qoute="'"
$comma=','
$par='('
$parc=')'
Write-Output "$par$qoute$($i.VIN)$qoute$comma$qoute$($i.Location_ID)$qoute$comma$qoute$($i.Make.Trim())$qoute$comma$qoute$($i.Model)$qoute$comma$($i.Rent)$comma$($i.Year)$parc$comma"
}
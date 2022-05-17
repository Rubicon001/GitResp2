<#assign ctx="${springMacroRequestContext.getContextPath()}">

<!DOCTYPE html>
<html dir="ltr" lang="zh">
<head>
    <title>dictType</title>
</head>
<body>
<#list data as item>
    <div>${item.name}</div>
    <div>${item.value}</div>
    <div>${item.intro}</div>
    <div>----------------------------------------------------------</div>
</#list>

</body>

</html>
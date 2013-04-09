<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet exclude-result-prefixes="xalan xsi" version="1.0"
    xmlns:xalan="http://xml.apache.org/xslt"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:output encoding="ISO-8859-1" indent="yes" method="xml"/>

<xsl:strip-space elements="*"/>

<xsl:template match="node()|@*">
     <xsl:copy>
       <xsl:apply-templates select="node()|@*"/>
     </xsl:copy>
</xsl:template>

</xsl:stylesheet>
package com.example.jetbrains.selenide.suite;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("com.example.jetbrains.selenide.tests")
@IncludeTags("1")
public class MetaProgrammingSystemSuite {
}


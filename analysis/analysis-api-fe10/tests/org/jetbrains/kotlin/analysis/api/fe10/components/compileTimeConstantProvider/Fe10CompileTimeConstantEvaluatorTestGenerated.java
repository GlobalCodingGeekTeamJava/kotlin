/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fe10.components.compileTimeConstantProvider;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.impl.barebone.test.FrontendApiTestConfiguratorService;
import org.jetbrains.kotlin.analysis.api.descriptors.test.KtFe10FrontendApiTestConfiguratorService;
import org.jetbrains.kotlin.analysis.api.impl.base.test.components.compileTimeConstantProvider.AbstractCompileTimeConstantEvaluatorTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link GenerateNewCompilerTests.kt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/compileTimeConstantProvider/evaluate")
@TestDataPath("$PROJECT_ROOT")
public class Fe10CompileTimeConstantEvaluatorTestGenerated extends AbstractCompileTimeConstantEvaluatorTest {
    @NotNull
    @Override
    public FrontendApiTestConfiguratorService getConfigurator() {
        return KtFe10FrontendApiTestConfiguratorService.INSTANCE;
    }

    @Test
    public void testAllFilesPresentInEvaluate() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/compileTimeConstantProvider/evaluate"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("binaryExpressionWithString.kt")
    public void testBinaryExpressionWithString() throws Exception {
        runTest("analysis/analysis-api/testData/components/compileTimeConstantProvider/evaluate/binaryExpressionWithString.kt");
    }

    @Test
    @TestMetadata("namedReference_const.kt")
    public void testNamedReference_const() throws Exception {
        runTest("analysis/analysis-api/testData/components/compileTimeConstantProvider/evaluate/namedReference_const.kt");
    }

    @Test
    @TestMetadata("namedReference_val.kt")
    public void testNamedReference_val() throws Exception {
        runTest("analysis/analysis-api/testData/components/compileTimeConstantProvider/evaluate/namedReference_val.kt");
    }

    @Test
    @TestMetadata("namedReference_var.kt")
    public void testNamedReference_var() throws Exception {
        runTest("analysis/analysis-api/testData/components/compileTimeConstantProvider/evaluate/namedReference_var.kt");
    }

    @Test
    @TestMetadata("propertyInCompanionObject.kt")
    public void testPropertyInCompanionObject() throws Exception {
        runTest("analysis/analysis-api/testData/components/compileTimeConstantProvider/evaluate/propertyInCompanionObject.kt");
    }

    @Test
    @TestMetadata("propertyInCompanionObject_indirect.kt")
    public void testPropertyInCompanionObject_indirect() throws Exception {
        runTest("analysis/analysis-api/testData/components/compileTimeConstantProvider/evaluate/propertyInCompanionObject_indirect.kt");
    }

    @Test
    @TestMetadata("propertyInCompanionObject_indirect_twice.kt")
    public void testPropertyInCompanionObject_indirect_twice() throws Exception {
        runTest("analysis/analysis-api/testData/components/compileTimeConstantProvider/evaluate/propertyInCompanionObject_indirect_twice.kt");
    }

    @Test
    @TestMetadata("propertyInit_Byte.kt")
    public void testPropertyInit_Byte() throws Exception {
        runTest("analysis/analysis-api/testData/components/compileTimeConstantProvider/evaluate/propertyInit_Byte.kt");
    }

    @Test
    @TestMetadata("propertyInit_DivByZero.kt")
    public void testPropertyInit_DivByZero() throws Exception {
        runTest("analysis/analysis-api/testData/components/compileTimeConstantProvider/evaluate/propertyInit_DivByZero.kt");
    }

    @Test
    @TestMetadata("propertyInit_Double.kt")
    public void testPropertyInit_Double() throws Exception {
        runTest("analysis/analysis-api/testData/components/compileTimeConstantProvider/evaluate/propertyInit_Double.kt");
    }

    @Test
    @TestMetadata("propertyInit_Float.kt")
    public void testPropertyInit_Float() throws Exception {
        runTest("analysis/analysis-api/testData/components/compileTimeConstantProvider/evaluate/propertyInit_Float.kt");
    }

    @Test
    @TestMetadata("propertyInit_Int.kt")
    public void testPropertyInit_Int() throws Exception {
        runTest("analysis/analysis-api/testData/components/compileTimeConstantProvider/evaluate/propertyInit_Int.kt");
    }

    @Test
    @TestMetadata("propertyInit_Long.kt")
    public void testPropertyInit_Long() throws Exception {
        runTest("analysis/analysis-api/testData/components/compileTimeConstantProvider/evaluate/propertyInit_Long.kt");
    }

    @Test
    @TestMetadata("propertyInit_UInt.kt")
    public void testPropertyInit_UInt() throws Exception {
        runTest("analysis/analysis-api/testData/components/compileTimeConstantProvider/evaluate/propertyInit_UInt.kt");
    }

    @Test
    @TestMetadata("stringLiteral.kt")
    public void testStringLiteral() throws Exception {
        runTest("analysis/analysis-api/testData/components/compileTimeConstantProvider/evaluate/stringLiteral.kt");
    }
}

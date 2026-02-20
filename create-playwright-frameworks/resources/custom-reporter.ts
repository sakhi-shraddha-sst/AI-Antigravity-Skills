import { Reporter, TestCase, TestResult, FullResult } from '@playwright/test/reporter';

class MyReporter implements Reporter {
    onBegin(config: any, suite: any) {
        console.log(`🚀 Starting the suite with ${suite.allTests().length} tests`);
    }

    onTestBegin(test: TestCase) {
        console.log(`🧪 Running test: ${test.title}`);
    }

    onTestEnd(test: TestCase, result: TestResult) {
        const status = result.status === 'passed' ? '✅' : '❌';
        console.log(`${status} Finished test ${test.title}: ${result.status}`);
    }

    async onEnd(result: FullResult) {
        console.log(`🏁 Finished the run: ${result.status}`);
    }
}

export default MyReporter;

import { Page, Locator } from '@playwright/test';

export class BasePage {
    readonly page: Page;

    constructor(page: Page) {
        this.page = page;
    }

    async navigate(path: string = '/') {
        await this.page.goto(path);
    }

    async click(locator: Locator) {
        await locator.waitFor({ state: 'visible' });
        await locator.click();
    }

    async type(locator: Locator, text: string) {
        await locator.waitFor({ state: 'visible' });
        await locator.fill(text);
    }
}

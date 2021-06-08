package interfaceDemo;

public class StackInterface {
    interface Push {
        void push();
    }

    interface Pop {
        void pop();

        interface Peak {
            void peak();
        }
    }
}

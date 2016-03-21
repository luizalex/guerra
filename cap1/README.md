
**As principais diferenças entre a modelagem feita em sala de aula com a implementação:**

1. `Event` class

Esta classe foi modificada para existir várias classes que implementam a interface `IEvent` em vez de ser uma classe única.

2. `IGenerator` class

Esta classe possui somente um método, `setDispatcher`.

3. `AbstractGenerator` class

Esta classe não existia na modelagem, ela serve como base para implementação das classes geradoras de eventos.

4. `IReceiver` class

Esta classe e suas derivadas não sofreram alteração, foram implementadas como modeladas.

5. `Dispatcher` class

Esta classe não existia na modelagem e foi criada para servir de 'ponte' entre os geradores e receptores.



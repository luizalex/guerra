
**As principais diferenças entre a modelagem feita em sala de aula com a implementação:**

- `Event` class

Esta classe foi modificada para existir várias classes que implementam a interface `IEvent` em vez de ser uma classe única.

- `IGenerator` class

Esta classe possui somente um método, `setDispatcher`.

- `AbstractGenerator` class

Esta classe não existia na modelagem, ela serve como base para implementação das classes geradoras de eventos.

- `IReceiver` class

Esta classe e suas derivadas não sofreram alteração, foram implementadas como modeladas.

- `Dispatcher` class

Esta classe não existia na modelagem e foi criada para servir de *ponte* entre os geradores e receptores.



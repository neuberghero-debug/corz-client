package gg.corz;

import java.util.Set;

public record liiililiiiilil(long id, long ownerKey, llliillilliill state, int openedTick, Set<Long> cells, Set<Long> servedTargets) {
   private final Set<Long> iiiIIiIliIIIlIiIli;
   private final Set<Long> lIIlIiIliiIIlIiIli;
   private final llliillilliill lliIIiIliiliIIiIli;
   private final long IIiIIiIlilIiIIiIli;
   private final int IiiIIiIliliiIIiIli;
   private final long iIiIIiIliIliIIiIli;

   public liiililiiiilil(long id, long ownerKey, llliillilliill state, int openedTick, Set<Long> cells, Set<Long> servedTargets) {
      this.IIiIIiIlilIiIIiIli = id;
      this.iIiIIiIliIliIIiIli = ownerKey;
      this.lliIIiIliiliIIiIli = state;
      this.IiiIIiIliliiIIiIli = openedTick;
      this.iiiIIiIliIIIlIiIli = cells;
      this.lIIlIiIliiIIlIiIli = servedTargets;
   }

   public int IilliliilIIi() {
      return this.IiiIIiIliliiIIiIli;
   }

   public long liiiIIllIl() {
      return this.iIiIIiIliIliIIiIli;
   }

   public llliillilliill iIlIlllllill() {
      return this.lliIIiIliiliIIiIli;
   }

   public Set<Long> iliIiiliiiii() {
      return this.lIIlIiIliiIIlIiIli;
   }

   public long IliIlllilIi() {
      return this.IIiIIiIlilIiIIiIli;
   }

   public Set<Long> lIiiIiIlilli() {
      return this.iiiIIiIliIIIlIiIli;
   }
}

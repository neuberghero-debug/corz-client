package gg.corz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public final class IIillIillIillIil {
   private int IIIliIlIil;
   private final PriorityQueue<Long> liiIiIlIil = new PriorityQueue<>(this::IliIlllilIi);
   private int lIIliIlIil;
   private final Set<Long> iiiIiIlIil = new HashSet<>();

   public Long iliIiiliiiii() {
      Long var1 = this.liiIiIlIil.poll();
      if (var1 != null) {
         this.iiiIiIlIil.remove(var1);
      }

      return var1;
   }

   public void IiIlliIliiIl() {
      this.liiIiIlIil.clear();
      this.iiiIiIlIil.clear();
   }

   public boolean liiiIIllIl(long chunkKey) {
      if (!this.iiiIiIlIil.add(chunkKey)) {
         return false;
      } else {
         this.liiIiIlIil.add(chunkKey);
         return true;
      }
   }

   public boolean IilliliilIIi(long chunkKey) {
      return this.iiiIiIlIil.contains(chunkKey);
   }

   private int IliIlllilIi(Long b, Long a) {
      return Long.compare(
         iIiIiiIlIliIiiIl.IiIlliIliiIl(b, this.IIIliIlIil, this.lIIliIlIil), iIiIiiIlIliIiiIl.IiIlliIliiIl(a, this.IIIliIlIil, this.lIIliIlIil)
      );
   }

   public boolean IlIlllIlilIl() {
      return this.liiIiIlIil.isEmpty();
   }

   public int IIIllIIliIIl() {
      return this.liiIiIlIil.size();
   }

   public boolean iIlIlllllill(long chunkKey) {
      if (!this.iiiIiIlIil.remove(chunkKey)) {
         return false;
      } else {
         this.liiIiIlIil.remove(chunkKey);
         return true;
      }
   }

   public void lIiiIiIlilli(int chunkX, int chunkZ) {
      if (chunkX != this.IIIliIlIil || chunkZ != this.lIIliIlIil) {
         this.IIIliIlIil = chunkX;
         this.lIIliIlIil = chunkZ;
         if (this.liiIiIlIil.size() > 1) {
            ArrayList var3 = new ArrayList<>(this.liiIiIlIil);
            this.liiIiIlIil.clear();
            this.liiIiIlIil.addAll(var3);
         }
      }
   }
}

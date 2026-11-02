package gg.corz;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.minecraft.class_2338;

public final class iiIIlIiIIlIlIi {
   private final ArrayDeque<IIlilllIlill> lIIiiIIiiiIIiiIIii;
   public static final int lliliIIiiililiIIii = 8;
   private long IlIiiIIiillIiiIIii;
   private final Set<class_2338> iiiliIIiiIIIiiIIii;
   public static final int IIiliIIiilIiliIIii = 60;
   public static final int iIiliIIiiIliliIIii = 40;
   private final Map<Integer, iliIiIIiIiiIiIIi> IiiliIIiiliiliIIii = new HashMap<>();

   public List<IIlilllIlill> Iilllilliill() {
      return new ArrayList<>(this.lIIiiIIiiiIIiiIIii);
   }

   public long IIillIiliIil() {
      return this.IlIiiIIiillIiiIIii;
   }

   public Set<class_2338> iIlIlllllill() {
      return Set.copyOf(this.iiiliIIiiIIIiiIIii);
   }

   public iliIiIIiIiiIiIIi iliIiiliiiii(int breakerId) {
      return this.IiiliIIiiliiliIIii.get(breakerId);
   }

   public boolean liiiIIllIl(class_2338 p) {
      return p != null && this.iiiliIIiiIIIiiIIii.contains(p);
   }

   public IIlilllIlill IIlllIlliIll() {
      return this.lIIiiIIiiiIIiiIIii.peekLast();
   }

   public iiIIlIiIIlIlIi() {
      this.iiiliIIiiIIIiiIIii = new HashSet<>();
      this.lIIiiIIiiiIIiiIIii = new ArrayDeque<>();
      this.IlIiiIIiillIiiIIii = Long.MIN_VALUE;
   }

   public iliIiIIiIiiIiIIi IlIlllIlilIl() {
      iliIiIIiIiiIiIIi var1 = null;

      for (iliIiIIiIiiIiIIi var3 : this.IiiliIIiiliiliIIii.values()) {
         if (this.iiiliIIiiIIIiiIIii.contains(var3.liiiIIllIl()) && (var1 == null || var3.lIiiIiIlilli() > var1.lIiiIiIlilli())) {
            var1 = var3;
         }
      }

      return var1;
   }

   public void IliIlllilIi(Collection<class_2338> walls) {
      this.iiiliIIiiIIIiiIIii.clear();
      if (walls != null) {
         for (class_2338 var3 : walls) {
            if (var3 != null) {
               this.iiiliIIiiIIIiiIIii.add(var3.method_10062());
            }
         }
      }
   }

   public int Iiilliiliiil() {
      return this.IiiliIIiiliiliIIii.size();
   }

   public void IIIilIIiiIIi() {
      this.IiiliIIiiliiliIIii.clear();
      this.iiiliIIiiIIIiiIIii.clear();
      this.lIIiiIIiiiIIiiIIii.clear();
      this.IlIiiIIiillIiiIIii = Long.MIN_VALUE;
   }

   public static int IiIlliIliiIl(int stage, int fullTicks) {
      return IIiiililIiiili.IlIlllIlilIl(stage, fullTicks);
   }

   public IIlilllIlill Illlllllilll(long tick, int ticks) {
      IIlilllIlill var4 = this.lIIiiIIiiiIIiiIIii.peekLast();
      return var4 != null && tick - var4.liiiIIllIl() <= (long)ticks ? var4 : null;
   }

   public boolean lIiiIiIlilli(class_2338 tick, boolean pos, long air) {
      if (tick != null && pos && this.iiiliIIiiIIIiiIIii.contains(tick)) {
         for (IIlilllIlill var6 : this.lIIiiIIiiiIIiiIIii) {
            if (var6.IliIlllilIi().equals(tick)) {
               return false;
            }
         }

         this.lIIiiIIiiiIIiiIIii.addLast(new IIlilllIlill(tick.method_10062(), air));

         while (this.lIIiiIIiiiIIiiIIii.size() > 8) {
            this.lIIiiIIiiiIIiiIIii.removeFirst();
         }

         this.IlIiiIIiillIiiIIii = air;
         Iterator var7 = this.IiiliIIiiliiliIIii.entrySet().iterator();

         while (var7.hasNext()) {
            if (((iliIiIIiIiiIiIIi)((Entry)var7.next()).getValue()).liiiIIllIl().equals(tick)) {
               var7.remove();
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public void IilliliilIIi(int breakerId, class_2338 pos, int stage, long tick) {
      if (pos != null) {
         if (stage >= 0 && stage <= 9) {
            iliIiIIiIiiIiIIi var9 = this.IiiliIIiiliiliIIii.get(breakerId);
            long var7 = var9 != null && var9.liiiIIllIl().equals(pos) ? var9.IilliliilIIi() : tick;
            this.IiiliIIiiliiliIIii.put(breakerId, new iliIiIIiIiiIiIIi(breakerId, pos.method_10062(), stage, var7, tick));
         } else {
            iliIiIIiIiiIiIIi var6 = this.IiiliIIiiliiliIIii.get(breakerId);
            if (var6 != null && var6.liiiIIllIl().equals(pos)) {
               this.IiiliIIiiliiliIIii.remove(breakerId);
            }
         }
      }
   }

   public iliIiIIiIiiIiIIi IIIllIIliIIl(class_2338 pos) {
      if (pos == null) {
         return null;
      } else {
         for (iliIiIIiIiiIiIIi var3 : this.IiiliIIiiliiliIIii.values()) {
            if (var3.liiiIIllIl().equals(pos)) {
               return var3;
            }
         }

         return null;
      }
   }

   public void Ililllililil(long tick) {
      this.IiiliIIiiliiliIIii.values().removeIf(tickx -> tick - tickx.lIiiIiIlilli() > 60L);

      while (!this.lIIiiIIiiiIIiiIIii.isEmpty() && tick - this.lIIiiIIiiiIIiiIIii.peekFirst().liiiIIllIl() > 40L) {
         this.lIIiiIIiiiIIiiIIii.removeFirst();
      }
   }
}

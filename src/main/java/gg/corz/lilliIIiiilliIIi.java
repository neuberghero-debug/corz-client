package gg.corz;

import java.util.List;

public record lilliIIiiilliIIi(liilllIliiilllIl kind, List<lilIlilliilIlill> members, int axis, int direction, int laneY, int rowY, long laneStart, long laneEnd) {
   private final int lliIiliiil;
   private final int IiiIiliiil;
   private final List<lilIlilliilIlill> IliIiliiil;
   private final liilllIliiilllIl iIiIiliiil;
   private final int liiIiliiil;
   private final int iliIiliiil;
   private final long iiiIiliiil;
   private final long IIIliliiil;

   public List<lilIlilliilIlill> iliIiiliiiii() {
      return this.IliIiliiil;
   }

   public int IiIlliIliiIl() {
      return this.IiiIiliiil;
   }

   public int IIlllIlliIll() {
      return this.liiIiliiil;
   }

   public int IlIlllIlilIl() {
      return this.iliIiliiil;
   }

   public int IliIlllilIi() {
      return this.IliIiliiil.size();
   }

   public long liiiIIllIl() {
      return this.IliIiliiil.isEmpty()
         ? 0L
         : this.IliIiliiil.get(0).IliIlllilIi() ^ Long.rotateLeft(this.IliIiliiil.get(this.IliIiliiil.size() - 1).IliIlllilIi(), 31);
   }

   public int iIlIlllllill() {
      long var4 = -4262367033683933523L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (lilIlilliilIlill var3 : this.IliIiliiil) {
         if (var3.iliIiiliiiii()) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   public long Iilllilliill() {
      return this.IIIliliiil;
   }

   public int IilliliilIIi() {
      long var4 = 3908404372927305656L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (lilIlilliilIlill var3 : this.IliIiliiil) {
         if (var3.IIIllIIliIIl()) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   public int IIIllIIliIIl() {
      return this.lliIiliiil;
   }

   public long Illlllllilll() {
      return this.iiiIiliiil;
   }

   public lilliIIiiilliIIi(liilllIliiilllIl kind, List<lilIlilliilIlill> members, int axis, int direction, int laneY, int rowY, long laneStart, long laneEnd) {
      this.iIiIiliiil = kind;
      this.IliIiliiil = members;
      this.lliIiliiil = axis;
      this.iliIiliiil = direction;
      this.IiiIiliiil = laneY;
      this.liiIiliiil = rowY;
      this.iiiIiliiil = laneStart;
      this.IIIliliiil = laneEnd;
   }

   public liilllIliiilllIl lIiiIiIlilli() {
      return this.iIiIiliiil;
   }
}

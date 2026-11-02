package gg.corz;

public final class liIIliIliiIIliIl {
   public final iiIllIilIIlllIil lilliliIll;
   public final float IIIiiliIll;
   public final int lIililiIll;
   public final boolean iIililiIll;
   public final iiIllIilIIlllIil iilliliIll;
   public final float liililiIll;
   public final int llililiIll;
   public final float iiililiIll;
   public final float lIIiiliIll;
   public final int IlililiIll;
   public final Iillililillili IIililiIll;
   public final float IiililiIll;
   public final float iIIiiliIll;
   public final float ilililiIll;
   public final iiIllIilIIlllIil IilliliIll;

   liIIliIliiIIliIl(
      iiIllIilIIlllIil sizeX,
      iiIllIilIIlllIil chest,
      iiIllIilIIlllIil layerBase,
      Iillililillili sizeY,
      int truncated,
      boolean solid,
      int prepared,
      int centerX,
      float blocks,
      float floorY,
      float centerY,
      float layers,
      float sizeZ,
      float translucent,
      float centerZ
   ) {
      this.IilliliIll = sizeX;
      this.lilliliIll = chest;
      this.iilliliIll = layerBase;
      this.IIililiIll = sizeY;
      this.lIililiIll = truncated;
      this.iIililiIll = solid;
      this.IlililiIll = prepared;
      this.llililiIll = centerX;
      this.ilililiIll = blocks;
      this.IiililiIll = floorY;
      this.liililiIll = centerY;
      this.iiililiIll = layers;
      this.IIIiiliIll = sizeZ;
      this.lIIiiliIll = translucent;
      this.iIIiiliIll = centerZ;
   }

   public boolean IliIlllilIi() {
      return this.IilliliIll.IlIlllIlilIl() + this.lilliliIll.IlIlllIlilIl() + this.iilliliIll.IlIlllIlilIl() == 0;
   }

   public int iIlIlllllill(int layer) {
      return layer < 0 ? this.lilliliIll.IlIlllIlilIl() : this.lilliliIll.IIillIiliIil(this.llililiIll + layer);
   }

   public int IilliliilIIi(int layer) {
      return layer < 0 ? this.iilliliIll.IlIlllIlilIl() : this.iilliliIll.IIillIiliIil(this.llililiIll + layer);
   }

   public int liiiIIllIl(int layer) {
      return layer < 0 ? this.IilliliIll.IlIlllIlilIl() : this.IilliliIll.IIillIiliIil(this.llililiIll + layer);
   }
}

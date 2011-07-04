package org.opencv.test;

import java.io.FileOutputStream;

import org.opencv.Mat;
import org.opencv.highgui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.util.Log;


public class highguiTest extends OpenCVTestCase {

	public void testDestroyAllWindows() {
		//XXX: do not export this function
		fail("Do not export this function");
	}
	
	public void testDestroyWindow() {
		//XXX: do not export this function
		fail("Do not export this function");
	}

	public void testGetTrackbarPos() {
		//XXX: do we need this function?
		fail("Not yet implemented");
	}

	public void testGetWindowProperty() {
		//XXX: do we need this function?
		fail("Not yet implemented");
	}

	public void testImdecode() {
		//XXX: do we need this function?
		fail("Not yet implemented");
	}
	
	public void testImreadStringInt() {
		dst_gray = highgui.imread(LENA, 0);
		assertTrue(!dst_gray.empty());
		assertEquals(1, dst_gray.channels());
	}

	public void testImreadString() {		
		dst_gray = highgui.imread(LENA);
		assertTrue(!dst_gray.empty());
		assertEquals(3, dst_gray.channels());
	}

	public void testImshow() {
		fail("Not yet implemented");
	}

	public void testNamedWindowStringInt() {
		//XXX: do not export this function
		fail("Do not export this function");
	}

	public void testNamedWindowString() {
		//XXX: do not export this function
		fail("Do not export this function");
	}

	public void testSetTrackbarPos() {
		//XXX: do we need this function?
		fail("Not yet implemented");
	}

	public void testSetWindowProperty() {
		//XXX: do we need this function?
		fail("Not yet implemented");
	}

	public void testStartWindowThread() {
		//XXX: do not export this function
		fail("Do not export this function");
	}

	public void testWaitKeyInt() {
		//XXX: we need this function if only imshow will be implemented
		fail("Not yet implemented");
	}

	public void testWaitKey() {
		//XXX: we need this function if only imshow will be implemented
		fail("Not yet implemented");
	}

}
